/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vistas;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JPanel;

/**
 * Esta clase servira para cargar el panel adecuado dependiedo de la opcion que el usuario elija del
 * combobox
 * @author Daniel
 */
public class PanelChanger implements ActionListener {
    JPanel container;
    JComboBox<String> comboBox;
    // constructor
    /**
     * 1-Este es el constructor que recibira, primero un jpanel por defecto de la clase VistaConversionMonedas
     * y tambien el jpanel correspondiente a cada opcion del combobox
     * 2- Se recibira tambien la opcion del Jcombobox
     * @param container
     * @param comboBox 
     */
    public PanelChanger(JPanel container, JComboBox<String> comboBox) {
        this.container = container;
        this.comboBox = comboBox;
    }
    /**
     * Servira para obtener la opcion del combobox y mostrar el panel correspondiente segun la opcion 
     * seleccionada
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        // obtener el elemento seleccionado de la lista desplegable
        System.out.println((String) comboBox.getSelectedItem());
        String selectedItem = (String) comboBox.getSelectedItem();
        
        // mostrar el panel adecuado
        CardLayout cardLayout = (CardLayout) container.getLayout();
        cardLayout.show(container, selectedItem);
    }
}
