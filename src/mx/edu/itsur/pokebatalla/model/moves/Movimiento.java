/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.moves;

import mx.edu.itsur.pokebatalla.model.Pokemons.Pokemon;
/**
 *
 * @author juana del rosario tenorio rivera
 */
//LA HERENCIA SE APLICO EN LA CLASE MOVIMIENTO, EJEMPLO: SERIA TODOS LOS MOVIMIENTOS QUE SE AGREGARON
//
public abstract class Movimiento {
    enum TiposDeMovimiento {
        //Primera Generación
        AGUA,
        BICHO,
        DRAGON,
        ELECTRICO,
        FANTASMA,
        FUEGO,
        HIELO,
        LUCHA,
        NORMAL,
        PLANTA,
        PSIQUICO,
        ROCA,
        SINIESTRO,
        TIERRA,
        VENENO,
        VOLADOR
        //Segunda Generación
        //...        
    }

    //Atributos1
    protected TiposDeMovimiento tipo;
    protected int potencia;
    protected int precision;
    protected int puntosPoder;

    //Métodos
    public abstract void utilizar(Pokemon usuario, Pokemon objetivo);
        //Calcular el daño  
}
