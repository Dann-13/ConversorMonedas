/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PanelesConversion;

import Clases.ClasesConvercionMonedas.CurrencyConverter;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.Arrays;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Daniel Clase PesostoYen que representa una interfaz gráfica para
 * convertir pesos colombianos a yenes japoneses. Extiende JPanel para funcionar
 * como un panel en una aplicación Java Swing.
 */
public class PesostoYen extends JPanel {
    JLabel labelTitulo, lblRes, labelImagen;
    JTextField txtNumero, TxtUsuario;
    JButton btnEnviar;
    CurrencyConverter convert = new CurrencyConverter();

    public PesostoYen() {
        this.inicializador();
        this.inicializadorObjetos();
        this.inicializadorEventos();
    }

    private void inicializador() {
        this.setLayout(null);
        this.setBackground(new Color(13, 24, 39));

    }

    /**
     * Método que inicializa los objetos gráficos, como etiquetas, campos de
     * texto y botón. Establece su posición y apariencia.
     */
    private void inicializadorObjetos() {
        labelTitulo = new JLabel();
        labelTitulo.setText("Conversion de Pesos A Yenes");
        labelTitulo.setBounds(25, 20, 350, 30);
        labelTitulo.setHorizontalAlignment(JLabel.CENTER);
        labelTitulo.setForeground(Color.white);
        labelTitulo.setFont(new Font("Arial", Font.PLAIN, 20));
        this.add(labelTitulo);

        txtNumero = new JTextField(" Ingrese  Valor");
        txtNumero.setForeground(new Color(85, 74, 97));
        txtNumero.setBounds(70, 70, 200, 30);
        txtNumero.setSelectionStart(0);
        txtNumero.setSelectionEnd(0);
        txtNumero.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        txtNumero.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtNumero.getText().equals(" Ingrese  Valor")) {
                    txtNumero.setCaretPosition(0);
                    txtNumero.setText("");
                    txtNumero.setBorder(BorderFactory.createLineBorder(new Color(45, 212, 191)));

                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtNumero.getText().isEmpty()) {
                    txtNumero.setText(" Ingrese  Valor");
                    txtNumero.setBorder(BorderFactory.createLineBorder(Color.GRAY));

                }
            }
        });
        this.add(txtNumero);

        btnEnviar = new JButton();
        btnEnviar.setText(" = ");
        btnEnviar.setBounds(270, 70, 60, 30);
        btnEnviar.setBackground(new Color(45, 212, 191));
        btnEnviar.setForeground(new Color(13, 24, 39));
        this.add(btnEnviar);

        lblRes = new JLabel();
        lblRes.setBounds(50, 130, 400, 30);
        lblRes.setText(" ");
        lblRes.setForeground(Color.WHITE);
        this.add(lblRes);

        //importamos imagen
        ImageIcon icon = new ImageIcon("./src/main/java/Source/pesoyen.png");
        //Ajustamos el tamaño del la imagen al label
        icon.setImage(icon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        labelImagen = new JLabel();
        labelImagen.setIcon(icon);
        labelImagen.setBounds(150, 210, 100, 100);
        this.add(labelImagen);
    }

    /**
     * Método que inicializa los eventos de los componentes gráficos.
     */
    private void inicializadorEventos() {
        ActionListener escuchaBtnEnviar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                escuchaBtnEnviarClick();
            }

        };
        btnEnviar.addActionListener(escuchaBtnEnviar);
    }

    /**
     * Método que se ejecuta cuando se hace clic en el botón de enviar. Realiza
     * la conversión de pesos a yenes y muestra el resultado en la interfaz
     * gráfica.
     */
    private void escuchaBtnEnviarClick() {
        String validation = txtNumero.getText();
        if (validation.matches("[0-9]*") && validation.length() > 0) {
            // Realizar una conversión de moneda
            double amount = Double.parseDouble(txtNumero.getText());
            String baseCurrency = "COP"; // Moneda base: Pesos colombianos
            String targetCurrency = "JPY"; // Moneda objetivo: Yenes japoneses
//            double convertedAmount = converter.convert(amount, peso, yen);
            
            double convertedAmount = convert.convertCurrency(baseCurrency, targetCurrency, amount);
            lblRes.setText(String.format("<html> La cantidad " + amount + "$" + "<br>es igual en Yenes a " + String.format("%.2f", convertedAmount) + "¥" + "</html>"));

        } else {
            JOptionPane.showMessageDialog(null, "Recuerda que solo puedes colocar numeros y no puede estar vacio!", "Error", JOptionPane.WARNING_MESSAGE);

        }

    }
}
