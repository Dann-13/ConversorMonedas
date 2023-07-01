/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases.ClasesConvercionMonedas;

import Exception.CurrencyConversionException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author dann-dev
 */
public class CurrencyConverter {

    private static final String API_KEY = "75abe60c639a6c0dad4cd461fbc3d52f";
    private static final String API_ENDPOINT = "http://data.fixer.io/api/latest";

    public double CurrencyConverter(String baseCurrency, String targetCurrency, double amount) {

        try {
            String urlStr = API_ENDPOINT + "?access_key=" + API_KEY;
            URL url = new URL(urlStr);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            JSONParser parser = new JSONParser();
            JSONObject jsonObject = (JSONObject) parser.parse(response.toString());

            if (jsonObject.containsKey("rates")) {
                JSONObject ratesObject = (JSONObject) jsonObject.get("rates");
                if (ratesObject.containsKey(baseCurrency) && ratesObject.containsKey(targetCurrency)) {
                    double rateBaseToTarget = (double) ratesObject.get(targetCurrency) / (double) ratesObject.get(baseCurrency);
                    double convertedAmount = amount * rateBaseToTarget;
                    return convertedAmount;
                }
            }
            throw new CurrencyConversionException("No se encontró la tasa de cambio para las monedas especificadas.");
        } catch (Exception e) {
            throw new CurrencyConversionException("Error al realizar la conversión de moneda.", e);
        }
    }

}
