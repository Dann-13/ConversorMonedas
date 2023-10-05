/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Model.TemperaturaModel;

/**
 *
 * @author dan-dev
 */
public class TemperaturaController {
    public double convertirTemperatura(double valor, String SourceTemp, String TargetTemp) {
        double resultado = 0.0;
        
        
        if (SourceTemp.trim().equalsIgnoreCase("Centigrados ºC") && TargetTemp.trim().equalsIgnoreCase("Fahrenheit ºF")) {
            resultado = TemperaturaModel.celsiusToFahrenheit(valor);
        } else if (SourceTemp.trim().equalsIgnoreCase("Fahrenheit ºF") && TargetTemp.trim().equalsIgnoreCase("Centigrados ºC")) {
            resultado = TemperaturaModel.fahrenheitToCelsius(valor);
        }

        return resultado;
    }
}
