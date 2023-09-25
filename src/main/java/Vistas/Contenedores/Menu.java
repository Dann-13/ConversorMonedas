/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contenedores;

import Vistas.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Daniel
 */
public class Menu extends JFrame{
    
    VistaMenu vistamenu;
    //Iniciamos con su constructor vacio
    public Menu(){
        //en donde vamos a inicializar dos metodos
        this.inicializador();
        this.inicializadorObjetos();
        
    }
    public void inicializador(){
        //este metodo se encarga de dar las propiedades de la ventana contenedora del panel
        this.setSize(400,500); //Alto y ancho de nuestro frame
        this.setTitle("Conversor");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        //icono
        ImageIcon icon = new ImageIcon("./src/main/java/source/convertirblack.png");
        this.setIconImage(icon.getImage());
    }
    public void inicializadorObjetos(){
        vistamenu = new VistaMenu(this);
        this.getContentPane().add(vistamenu);
    }
}
