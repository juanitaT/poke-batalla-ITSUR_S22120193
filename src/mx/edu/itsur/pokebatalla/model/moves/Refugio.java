/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.moves;

/**
 *
 * @author JUANA DEL ROSARIO TENORIO RIVERA
 */
public class Refugio extends MovimientoEstado{
        public Refugio() {
        this.tipo = Movimiento.TiposDeMovimiento.AGUA;
        this.potencia = 0;
        this.precision = 100;
        this.puntosPoder = 40;
}
}