/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Daniel
 */
public class Resultado extends JFrame {
    
    VistaResultado vistaingreso;
    public Resultado() {
        this.inicializador();
        this.inicializadorObjetos();
    }

    private void inicializador() {
        this.setSize(300, 300);
        this.setTitle("Conversion");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    private void inicializadorObjetos() {
        vistaingreso = new VistaResultado();
        this.getContentPane().add(vistaingreso);
    }
}
