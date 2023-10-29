/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vistas;

import Vistas.Componentes.Footer;
import Vistas.Contenedores.Menu;
import Vistas.Contenedores.ConversionTemperaturaFrame;
import Vistas.Contenedores.ConversorMonedasFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Daniel Clase VistaMenu que representa una vista del menú en una
 * interfaz gráfica. Extiende JPanel para funcionar como un panel en una
 * aplicación Java Swing.
 */
public class VistaMenu extends JPanel {

    //llamamos a menu frame
    Menu menu;
    //propiedades vistas
    JLabel LblUsuario, labelImagen;
    JButton btnMonedas, btnTemperatura;

    /**
     * Constructor de la clase VistaMenu. Inicializa la interfaz gráfica, los
     * objetos y los eventos.
     *
     * @param menu Objeto Menu para gestionar el menú principal.
     */
    public VistaMenu(Menu menu) {
        this.menu = menu;
        this.inicializador();
        this.inicializadorObjetos();
        this.inicializadorEventos();
    }

    /**
     * Método privado que inicializa el panel y establece su apariencia.
     */
    private void inicializador() {
        this.setLayout(null);
        this.setBackground(new Color(13, 24, 39));

    }

    /**
     * Método privado que inicializa los objetos gráficos, como etiquetas y
     * botones. Establece su posición y apariencia.
     */
    private void inicializadorObjetos() {
        //Botones
        btnMonedas = new JButton("Monedas");
        btnMonedas.setBounds(75, 220, 250, 45);
        btnMonedas.setBackground(new Color(45, 212, 191));
        btnMonedas.setForeground(new Color(13, 24, 39));
        btnMonedas.setFont(new Font("Arial", Font.BOLD, 15));
        this.add(btnMonedas);

        btnTemperatura = new JButton("Temperatura");
        btnTemperatura.setBounds(75, 285, 250, 45);
        btnTemperatura.setBackground(new Color(45, 212, 191));
        btnTemperatura.setForeground(new Color(13, 24, 39));
        btnTemperatura.setFont(new Font("Arial", Font.BOLD, 15));
        this.add(btnTemperatura);

        Footer linkLabel = new Footer("Visita mi sitio web, ¡Haz Click!");       
        linkLabel.setBounds(0, 430, 400, 30);
        this.add(linkLabel);

        ImageIcon icon = new ImageIcon("./src/main/java/Source/convertir.png");
        //Ajustamos el tamaño del la imagen al label
        icon.setImage(icon.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT));
        labelImagen = new JLabel();
        labelImagen.setIcon(icon);
        labelImagen.setBounds(125, 30, 150, 150);
        this.add(labelImagen);
    }

    /**
     * Método privado que inicializa los eventos de los componentes gráficos.
     */
    private void inicializadorEventos() {
        ActionListener escuchaBtnMonedas = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                escuchaBtnMonedasClick();
            }
        };
        btnMonedas.addActionListener(escuchaBtnMonedas);

        ActionListener escuchaBtnTemperatura = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                escuchaBtnTemperaturaClick();
            }
        };
        btnTemperatura.addActionListener(escuchaBtnTemperatura);

    }

    /**
     * Método que se ejecuta cuando se hace clic en el botón de conversor de
     * monedas. Abre la ventana del conversor de monedas y cierra el menú
     * principal.
     *
     * @throws IOException Si ocurre un error al abrir la ventana del conversor
     * de monedas.
     */
    public void escuchaBtnMonedasClick() {

        ConversorMonedasFrame converMone = new ConversorMonedasFrame();
        converMone.setVisible(true);
        this.menu.dispose();

    }

    public void escuchaBtnTemperaturaClick() {
        ConversionTemperaturaFrame converTemp = new ConversionTemperaturaFrame();
        converTemp.setVisible(true);
        this.menu.dispose();

    }

}
