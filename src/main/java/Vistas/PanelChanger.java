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
 *
 * @author Daniel
 */
public class PanelChanger implements ActionListener {
    JPanel container;
    JComboBox<String> comboBox;
    // constructor
    public PanelChanger(JPanel container, JComboBox<String> comboBox) {
        this.container = container;
        this.comboBox = comboBox;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        // obtener el elemento seleccionado de la lista desplegable
        String selectedItem = (String) comboBox.getSelectedItem();
        
        // mostrar el panel adecuado
        CardLayout cardLayout = (CardLayout) container.getLayout();
        cardLayout.show(container, selectedItem);
    }
}
