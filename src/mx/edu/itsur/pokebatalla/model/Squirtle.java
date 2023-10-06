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
public class Squirtle  extends Pokemon{

    //Constructor default
    public Squirtle() {
        this.tipo = "AGUA";
        this.hp = 44;
        this.ataque = 48;
        this.defensa = 65;
        this.nivel = 1;
        this.precision = 4;
        this.habilidades = new ArrayList<>();
        this.habilidades.add("BURBUJAS");
        this.habilidades.add("HIDROPULSO");
        //....
    }    
    
    //Constructor alterno 1
    public Squirtle(String nombre){
        this(); //invocando al constructor default
        this.nombre = nombre;
    }
    
    public void atacar(Pokemon oponente, String habilidad){
        if(habilidad.equals("BURBUJAS")){
            //Logica del daño por BURBUJAS
            System.out.println("Realizando BURBUJAS");
        }else if(habilidad.equals("HIDROPULSO")){
            //Logica del daño por HIDROPULSO
            System.out.println("Realizando HIDROPULSO");            
        }
    System.out.println("");
    }
   
}
