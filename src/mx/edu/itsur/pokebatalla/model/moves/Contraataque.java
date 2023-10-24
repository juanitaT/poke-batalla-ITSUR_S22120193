/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.moves;

/**
 *
 * @author juana del rosario tenorio rivera
 */
public class Contraataque extends MovimientoFisico{
        public Contraataque() {
        this.tipo = Movimiento.TiposDeMovimiento.LUCHA;
        this.potencia = 0;
        this.precision = 100;
        this.puntosPoder = 20;
}
}
