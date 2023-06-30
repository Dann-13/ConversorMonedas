/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vistas;

import PanelesConversion.PesostoYen;
import PanelesConversion.PesotoEuro;
import PanelesConversion.PesotoUsd;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.*;
import javax.swing.plaf.basic.BasicComboBoxRenderer;

/**
 * Esta clase servira para crear los paneles para posteriormente enviarlos a la
 * clase PanelChanger al igual que se creara el combobox con sus respectivas
 * opciones
 *
 * @author Daniel
 */
public class VistaConversionMonedas extends JPanel {

    PesotoUsd pesostoUsd;
    PesotoEuro pesotoEuro;
    PesostoYen pesotoYen;

    JPanel container;
    JComboBox<String> comboBox;

    //componentes de los paneles
    /**
     * Metodo Inicializador de otros metodos
     */
    public VistaConversionMonedas() {
        this.inicializador();
        this.inicializadorObjetos();
    }

    /**
     * Metodo de configuracion del jpanel actual
     */
    private void inicializador() {
        this.setLayout(new BorderLayout());
    }

    /**
     * Metofo que sirve para inicializar los objetos al igual que sirve para
     * darle sus propiedades se inicializa la clase PanelChanger para darle un
     * evento y poder enviarle el panel y la opcion del comboBox
     */
    private void inicializadorObjetos() {
        
        comboBox = new JComboBox<>(new String[]{"Peso a Euro", "Peso a Yen", "Pesos a Usd"});
        this.add(comboBox, BorderLayout.NORTH);
      

        // Crear una implementación personalizada de ListCellRenderer
        ListCellRenderer<? super String> renderer = new BasicComboBoxRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                Component component = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                if (isSelected) {
                    component.setBackground(new Color(45, 212, 191)); // Cambiar el color de selección
                    component.setForeground(new Color(13, 24, 39)); // Cambiar el color del texto seleccionado
                } else {
                    component.setBackground(list.getBackground());
                    component.setForeground(list.getForeground());
                }
                return component;
            }
        };

        comboBox.setRenderer(renderer);

        // crear el contenedor que utilizará un CardLayout
        container = new JPanel(new CardLayout());

        //Paneles
        pesotoEuro = new PesotoEuro();
        container.add(pesotoEuro, "Peso a Euro");

        pesotoYen = new PesostoYen();
        container.add(pesotoYen, "Peso a Yen");

        pesostoUsd = new PesotoUsd();
        container.add(pesostoUsd, "Pesos a Usd");

        // agregar el contenedor a la interfaz de usuario
        this.add(container, BorderLayout.CENTER);

        // crear una instancia de PanelChanger y asignarla como listener de eventos de acción de la lista desplegable
        PanelChanger panelChanger = new PanelChanger(container, comboBox);
        comboBox.addActionListener(panelChanger);

    }
}
