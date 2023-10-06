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
public class Charmander extends Pokemon {
    public Charmander(){
        tipo = "FUEGO";
        hp = 39;
        ataque = 52;
        defensa = 43;
        nivel = 1;
        precision = 4;
        this.habilidades = new ArrayList<>();
        this.habilidades.add("MAR LLAMAS");
        this.habilidades.add("PODER SOLAR");
    }
    
    //Constructor alterno 1
    public Charmander(String nombre){
        this(); //invocando al constructor default
        this.nombre = nombre;
    }
    
    public void atacar(Pokemon oponente, String habilidad){
        if(habilidad.equals("MAR LLAMAS")){
            //Logica del daño por MAR LLAMAS
            System.out.println("Realizando MAR LLAMAS");
        }else if(habilidad.equals("PODER SOLAR")){
            //Logica del daño por PODER SOLAR
            System.out.println("Realizando PODER SOLAR");            
        }
        System.out.println("");
        //TODO: otras habilidades...
    }
   
}