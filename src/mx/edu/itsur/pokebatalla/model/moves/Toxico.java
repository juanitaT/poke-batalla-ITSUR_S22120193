/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.moves;

/**
 *
 * @author JUANA DEL ROSARIO TENORIO RIVERA
 */
public class Toxico extends MovimientoEstado {
       public Toxico() {
        this.tipo=Movimiento.TiposDeMovimiento.VENENO;
        this.potencia = 0;
        this.precision = 90;
        this.puntosPoder = 10;
    }
}