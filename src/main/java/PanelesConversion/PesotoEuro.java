/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PanelesConversion;

import Clases.ConvercionMoneda;
import Clases.Moneda;
import Clases.TipoCambio;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Daniel
 */
public class PesotoEuro extends JPanel {

    Moneda eur = new Moneda("Euro", "€", "EUR");
    Moneda peso = new Moneda("Peso Colombiano", "$", "Cop");
    JLabel labelTitulo, lblRes,labelImagen;
    JTextField txtNumero;
    JButton btnEnviar;

    public PesotoEuro() {
        this.inicializador();
        this.inicializadorObjetos();
        this.inicializadorEventos();
    }

    private void inicializador() {
        this.setLayout(null);
    }

    private void inicializadorObjetos() {
        labelTitulo = new JLabel();
        labelTitulo.setText("Conversion de Pesos A Euro");
        labelTitulo.setBounds(60, 20, 350, 30);
        labelTitulo.setFont(new Font("Arial", Font.PLAIN, 20));
        this.add(labelTitulo);

        txtNumero = new JTextField();
        txtNumero.setSize(100, 25);
        txtNumero.setLocation(80, 70);
        this.add(txtNumero);

        btnEnviar = new JButton();
        btnEnviar.setText("Convertir");
        btnEnviar.setBounds(210, 70, 100, 25);
        btnEnviar.setBackground(new Color(152, 65, 235));
        btnEnviar.setForeground(Color.white);
        this.add(btnEnviar);

        lblRes = new JLabel();
        lblRes.setBounds(50, 130, 400, 30);
        lblRes.setText("Resultado");
        this.add(lblRes);
        
        //importamos imagen
        ImageIcon icon = new ImageIcon("./src/main/java/source/pesoeuro.png");
        //Ajustamos el tamaño del la imagen al label
        icon.setImage(icon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        labelImagen = new JLabel();
        labelImagen.setIcon(icon);
        labelImagen.setBounds(140, 210, 100, 100);
        this.add(labelImagen);

    }

    private void inicializadorEventos() {
        ActionListener escuchaBtnEnviar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                escuchaBtnEnviarClick();
            }

        };
        btnEnviar.addActionListener(escuchaBtnEnviar);
    }

    private void escuchaBtnEnviarClick() {
        String validation = txtNumero.getText();
        if (validation.matches("[0-9]*") && validation.length() > 0) {

            TipoCambio pesoToUsd = new TipoCambio(peso, eur, 0.0001972);

            // Crear una lista de tasas de cambio
            List<TipoCambio> exchangeRates = Arrays.asList(pesoToUsd);

            // Crear un objeto CurrencyConverter con las tasas de cambio
            ConvercionMoneda converter = new ConvercionMoneda(exchangeRates);

            // Realizar una conversión de moneda
            double amount = Double.parseDouble(txtNumero.getText());
            double convertedAmount = converter.convert(amount, peso, eur);
            //System.out.printf("%.2f %s es igual a %.2f %s\n", amount, peso.getSymbol(), convertedAmount, eur.getSymbol());

            lblRes.setText(String.format("<html> La cantidad " + amount + peso.getSymbol() + "<br>es igual en Euros a " + convertedAmount + eur.getSymbol()+"</html>"));

        }else{
            JOptionPane.showMessageDialog(null, "Recuerda que solo puedes colocar numeros y no puede estar vacio!", "Error", JOptionPane.WARNING_MESSAGE);

        }

    }
}
