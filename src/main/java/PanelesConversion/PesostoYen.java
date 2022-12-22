/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PanelesConversion;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JPanel;

/**
 *
 * @author Daniel
 */
public class PesostoYen extends JPanel {
    
    public PesostoYen(){
        this.inicializador();
        this.inicializadorObjetos();
    }
    private void inicializador(){
        this.setLayout(new GridLayout(3,1));
        this.setBackground(Color.red);
    }
    private void inicializadorObjetos(){
        
    }
}
