/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.moves;

/**
 *
 * @author JUANA DEL ROSARIO TENORIO RIVERA
 */
public class Acido extends MovimientoEspecial {
       public Acido() {
        this.tipo=Movimiento.TiposDeMovimiento.VENENO;
        this.potencia = 40;
        this.precision = 100;
        this.puntosPoder = 30;
    }
}
