/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contenedores;

import Vistas.VistaConversionMonedas;
import java.io.IOException;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Daniel
 */
public class ConversionMonedas extends JFrame {

    VistaConversionMonedas conversionMonedas;

    public ConversionMonedas() throws IOException {
        this.inicializador();
        this.inicializadorObjetos();
    }

    private void inicializador() {
        this.setSize(400, 400);
        this.setTitle("Conversion de Monedas");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

    }

    private void inicializadorObjetos() {
        conversionMonedas = new VistaConversionMonedas();
        this.getContentPane().add(conversionMonedas);
    }

}
