/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Daniel
 */
public class Convertidor {
    private double int1;
    public Convertidor(){
    }
    public double getInt1() {
        return int1;
    }

    public void setInt1(float int1) {
        this.int1 = int1;
    }
    public double convertidor(String opcion){
       if(opcion == "1"){
           return 1;
       }
        return 0;
        
    } 
    
}
