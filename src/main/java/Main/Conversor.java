/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package Main;

import Vistas.Contenedores.Menu;

/**
 * Esta clase sirve para iniciar la aplicacion
 *
 * @author Daniel
 */
public class Conversor {

    public static void main(String[] args) {
        try {
            Menu menu = new Menu();
            menu.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
