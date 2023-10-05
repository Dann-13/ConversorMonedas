/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author dan-dev
 */
public class TemperaturaModel {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    public static double fahrenheitToRankine(double f) {
        return f + 459.67;
    } // - fahrenheitToRankine

    public static double fahrenheitToReaumur(double f) {
        return (f - 32)/2.25;
    } // - fahrenheitToReaumur

    public static double fahrenheitToKelvin(double f) {
        return (f + 459.67)/1.8;
    } // - fahrenheitToKelvin
    
    public static double celsiusToKelvin(double c) {
        return fahrenheitToKelvin(celsiusToFahrenheit(c));
    } // - celsiusToKelvin
    
    public static double celsiusToRankine(double c) {
        return fahrenheitToRankine(celsiusToFahrenheit(c));
    } // - celsiusToRankine

    public static double celsiusToReaumur(double c) {
        return fahrenheitToReaumur(celsiusToFahrenheit(c));
    } // - celsiusToReaumur

    public static double kelvinToFahrenheit(double k) {
        return 9*k/5 - 459.67;
    } // - kelvinToFahrenheit

    public static double kelvinToCelsius(double k) {
        return fahrenheitToCelsius(kelvinToFahrenheit(k));
    } // - kelvinToCelsius
    
    public static double kelvinToRankine(double k) {
        return fahrenheitToRankine(kelvinToFahrenheit(k));
    } // - kelvinToRankine
 
    public static double kelvinToReaumur(double k) {
        return fahrenheitToReaumur(kelvinToFahrenheit(k));
    } // - kelvinToReaumur

    public static double rankineToFahrenheit(double ra) {
        return ra - 459.67;
    } // - rankineToFahrenheit

    public static double rankineToCelsius(double ra) {
        return fahrenheitToCelsius(rankineToFahrenheit(ra));
    } // - rankineToCelsius

    public static double rankineToKelvin(double ra) {
        return fahrenheitToKelvin(rankineToFahrenheit(ra));
    } // - rankineToKelvin
    
    public static double rankineToReaumur(double ra) {
        return fahrenheitToReaumur(rankineToFahrenheit(ra));
    } // - rankineToReaumur

    public static double reaumurToFahrenheit(double re) {
        return 2.25*re + 32;
    } // - reaumurToFahrenheit

    public static double reaumurToCelsius(double re) {
        return fahrenheitToCelsius(reaumurToFahrenheit(re));
    } // - reaumurToCelsius

    public static double reaumurToKelvin(double re) {
        return fahrenheitToKelvin(reaumurToFahrenheit(re));
    } // - reaumurToKelvin
    
    public static double reaumurToRankine(double re) {
        return fahrenheitToRankine(reaumurToFahrenheit(re));
    } // - reaumurToRankine

    
    
    
}
