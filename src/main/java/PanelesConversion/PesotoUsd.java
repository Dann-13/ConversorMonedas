/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PanelesConversion;

import Clases.ClasesConvercionMonedas.ConvercionMoneda;
import Clases.ClasesConvercionMonedas.Moneda;
import Clases.ClasesConvercionMonedas.TipoCambio;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
public class PesotoUsd extends JPanel {

    Moneda usd = new Moneda("Usd", "$", "USD");
    Moneda peso = new Moneda("Peso Colombiano", "$", "COP");
    JLabel labelTitulo, lblRes,labelImagen;
    JTextField txtNumero;
    JButton btnEnviar;

    public PesotoUsd() {
        this.inicializador();
        this.inicializadorObjetos();
        inicializadorEventos();
    }

    private void inicializador() {
        this.setLayout(null);
    }

    private void inicializadorObjetos() {

        labelTitulo = new JLabel();
        labelTitulo.setText("Conversion de Pesos A Dolares");
        labelTitulo.setBounds(25, 20, 350, 30);
        labelTitulo.setHorizontalAlignment(JLabel.CENTER);
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
        ImageIcon icon = new ImageIcon("./src/main/java/Source/pesousa.png");
        //Ajustamos el tamaño del la imagen al label
        icon.setImage(icon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        labelImagen = new JLabel();
        labelImagen.setIcon(icon);
        labelImagen.setBounds(150, 210, 100, 100);
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
        if (validation.matches("[0-9]*")  && validation.length() > 0) {
            TipoCambio pesoToUsd = new TipoCambio(peso, usd, 0.000209);

            // Crear una lista de tasas de cambio
            List<TipoCambio> exchangeRates = Arrays.asList(pesoToUsd);

            // Crear un objeto CurrencyConverter con las tasas de cambio
            ConvercionMoneda converter = new ConvercionMoneda(exchangeRates);

            // Realizar una conversión de moneda
            double amount = Double.parseDouble(txtNumero.getText());
            double convertedAmount = converter.convert(amount, peso, usd);
            System.out.printf("%.2f %s es igual a %.2f %s\n", amount, peso.getSymbol(), convertedAmount, usd.getSymbol());

            lblRes.setText(String.format("<html> La cantidad " + amount + peso.getSymbol() + "<br>es igual en Dolares a " + convertedAmount + usd.getSymbol()+"</html>"));
            //lblRes.setText(String.format("<html>Line 1<br>Line 2</html>"));
        } else {
            JOptionPane.showMessageDialog(null, "Solo Numeros", "Error", JOptionPane.WARNING_MESSAGE);

        }

    }
}
