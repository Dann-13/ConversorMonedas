/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vistas.Componentes;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author dan-dev
 */
public class Footer extends JLabel{
    String url = "https://flashdev13.netlify.app/";
    public Footer(String text) {
        super(text);
        setOpaque(true);
        setBackground(new Color(45, 212, 191));
        setForeground(Color.BLACK);
        setHorizontalAlignment(SwingConstants.CENTER);
        setCursor(new Cursor(Cursor.HAND_CURSOR)); // Cambia el cursor al de una mano

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                openWebpage(url);
            }
        });
    }
    private void openWebpage(String urlString) {
        try {
            URI uri = new URI(url);
            Desktop.getDesktop().browse(uri);
        } catch (URISyntaxException | IOException ex) {
            ex.printStackTrace(); // Manejo de errores, puedes personalizarlo según tu necesidad
        }
    }
}
