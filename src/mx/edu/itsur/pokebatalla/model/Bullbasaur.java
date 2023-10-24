/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model;

import mx.edu.itsur.pokebatalla.model.moves.Acido;
import mx.edu.itsur.pokebatalla.model.moves.Toxico;
import mx.edu.itsur.pokebatalla.model.moves.HojaAfilada;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;

/**
 *
 * @author FJML1983
 */
public class Bullbasaur  extends Pokemon{
        public enum Movimientos {
        Toxico,
        Acido,
        HojaAfilada,
        
    }

    public Bullbasaur() {
        tipo = "PLANTA/VENENO";
        hp = 45;
        ataque = 49;
        defensa = 49;
        nivel = 1;
        precision = 4;
    }

    //Constructor alterno 1
    public Bullbasaur(String nombre) {
        this(); //invocando al constructor default
        this.nombre = nombre;

    }
     public void atacar(Pokemon oponente, Bullbasaur.Movimientos movimientoAUtilizar) {

        //Instanciar el movimiento solicitado
        Movimiento instanciaMovimiento;
        switch (movimientoAUtilizar) {
            case Acido: 
                instanciaMovimiento = new Acido();
                break;
            case Toxico:
                instanciaMovimiento = new Toxico();
                break;
            case HojaAfilada:
                instanciaMovimiento = new HojaAfilada();
                 break;

            //Otros movimientos aquí...
            default:
                throw new AssertionError();
        }

        //Aplicar el movimiento
        instanciaMovimiento.utilizar(this, oponente);

    }
   
}