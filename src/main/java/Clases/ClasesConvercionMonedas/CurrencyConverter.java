/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases.ClasesConvercionMonedas;

import CacheConvert.CurrencyRateCache;
import Exception.CurrencyConversionException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import io.github.cdimascio.dotenv.Dotenv;
/**
 *
 * @author dann-dev
 * Clase encargada de conectarse a la api y obtener los valores de cada moneda segun sea el caso, retorna un la conversion
 */
public class CurrencyConverter {

    private CurrencyRateCache rateCache;
    Dotenv dotenv = Dotenv.configure().load();
    String API_KEY = dotenv.get("API_KEY");
    private static final String API_ENDPOINT = "http://data.fixer.io/api/latest";

    public CurrencyConverter() {
        rateCache = new CurrencyRateCache();
    }
   /** 
    * Metodo que recive la moneda base (COP), la moneda de cambio y el monto a comvertir,
    * tiene dos condiciones
    * 1) si la moneda base y la moneda de cambion no se encuentran en el mapa del cache se realizara una soliitud a la Api
    * para obtenerlas y agreagarlas al mapa
    * 2) si los valores de la moneda base y la moneda de cambion se encuentran en el mapa se hace la conversion directamente
    * @param baseCurrency
    * @param targetCurrency
    * @param amount
    * @return Moneda Convertida
    */
    public double convertCurrency(String baseCurrency, String targetCurrency, double amount) {
       
        Double baseRate = rateCache.getRate(baseCurrency);
        Double targetRate = rateCache.getRate(targetCurrency);

        if (baseRate == null || targetRate == null) {
            // Las tasas de cambio no están en el caché, realizar una solicitud a la API
            // y actualizar el caché
            Map<String, Double> rates = fetchLatestRatesFromAPI();
            rateCache.updateRates(rates);
            baseRate = rateCache.getRate(baseCurrency);
            targetRate = rateCache.getRate(targetCurrency);
        }

        if (baseRate != null && targetRate != null) {
            double convertedAmount = amount * (targetRate / baseRate);
            return convertedAmount;
        } else {
            throw new CurrencyConversionException("No se encontró la tasa de cambio para las monedas especificadas.");
        }
    }
    
    /**
     * Metodo que recupera las tasas de cambion de la API Fixer
    */
    private Map<String, Double> fetchLatestRatesFromAPI() {
        try {
            //Url donde se enviara la solicitud GET
            String urlStr = API_ENDPOINT + "?access_key=" + API_KEY;
            System.out.println(urlStr);
            //Se crea un objeto URL con la cadena anterior 
            URL url = new URL(urlStr);
            //Se establece una conexión HTTP 
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            // Se establece el método de solicitud HTTP en "GET"
            connection.setRequestMethod("GET");

            //lo siguiente lee los datos, se almacena cada linea verificando si hay mas lineas por agregar, finalmene se cierra la conexion
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            //Se crea u objeto jsonparser para analizar la respuesta que esta almacenada en sStringBuilder
            //para convertirse en un objeto JSONObject 
            JSONParser parser = new JSONParser();
            JSONObject jsonObject = (JSONObject) parser.parse(response.toString());

            //verificamos si el JSON tiene la claver rate si es asi entra 
            if (jsonObject.containsKey("rates")) {
                JSONObject ratesObject = (JSONObject) jsonObject.get("rates");
                //Guardamos en un HasMap las tasas de cambio, as claves seran los codigos de las monedas "COP" y los valores 
                //seran las tasas de cambion en formato double
                Map<String, Double> rates = new HashMap<>();
                for (Object key : ratesObject.keySet()) {
                    //obtenemos el codigo de la moneda
                    String currencyCode = (String) key;
                    //Obtenemos el valor asociafo a la clave actual del objeto ratesObject
                    Object rateObj = ratesObject.get(key);
                    //variable que contendra la tasa de cambio
                    double rate;
                    //verificamos si el cambio (rate) es de tipo long para cambiarlo a double
                    if (rateObj instanceof Long) {
                        rate = ((Long) rateObj).doubleValue();

                    } else if (rateObj instanceof Double) {
                        rate = (Double) rateObj;
                    } else { //si no es double o long lanzamos la excepcion
                        throw new CurrencyConversionException("Error: formato diferente a Long o Double");

                    }
                    //Se agrega la clave y el valor al mapa rates.
                    rates.put(currencyCode, rate);
                }
                return rates;
            }
        } catch (Exception e) {
            throw new CurrencyConversionException("Error al obtener las tasas de cambio desde la API.", e);
        }
        return Collections.emptyMap();
    }
}
