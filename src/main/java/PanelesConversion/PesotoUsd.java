/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PanelesConversion;

import Clases.ConvercionMoneda;
import Clases.Moneda;
import Clases.TipoCambio;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Daniel
 */
public class PesotoUsd extends JPanel{
    Moneda usd = new Moneda("Usd", "$", "USD");
    Moneda peso = new Moneda("Peso Colombiano", "$", "COP");
    JLabel labelTitulo, lblRes;
    JTextField txtNumero;
    JButton btnEnviar;
    
    public PesotoUsd(){
        this.inicializador();
        this.inicializadorObjetos();
        inicializadorEventos();
    }
    private void inicializador(){
        this.setLayout(null);
    }
    private void inicializadorObjetos(){
        
        labelTitulo = new JLabel();
        labelTitulo.setText("Conversion de Pesos A Dolares");
        labelTitulo.setBounds(115, 20, 200, 30);
        this.add(labelTitulo);

        txtNumero = new JTextField();
        txtNumero.setSize(100, 30);
        txtNumero.setLocation(140, 70);
        this.add(txtNumero);

        btnEnviar = new JButton();
        btnEnviar.setText("Convertir");
        btnEnviar.setBounds(140, 120, 100, 30);
        btnEnviar.setBackground(new Color(152, 65, 235));
        btnEnviar.setForeground(Color.white);
        this.add(btnEnviar);
        
        lblRes = new JLabel();
        lblRes.setBounds(50, 160, 400, 30);
        lblRes.setText("Resultado");
        this.add(lblRes);
        
    }
    private void inicializadorEventos(){
        ActionListener escuchaBtnEnviar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                escuchaBtnEnviarClick();
            }

        };
        btnEnviar.addActionListener(escuchaBtnEnviar);
    }
    private void escuchaBtnEnviarClick() {
        TipoCambio pesoToUsd = new TipoCambio(peso, usd, 0.00020979187);

        // Crear una lista de tasas de cambio
        List<TipoCambio> exchangeRates = Arrays.asList(pesoToUsd);

        // Crear un objeto CurrencyConverter con las tasas de cambio
        ConvercionMoneda converter = new ConvercionMoneda(exchangeRates);

        // Realizar una conversión de moneda
        double amount = Double.parseDouble(txtNumero.getText());
        double convertedAmount = converter.convert(amount, peso, usd);
        System.out.printf("%.2f %s es igual a %.2f %s\n", amount, peso.getSymbol(), convertedAmount, usd.getSymbol());
        
        lblRes.setText("La cantidad " + amount + peso.getSymbol() +"es igual en Dolares a " + convertedAmount + usd.getSymbol());
        
        
    }
}
