/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vistas.Contenedores;

import Vistas.PanelesConversion.VistaConversionMoneda;
import javax.swing.JFrame;

/**
 *
 * @author dan-dev
 */
public class ConversionMonedas extends JFrame{
    VistaConversionMoneda con;
    public ConversionMonedas(){
        this.inicializador();
        this.inicializadorObjetos();
    }
    private void inicializador() {
        this.setSize(600, 500);
        this.setTitle("Conversion de Monedas");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

    }

    private void inicializadorObjetos() {
        con = new VistaConversionMoneda();
        this.getContentPane().add(con);
    }
}
