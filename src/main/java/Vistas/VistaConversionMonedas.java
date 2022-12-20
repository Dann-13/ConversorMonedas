/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vistas;

import Clases.Convertidor;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.*;

/**
 *
 * @author Daniel
 */
public class VistaConversionMonedas extends JPanel {
    Convertidor convertidor;
    JTextField caja;
    public VistaConversionMonedas() {
        this.inicializador();
        this.inicializadorObjetos();
    }

    private void inicializador() {
        this.setLayout(null);
    }

    private void inicializadorObjetos() {
        String[] options = {"Opcion 1", "Opcion 2", "Opcion 3"};
        JComboBox<String> comboBox = new JComboBox<>(options);
        comboBox.setSize(100, 30);
        comboBox.setLocation(10, 10);
        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedOption = (String) comboBox.getSelectedItem();
                System.out.println("Opción seleccionada: " + selectedOption);
                convertidor = new Convertidor();
                System.out.println(convertidor.convertidor("1"));
                
            }
        });
        this.add(comboBox);
        
        //Label
        //JTextField "Caja"
        caja = new JTextField();
        
        caja.setLocation(10, 30);
        caja.setSize(100, 30);
        this.add(caja);

    }

}
