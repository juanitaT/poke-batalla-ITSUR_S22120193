/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model;

import java.util.ArrayList;

/**
 *
 * @author FJML1983
 */
public class Bullbasaur  extends Pokemon{

    //Constructor default
    public Bullbasaur() {
        this.tipo = "PLANTA/VENENO";
        this.hp = 45;
        this.ataque = 49;
        this.defensa = 49;
        this.nivel = 1;
        this.precision = 4;
        this.habilidades = new ArrayList<>();
        this.habilidades.add("ESPESURA");
        this.habilidades.add("CLOROFILA");
        //....
    }    
    
    //Constructor alterno 1
    public Bullbasaur(String nombre){
        this(); //invocando al constructor default
        this.nombre = nombre;
    }
    
    public void atacar(Pokemon oponente, String habilidad){
        if(habilidad.equals("ESPESURA")){
            //Logica del daño por ESPESURA
            System.out.println("Realizando ESPESURA");
        }else if(habilidad.equals("CLOROFILA")){
            //Logica del daño por CLOROFILA
            System.out.println("Realizando CLOROFILA");            
        }
        System.out.println("");
        //TODO: otras habilidades...
    }
   
}