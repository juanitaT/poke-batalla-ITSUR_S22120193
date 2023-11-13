/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.Pokemon;

import mx.edu.itsur.pokebatalla.model.moves.Refugio;
import mx.edu.itsur.pokebatalla.model.moves.Cascada;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;
import mx.edu.itsur.pokebatalla.model.moves.Burbuja;

/**
 *
 * @author JUANA DEL ROSARIO TENORIO RIVERA
 */
public class Squirtle extends Pokemon {

    public enum Movimientos {
        Refugio,
        Cascada,
        Burbuja,
    }

    //Constructor default
    public Squirtle() {
        this.tipo = "AGUA";
        this.hp = 44;
        this.ataque = 48;
        this.defensa = 65;
        this.nivel = 1;
        this.precision = 4;
    }

    //Constructor alterno 1
    public Squirtle(String nombre) {
        this(); //invocando al constructor default
        this.nombre = nombre;

    }

    @Override
    public Enum[] getMovimientos() {
        return Squirtle.Movimientos.values();
    }

    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {

        if (this.hp <= 0) {
            System.out.println("Charmander. esta cansado y no puede realizar mas movimientos.");
            return;
        }

        Squirtle.Movimientos movimientoUtilizar = Squirtle.Movimientos.values()[ordinalMovimiento];
        Movimiento instanciaMovimiento;
        switch (movimientoUtilizar) {
            case Refugio:
                instanciaMovimiento = new Refugio();
                break;
            case Cascada:
                instanciaMovimiento = new Cascada();
                break;
            case Burbuja:
                instanciaMovimiento = new Burbuja();
                break;

            default:
                throw new AssertionError();
        }
        instanciaMovimiento.utilizar(this, oponente);
    }
}
