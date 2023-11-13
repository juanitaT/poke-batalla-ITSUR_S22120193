package mx.edu.itsur.pokebatalla.model.Pokemon;

import mx.edu.itsur.pokebatalla.model.moves.Contraataque;
import mx.edu.itsur.pokebatalla.model.moves.PantallaDeLuz;
import mx.edu.itsur.pokebatalla.model.moves.LanzaLlamas;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;

/**
 *
 * @author JUANA DEL ROSARIO TENORIO RIVERA
 */
public class Machop extends Pokemon {

    public enum Movimientos {
        Contraataque,
        PantallaDeLuz, //lo puede aprender de MT, DT y MO
        LanzaLlamas,//cuando sube de nivel
    }

    //Constructor default
    public Machop() {
        this.tipo = "LUCHA";
        this.hp = 70;//70
        this.ataque = 80;
        this.defensa = 50;
        this.nivel = 1;
        this.precision = 3;

        //....
    }

    public Machop(String nombre) {
        this(); //invocando al constructor default
        this.nombre = nombre;
    }

    @Override
    public Enum[] getMovimientos() {
        return Machop.Movimientos.values();
    }

    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {

        if (this.hp <= 0) {
            System.out.println("Machop. esta cansado y no puede realizar mas movimientos.");
            return;
        }

        Machop.Movimientos movimientoUtilizar= Machop.Movimientos.values()[ordinalMovimiento];
        Movimiento instanciaMovimiento;
        switch (movimientoUtilizar) {
            case Contraataque:
                instanciaMovimiento = new Contraataque();
                break;
            case PantallaDeLuz:
                instanciaMovimiento = new PantallaDeLuz();
                break;
            case LanzaLlamas:
                instanciaMovimiento = new LanzaLlamas();
                break;

            default:
                throw new AssertionError();
        }
        instanciaMovimiento.utilizar(this, oponente);
    }

}