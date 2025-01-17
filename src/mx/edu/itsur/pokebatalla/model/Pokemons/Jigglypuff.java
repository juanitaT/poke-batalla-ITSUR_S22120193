/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.Pokemons;

import java.io.Serializable;
import mx.edu.itsur.pokebatalla.model.Pokemons.Pokemon;
import mx.edu.itsur.pokebatalla.model.moves.BesoAmoroso;
import mx.edu.itsur.pokebatalla.model.moves.BombaHuevo;
import mx.edu.itsur.pokebatalla.model.moves.BombaSonica;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;

/**
 *
 * @author JUANA DEL ROSARIO TENORIO RIVERA
 */
public class Jigglypuff  extends Pokemon implements Serializable{

    public enum Movimientos {
        BOMBA_SONICA,
        BOMBA_HUEVO,
        BESO_AMOROSO,
    }
    //Constructor default
    public Jigglypuff() {
        this.tipo = "NORMAL/HADA";
        this.hp = 115;
        this.ataque = 45;
        this.defensa = 20;
        this.nivel = 1;
        this.precision = 4;
    }
    public Jigglypuff(String nombre) {
        this(); 
        this.nombre = nombre;
    }
    
     @Override
        public Enum[] getMovimientos() {
            return Jigglypuff.Movimientos.values();
        }
        
    
    
    @Override
        public void atacar(Pokemon oponente, int ordinalMovimiento) {

            Movimiento instanciaMovimiento;
            Jigglypuff.Movimientos movimientoUtilizar = Jigglypuff.Movimientos.values()[ordinalMovimiento];
            
            if (this.hp <= 0) {
                System.out.println("Jigglypuff esta agotado y no puede realizar mas movimientos.");
                return;
            }
            
        switch(movimientoUtilizar){
            case BESO_AMOROSO:
            instanciaMovimiento = new BesoAmoroso();
                break;
            case BOMBA_HUEVO:
                instanciaMovimiento = new BombaHuevo();
                break;
            case BOMBA_SONICA:
                instanciaMovimiento = new BombaSonica();
                break;
          
                default:
                throw new AssertionError();
        }
         instanciaMovimiento.utilizar(this, oponente);
    }

}