/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.Pokemons;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author FJML1983
 */
public abstract class Pokemon implements Serializable{

    //Atributos
    protected String tipo;
    public String nombre;
    protected int nivel;
    protected int hp;
    protected int ataque;
    protected int defensa;
    protected double precision;
    protected List<String> habilidades;

    Pokemon() {
    }
//Getters
    public int getNivel() {
        return nivel;
    }
    public int getAtaque() {
        return ataque;
    }    
    public int getDefensa(){
        return defensa;
    }
     public int gethp()
        {
            return hp;
        }
    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Métodos 
    public void recibirDanio(int danio){
        this.hp = this.hp - danio;
    }
    
     public abstract void atacar(Pokemon oponente, int ordinalMovimiento);

    public abstract Enum[] getMovimientos();
    @Override
    public String toString() {

        return this.getClass().getSimpleName() + 
                "{tipo:" + tipo + " hp:" + hp + "}";
        
    }
}