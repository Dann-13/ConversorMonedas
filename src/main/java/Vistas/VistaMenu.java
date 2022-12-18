/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vistas;

import Contenedores.Menu;
import java.awt.Image;

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
    JLabel LblUsuario,labelImagen;
    JButton btnMonedas, btnTemperatura;
    
    public VistaMenu(Menu menu){
        this.menu = menu;
        this.inicializador();
        this.inicializadorObjetos();
    }
    public void inicializador(){
        this.setLayout(null);
    }
    public void inicializadorObjetos(){
        //Botones
        btnMonedas = new JButton("Conversor de Monedas");
        btnMonedas.setBounds(90, 200, 200, 30);
        this.add(btnMonedas);
        
        btnTemperatura = new JButton("Conversor de Temperatura");
        btnTemperatura.setBounds(90, 250, 200, 30);
        this.add(btnTemperatura);
        
        //importamos imagen
        ImageIcon icon = new ImageIcon("./src/main/java/source/convertir.png");
        //Ajustamos el tamaño del la imagen al label
        icon.setImage(icon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));    
        labelImagen = new JLabel();
        labelImagen.setIcon(icon);
        labelImagen.setBounds(140, 30, 100, 100);
        this.add(labelImagen);
    }
}
