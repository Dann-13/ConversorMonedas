/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vistas.Contenedores;

import Vistas.PanelesConversion.VistaConversionMoneda;
import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author dan-dev
 */
public class ConversorMonedasFrame extends JFrame{
    VistaConversionMoneda vistaConversionMonedas;
    public ConversorMonedasFrame(){
        this.inicializador();
        this.inicializadorObjetos();
    }
    private void inicializador() {
        this.setSize(500, 600);
        this.setTitle("Conversion de Monedas");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
    }

    private void inicializadorObjetos() {
        vistaConversionMonedas = new VistaConversionMoneda();
        this.setLayout(new BorderLayout());
        this.add(vistaConversionMonedas, BorderLayout.CENTER);
        this.getContentPane().add(vistaConversionMonedas);
        

    }
}
