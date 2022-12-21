/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.List;

/**
 *
 * @author Daniel
 */
public class ConvercionMoneda {
    private List<TipoCambio> tipoCambio;

    public ConvercionMoneda(List<TipoCambio> tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public double convert(double amount, Moneda source, Moneda target) {
        for (TipoCambio rate : tipoCambio) {
            if (rate.getSource().equals(source) && rate.getTarget().equals(target)) {
                return amount * rate.getRate();
            }
        }
        throw new IllegalArgumentException("No se ha encontrado una tasa de cambio para las monedas especificadas");
    }
}
