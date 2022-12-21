/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vistas;

import Clases.ConvercionMoneda;
import Clases.Moneda;
import Clases.TipoCambio;
import Contenedores.ConversionMonedas;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JComboBox;
import javax.swing.*;

/**
 *
 * @author Daniel
 */
public class VistaConversionMonedas extends JPanel {

    JLabel LblConvertir, LblNumero;
    JTextField caja;
    JButton btnEnviar;

    Moneda usd = new Moneda("Dólar estadounidense", "$", "USD");
    Moneda eur = new Moneda("Euro", "€", "EUR");
    Moneda jpy = new Moneda("Yen japonés", "¥", "JPY");
    Moneda peso = new Moneda("Peso Colombiano", "$", "Cop");

    public VistaConversionMonedas() {
        this.inicializador();
        this.inicializadorObjetos();
        this.inicializadorEventos();
    }

    private void inicializador() {
        this.setLayout(null);
    }

    private void inicializadorObjetos() {

        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("Peso a Usd");

        comboBox.addItem("Opción 2");
        comboBox.addItem("Opción 3");
        comboBox.setSize(250, 30);
        comboBox.setLocation(15, 30);
        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedOption = (String) comboBox.getSelectedItem();
                if (selectedOption.equals("Peso a Usd")) {

                    TipoCambio pesoToUsd = new TipoCambio(peso, usd, 0.00021);
                    List<TipoCambio> exchangeRates = Arrays.asList(pesoToUsd);
                    ConvercionMoneda converter = new ConvercionMoneda(exchangeRates);

                    //
                    double amount = 100;
                    double convertedAmount = converter.convert(amount, peso, usd);
                    System.out.printf("%.2f %s es igual a %.2f %s\n", amount, usd.getSymbol(), convertedAmount, eur.getSymbol());
                }

            }
        });
        this.add(comboBox);

        //Label
        LblNumero = new JLabel();
        LblNumero.setBounds(85, 70, 100, 20);
        LblNumero.setText("Ingrese Cantidad");
        this.add(LblNumero);

        LblConvertir = new JLabel();
        LblConvertir.setBounds(85, 10, 150, 20);
        LblConvertir.setText("Seleccione Importe");
        this.add(LblConvertir);
        //JTextField "Caja"
        caja = new JTextField();
        caja.setLocation(100, 100);
        caja.setSize(100, 30);
        this.add(caja);

        btnEnviar = new JButton();
        btnEnviar.setText("Convertir");
        btnEnviar.setBackground(new Color(152, 65, 235));
        btnEnviar.setForeground(Color.white);
        btnEnviar.setBounds(100, 150, 80, 30);
        this.add(btnEnviar);

    }

    private void inicializadorEventos() {
        //Boton enviar convertir
        ActionListener escuchaBotonConvertir = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    escuchaBtnConvertir();
                } catch (IOException ex) {
                    Logger.getLogger(VistaMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        btnEnviar.addActionListener(escuchaBotonConvertir);
    }

    public void escuchaBtnConvertir() throws IOException {

        Resultado res = new Resultado();
        res.setVisible(true);

    }

}
