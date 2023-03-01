/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vistas;

import Contenedores.ConversionMonedas;
import Contenedores.Menu;
import java.awt.Color;
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
 * @author Daniel
 */
public class VistaMenu extends JPanel {

    //llamamos a menu frame
    Menu menu;
    //propiedades vistas
    JLabel LblUsuario, labelImagen;
    JButton btnMonedas, btnTemperatura;

    public VistaMenu(Menu menu) {
        this.menu = menu;
        this.inicializador();
        this.inicializadorObjetos();
        this.inicializadorEventos();
    }

    private void inicializador() {
        this.setLayout(null);
    }

    private void inicializadorObjetos() {
        //Botones
        btnMonedas = new JButton("Conversor de Monedas");
        btnMonedas.setBounds(90, 200, 200, 30);
        btnMonedas.setBackground(new Color(152, 65, 235));
        btnMonedas.setForeground(Color.white);
        this.add(btnMonedas);

        btnTemperatura = new JButton("Conversor de Temperatura");
        btnTemperatura.setBounds(90, 250, 200, 30);
        btnTemperatura.setBackground(new Color(152, 65, 235));
        btnTemperatura.setForeground(Color.white);
        this.add(btnTemperatura);

        //importamos imagen
//        String imagePath = "source/convertir.png"; // ruta relativa de la imagen
//        File imageFile = new File(imagePath);
//        String absolutePath = imageFile.getAbsolutePath(); // ruta absoluta de la imagen

        ImageIcon icon = new ImageIcon("./src/main/java/Source/convertir.png");
        //Ajustamos el tamaño del la imagen al label
        icon.setImage(icon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        labelImagen = new JLabel();
        labelImagen.setIcon(icon);
        labelImagen.setBounds(140, 30, 100, 100);
        this.add(labelImagen);
    }

    //inicializador de los eventos del boton
    private void inicializadorEventos() {
        ActionListener escuchaBtnMonedas = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    escuchaBtnMonedasClick();
                } catch (IOException ex) {
                    Logger.getLogger(VistaMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        btnMonedas.addActionListener(escuchaBtnMonedas);

    }

    //llamada a las ventanas
    public void escuchaBtnMonedasClick() throws IOException {

        ConversionMonedas conver = new ConversionMonedas();
        conver.setVisible(true);
        this.menu.dispose();

    }

}
