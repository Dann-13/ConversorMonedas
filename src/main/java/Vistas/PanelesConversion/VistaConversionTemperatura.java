/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vistas.PanelesConversion;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author dan-dev
 */
public class VistaConversionTemperatura extends JPanel {
    JLabel lblCantidad;
    public VistaConversionTemperatura(){
        this.inicializador();
        this.inicializadorObjetos();
    }

    private void inicializador() {
        this.setLayout(new GridLayout(5, 1, 10, 10));
        this.setBackground(Color.red);
    }

    private void inicializadorObjetos() {
        lblCantidad = new JLabel("Cantidad:");
        this.add(lblCantidad);
    }
}
