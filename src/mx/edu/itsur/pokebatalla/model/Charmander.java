/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model;
import mx.edu.itsur.pokebatalla.model.moves.PunoFuego;
import mx.edu.itsur.pokebatalla.model.moves.Llamarada;
import mx.edu.itsur.pokebatalla.model.moves.Grunido;

import mx.edu.itsur.pokebatalla.model.moves.Movimiento;
/**
 *
 * @author FJML1983
 */

public class Charmander extends Pokemon {

    @Override
    protected void atacar(Pokemon oponente, mx.edu.itsur.pokebatalla.model.Movimiento move) {
        //move.atacar(this, oponente);
    }

    /**
     * Movimientos que puede realizar el Pokémon
     */
    public enum Movimientos {
        Llamarada,
        PunoFuego,
        Grunido,
        
        //Otros movimientos...
    }

    public Charmander() {
        tipo = "FUEGO";
        hp = 39;
        ataque = 52;
        defensa = 43;
        nivel = 1;
        precision = 4;
    }

    //Constructor alterno 1
    public Charmander(String nombre) {
        this(); //invocando al constructor default
        this.nombre = nombre; 
    }

    public void atacar(Pokemon oponente, Charmander.Movimientos movimientoAUtilizar) {

        //Instanciar el movimiento solicitado
        Movimiento instanciaMovimiento;
        switch (movimientoAUtilizar) {
            case Llamarada:
                instanciaMovimiento = new Llamarada();
                break;
            case PunoFuego:
                instanciaMovimiento = new PunoFuego();
                break;
            case Grunido:
                instanciaMovimiento = new Grunido();
                break;

            //Otros movimientos aquí...
            default:
                throw new AssertionError();
        }

        //Aplicar el movimiento
        instanciaMovimiento.utilizar(this, oponente);

    }
}