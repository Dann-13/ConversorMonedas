/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vistas.PanelesConversion;

import Clases.ClasesConvercionMonedas.CurrencyConverter;
import Controllers.CurrencyConverterController;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author dan-dev
 */
public class VistaConversionMoneda extends JPanel{
    private CurrencyConverterController controller;
    private JTextField amountTextField;
    private JComboBox<String> sourceCurrencyComboBox;
    private JComboBox<String> targetCurrencyComboBox;
    private JLabel resultLabel;
    
    public VistaConversionMoneda (){
        
        this.inicializador();
        this.inicializadorObjectos();
        
    }

    private void inicializador() {
        this.setLayout(new GridLayout(5, 2, 10, 10));
    }

    private void inicializadorObjectos() {
        JLabel amountLabel = new JLabel("Cantidad:");
        amountTextField = new JTextField(10);

        JLabel sourceCurrencyLabel = new JLabel("Moneda base:");
        sourceCurrencyComboBox = new JComboBox<>(new String[]{"USD", "EUR", "GBP", "JPY", "COP"});

        JLabel targetCurrencyLabel = new JLabel("Moneda de destino:");
        targetCurrencyComboBox = new JComboBox<>(new String[]{"USD", "EUR", "GBP", "JPY", "COP"});

        JButton convertButton = new JButton("Convertir");
        resultLabel = new JLabel("Resultado:");

        CurrencyConverterController controller = new CurrencyConverterController(new CurrencyConverter());

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener valores de los campos
                String baseCurrency = (String) sourceCurrencyComboBox.getSelectedItem();
                String targetCurrency = (String) targetCurrencyComboBox.getSelectedItem();
                double amount = Double.parseDouble(amountTextField.getText());

                // Utilizar el controlador para realizar la conversión
                double convertedAmount = controller.convertCurrency(baseCurrency, targetCurrency, amount);

                // Mostrar el resultado
                if (convertedAmount != -1.0) {
                    resultLabel.setText("Resultado: " + convertedAmount + " " + targetCurrency);
                } else {
                    resultLabel.setText("Error en la conversión.");
                }
            }
        });

        // Agregar componentes al panel
        add(amountLabel);
        add(amountTextField);
        add(sourceCurrencyLabel);
        add(sourceCurrencyComboBox);
        add(targetCurrencyLabel);
        add(targetCurrencyComboBox);
        add(new JLabel()); // Espacio en blanco
        add(convertButton);
        add(resultLabel);
    }
    
}
