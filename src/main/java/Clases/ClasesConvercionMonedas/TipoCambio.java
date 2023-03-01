/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases.ClasesConvercionMonedas;

import Clases.ClasesConvercionMonedas.Moneda;

/**
 *
 * @author Daniel
 */
public class TipoCambio {

    private Moneda source;
    private Moneda target;
    private double rate;

    public TipoCambio(Moneda source, Moneda target, double rate) {
        this.source = source;
        this.target = target;
        this.rate = rate;
    }

    public Moneda getSource() {
        return source;
    }

    public Moneda getTarget() {
        return target;
    }

    public double getRate() {
        return rate;
    }
}
