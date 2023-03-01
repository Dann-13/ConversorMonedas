/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases.ClasesConvercionMonedas;

import java.math.BigDecimal;

/**
 * Clase que creara la moneda con su nombre= name, simbolo symbol, y su codigo isocode
 * contiene metodos get y set
 * @author Daniel
 */
public class Moneda {

    private String name;
    private String symbol;
    private String isoCode;

    public Moneda(String name, String symbol, String isoCode) {
        this.name = name;
        this.symbol = symbol;
        this.isoCode = isoCode;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getIsoCode() {
        return isoCode;
    }

}
