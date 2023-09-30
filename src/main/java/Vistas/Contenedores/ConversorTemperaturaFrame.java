/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vistas.Contenedores;

import Vistas.PanelesConversion.VistaConversionTemperatura;
import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author dan-dev
 */
public class ConversorTemperaturaFrame extends JFrame{
    VistaConversionTemperatura vistaConversionTemperatura;
    public ConversorTemperaturaFrame(){
        this.inicializador();
        this.inicializadorObjetos();
    }
    private void inicializador() {
        this.setSize(500, 500);
        this.setTitle("Conversion de Temperatura");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
    }

    private void inicializadorObjetos() {
        vistaConversionTemperatura = new VistaConversionTemperatura();
        this.setLayout(new BorderLayout());
        this.add(vistaConversionTemperatura, BorderLayout.CENTER);
        this.getContentPane().add(vistaConversionTemperatura);
        

    }
}
