/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.Pokemons;

import mx.edu.itsur.pokebatalla.model.moves.PunoFuego;
import mx.edu.itsur.pokebatalla.model.moves.Llamarada;
import mx.edu.itsur.pokebatalla.model.moves.Grunido;

import mx.edu.itsur.pokebatalla.model.moves.Movimiento;

/**
 *
 * @author FJML1983
 */

public class Charmander extends Pokemon {

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

    @Override
    public Enum[] getMovimientos() {
        return Charmander.Movimientos.values();
    }

    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {

        Movimiento instanciaMovimiento;
        Charmander.Movimientos movimientoAUtilizar = Charmander.Movimientos.values()[ordinalMovimiento];
        
        if (this.hp <= 0) {
                System.out.println("Charmander esta agotado y no puede realizar mas movimientos.");
                return;
            }


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
