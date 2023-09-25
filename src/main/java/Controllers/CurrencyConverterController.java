/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Clases.ClasesConvercionMonedas.CurrencyConverter;
import Exception.CurrencyConversionException;

/**
 *
 * @author dan-dev
 */
public class CurrencyConverterController {
    private CurrencyConverter model;

    public CurrencyConverterController(CurrencyConverter model) {
        this.model = model;
    }

    /**
     * Método para realizar la conversión de moneda.
     *
     * @param baseCurrency   Moneda base
     * @param targetCurrency Moneda de destino
     * @param amount         Cantidad a convertir
     * @return Cantidad convertida
     */
    public double convertCurrency(String baseCurrency, String targetCurrency, double amount) {
        try {
            double convertedAmount = model.convertCurrency(baseCurrency, targetCurrency, amount);
            return convertedAmount;
        } catch (CurrencyConversionException e) {
            // Manejar excepción en caso de error en la conversión
            System.err.println("Error en la conversión: " + e.getMessage());
            return -1.0; // Valor de retorno que indica error
        }
    }
}
