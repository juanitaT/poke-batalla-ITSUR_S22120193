/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.Pokemons;
import mx.edu.itsur.pokebatalla.model.moves.PunoTrueno;
import mx.edu.itsur.pokebatalla.model.moves.Impactrueno;
import mx.edu.itsur.pokebatalla.model.moves.OndaTrueno;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;

/**
 *
 * @author FJML1983
 */
public class Pikachu  extends Pokemon{

 public enum Movimientos {
        IMPACTRUENO,
        OndaTrueno,
        PunoTrueno,

        //Otros movimientos...
    }

    //Constructor default
    public Pikachu() {
        this.tipo = "ELECTRICO";
        this.hp = 35;
        this.ataque = 55;
        this.defensa = 30;
        this.nivel = 1;
        this.precision = 4;
    }

    //Constructor alterno 1
    public Pikachu(String nombre) {
        this(); //invocando al constructor default
        this.nombre = nombre;
    }
 @Override
        public Enum[] getMovimientos() {
            return Pikachu.Movimientos.values();
        }
        

        @Override
        public void atacar(Pokemon oponente, int ordinalMovimiento) {

        //Instanciar el movimiento solicitado
        Movimiento instanciaMovimiento;      
        Pikachu.Movimientos movimientoAUtilizar = Pikachu.Movimientos.values()[ordinalMovimiento];
        
        switch (movimientoAUtilizar) {
            case IMPACTRUENO:
                instanciaMovimiento = new Impactrueno();
                break;
            case OndaTrueno:
                instanciaMovimiento = new OndaTrueno();
                break;
            case PunoTrueno:
                instanciaMovimiento = new PunoTrueno();
                break;

            //Otros movimientos aquí...                
            default:
                throw new AssertionError();
        }

        //Aplicar el movimiento.
        instanciaMovimiento.utilizar(this, oponente);
    }

}