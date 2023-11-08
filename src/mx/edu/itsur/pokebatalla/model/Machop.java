

package mx.edu.itsur.pokebatalla.model;

import mx.edu.itsur.pokebatalla.model.moves.Contraataque;
import mx.edu.itsur.pokebatalla.model.moves.PantallaDeLuz;
import mx.edu.itsur.pokebatalla.model.moves.LanzaLlamas;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;
/**
 *
 * @author JUANA DEL ROSARIO TENORIO RIVERA
 */
public class Machop  extends Pokemon{

    @Override
    protected void atacar(Pokemon oponente, mx.edu.itsur.pokebatalla.model.Movimiento move) {
        //move.atacar(this, oponente);
    }
    public enum Movimientos {
    Contraataque,
    PantallaDeLuz, //lo puede aprender de MT, DT y MO
    LanzaLlamas,//cuando sube de nivel
    }
    //Constructor default
    public Machop() {
        this.tipo = "LUCHA";
        this.hp = 70;
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
    
    public void atacar(Pokemon oponente, Machop.Movimientos movimientoUtilizar)
    {
        Movimiento instanciaMovimiento;
        switch(movimientoUtilizar){
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