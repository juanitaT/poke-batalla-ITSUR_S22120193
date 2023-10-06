/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model;

import java.util.ArrayList;

/**
 *
 * @author JUANA DEL ROSARIO TENORIO RIVERA
 */
public class Jigglypuff  extends Pokemon{

    //Constructor default
    public Jigglypuff() {
        this.tipo = "NORMAL/HADA";
        this.hp = 115;
        this.ataque = 45;
        this.defensa = 20;
        this.nivel = 1;
        this.precision = 4;
        this.habilidades = new ArrayList<>();
        this.habilidades.add("BRILLO MAGICO");
        this.habilidades.add("GIRO BOLA");
        //....
    }    
    
    //Constructor alterno 1
    public Jigglypuff(String nombre){
        this(); //invocando al constructor default
        this.nombre = nombre;
    }
    
    public void atacar(Pokemon oponente, String habilidad){
        if(habilidad.equals("BRILLO MAGICO")){
            //Logica del daño por BRILLO MAGICO
            System.out.println("Realizando BRILLO MAGICO");
        }else if(habilidad.equals("GIRO BOLA")){
            //Logica del daño por GIRO BOLA
            System.out.println("Realizando GIRO BOLA");            
        }
    System.out.println("");
    }
   
}