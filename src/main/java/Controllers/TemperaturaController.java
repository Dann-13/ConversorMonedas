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
        } else if (SourceTemp.trim().equalsIgnoreCase("Centigrados ºC") && TargetTemp.trim().equalsIgnoreCase("Centigrados ºC")) {
            resultado = valor;
        }else if (SourceTemp.trim().equalsIgnoreCase("Centigrados ºC") && TargetTemp.trim().equalsIgnoreCase("Kelvin K")){
            resultado = TemperaturaModel.celsiusToKelvin(valor);
        }else if (SourceTemp.trim().equalsIgnoreCase("Centigrados ºC") && TargetTemp.trim().equalsIgnoreCase("Rankine R")){
            resultado = TemperaturaModel.celsiusToRankine(valor);
        }else if (SourceTemp.trim().equalsIgnoreCase("Centigrados ºC") && TargetTemp.trim().equalsIgnoreCase("Reaumur Re")){
            resultado = TemperaturaModel.celsiusToReaumur(valor);
         //Fahrenheit 
        }else if(SourceTemp.trim().equalsIgnoreCase("Fahrenheit ºF") && TargetTemp.trim().equalsIgnoreCase("Fahrenheit ºF")){
            resultado = valor;
        }else if (SourceTemp.trim().equalsIgnoreCase("Fahrenheit ºF") && TargetTemp.trim().equalsIgnoreCase("Centigrados ºC")) {
            resultado = TemperaturaModel.fahrenheitToCelsius(valor);
        }else if (SourceTemp.trim().equalsIgnoreCase("Fahrenheit ºF") && TargetTemp.trim().equalsIgnoreCase("Kelvin K")){
            resultado = TemperaturaModel.fahrenheitToKelvin(valor);
        }else if (SourceTemp.trim().equalsIgnoreCase("Fahrenheit ºF") && TargetTemp.trim().equalsIgnoreCase("Rankine R")){
            resultado = TemperaturaModel.fahrenheitToRankine(valor);
        }else if (SourceTemp.trim().equalsIgnoreCase("Fahrenheit ºF") && TargetTemp.trim().equalsIgnoreCase("Reaumur Re")){
            resultado = TemperaturaModel.fahrenheitToReaumur(valor);
        //Kelvin K"
        }else if(SourceTemp.trim().equalsIgnoreCase("Kelvin K") && TargetTemp.trim().equalsIgnoreCase("Kelvin K")){
            resultado = valor;
        }else if (SourceTemp.trim().equalsIgnoreCase("Kelvin K") && TargetTemp.trim().equalsIgnoreCase("Centigrados ºC")) {
            resultado = TemperaturaModel.kelvinToCelsius(valor);
        }else if (SourceTemp.trim().equalsIgnoreCase("Kelvin K") && TargetTemp.trim().equalsIgnoreCase("Fahrenheit ºF")){
            resultado = TemperaturaModel.kelvinToFahrenheit(valor);
        }else if (SourceTemp.trim().equalsIgnoreCase("Kelvin K") && TargetTemp.trim().equalsIgnoreCase("Rankine R")){
            resultado = TemperaturaModel.kelvinToRankine(valor);
        }else if (SourceTemp.trim().equalsIgnoreCase("Kelvin K") && TargetTemp.trim().equalsIgnoreCase("Reaumur Re")){
            resultado = TemperaturaModel.kelvinToReaumur(valor);
        //Rankine R"
        }
        else if(SourceTemp.trim().equalsIgnoreCase("Rankine R") && TargetTemp.trim().equalsIgnoreCase("Rankine R")){
            resultado = valor;
        }else if (SourceTemp.trim().equalsIgnoreCase("Rankine R") && TargetTemp.trim().equalsIgnoreCase("Centigrados ºC")) {
            resultado = TemperaturaModel.rankineToCelsius(valor);
        }else if (SourceTemp.trim().equalsIgnoreCase("Rankine R") && TargetTemp.trim().equalsIgnoreCase("Fahrenheit ºF")){
            resultado = TemperaturaModel.rankineToFahrenheit(valor);
        }else if (SourceTemp.trim().equalsIgnoreCase("Rankine R") && TargetTemp.trim().equalsIgnoreCase("Kelvin K")){
            resultado = TemperaturaModel.rankineToKelvin(valor);
        }else if (SourceTemp.trim().equalsIgnoreCase("Rankine R") && TargetTemp.trim().equalsIgnoreCase("Reaumur Re")){
            resultado = TemperaturaModel.rankineToReaumur(valor);
        //Reaumur Re"
        }else if(SourceTemp.trim().equalsIgnoreCase("Reaumur Re") && TargetTemp.trim().equalsIgnoreCase("Reaumur Re")){
            resultado = valor;
        }else if (SourceTemp.trim().equalsIgnoreCase("Reaumur Re") && TargetTemp.trim().equalsIgnoreCase("Centigrados ºC")) {
            resultado = TemperaturaModel.reaumurToCelsius(valor);
        }else if (SourceTemp.trim().equalsIgnoreCase("Reaumur Re") && TargetTemp.trim().equalsIgnoreCase("Fahrenheit ºF")){
            resultado = TemperaturaModel.reaumurToFahrenheit(valor);
        }else if (SourceTemp.trim().equalsIgnoreCase("Reaumur Re") && TargetTemp.trim().equalsIgnoreCase("Kelvin K")){
            resultado = TemperaturaModel.rankineToKelvin(valor);
        }else if (SourceTemp.trim().equalsIgnoreCase("Reaumur Re") && TargetTemp.trim().equalsIgnoreCase("Rankine R")){
            resultado = TemperaturaModel.reaumurToRankine(valor);
        
        }
        
        

        return resultado;
    }
}
