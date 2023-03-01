/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases.ClasesConvercionMonedas;

import java.util.List;

/**
 * Esta clase sirve para hacer la loggica de la conversion
 * @author Daniel
 */
public class ConvercionMoneda {
    private List<TipoCambio> tipoCambio;
    /**
     * El contructor recibira el tipo de cambio enviado por las clases panel PesotoYen, PesotiEuro y PesotoUsd
     *
     * @param tipoCambio 
     */
    public ConvercionMoneda(List<TipoCambio> tipoCambio) {
        this.tipoCambio = tipoCambio;
    }
    /**
     * En este metodo obtendremos el monto, la moneda origen y la moneda destino a la que se quiere convertir
     * 
     * @param amount
     * @param source
     * @param target
     * @return 
     */
    public double convert(double amount, Moneda source, Moneda target) {
        for (TipoCambio rate : tipoCambio) {
            if (rate.getSource().equals(source) && rate.getTarget().equals(target)) {
                return amount * rate.getRate();
            }
        }
        throw new IllegalArgumentException("No se ha encontrado una tasa de cambio para las monedas especificadas");
    }
}
