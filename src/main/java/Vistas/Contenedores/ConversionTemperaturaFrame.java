/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vistas.Contenedores;

import Vistas.PanelesConversion.VistaConversionTemperatura;
import javax.swing.JFrame;

/**
 *
 * @author dan-dev
 */
public class ConversionTemperaturaFrame extends JFrame{
    VistaConversionTemperatura con;
    public ConversionTemperaturaFrame(){
        this.inicializador();
        this.inicializadorObjetos();
    }
    private void inicializador() {
        this.setSize(500, 600);
        this.setTitle("Conversion de Temperatura");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

    }

    private void inicializadorObjetos() {
        con = new VistaConversionTemperatura();
        this.getContentPane().add(con);
    }
}
