/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itsur.pokebatalla.model.battles;

import java.util.List;
import mx.edu.itsur.pokebatalla.model.Pokemon;
/**
 *
 * @author CC-01
 */
public class Entrenador {
 //Atributos
    protected List<Pokemon> pokemonsCapturados;

    //Metodos
    public void capturarPokemon(Pokemon pk){
        pokemonsCapturados.add(pk);
    }   
}