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

import javax.swing.JComboBox;
import javax.swing.*;

/**
 * Esta clase servira para crear los paneles para posteriormente enviarlos a la clase PanelChanger
 * al igual que se creara el combobox con sus respectivas opciones
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
     * Metofo que sirve para inicializar los objetos al igual que sirve para darle sus propiedades
     * se inicializa la clase PanelChanger para darle un evento y poder enviarle el panel y la 
     * opcion del comboBox
     */
    private void inicializadorObjetos() {

        comboBox = new JComboBox<>(new String[]{"Peso a Euro", "Peso a Yen", "Pesos a Usd"});
        this.add(comboBox, BorderLayout.NORTH);

        // crear el contenedor que utilizará un CardLayout
        container = new JPanel(new CardLayout());

        //Paneles

        pesotoEuro = new PesotoEuro();
        container.add(pesotoEuro, "Peso a Euro");

        pesotoYen = new PesostoYen();
        container.add(pesotoYen,"Peso a Yen");

        pesostoUsd = new PesotoUsd();
        container.add(pesostoUsd, "Pesos a Usd");

        // agregar el contenedor a la interfaz de usuario
        this.add(container, BorderLayout.CENTER);

        // crear una instancia de PanelChanger y asignarla como listener de eventos de acción de la lista desplegable
        PanelChanger panelChanger = new PanelChanger(container, comboBox);
        comboBox.addActionListener(panelChanger);

    }
}
