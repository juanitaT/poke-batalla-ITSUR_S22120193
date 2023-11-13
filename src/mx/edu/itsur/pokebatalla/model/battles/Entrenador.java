/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itsur.pokebatalla.model.battles;

import mx.edu.itsur.pokebatalla.model.Pokemons.Pokemon;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JUANA DEL ROSARIO TENORIO RIVERA
 */
public class Entrenador {
    //Atributos

    protected String nombre;
    protected List<Pokemon> pokemonsCapturados;
    protected Pokemon pokemonActual;

    public Entrenador(String nombre) {
        this.nombre = nombre;
        this.pokemonsCapturados = new ArrayList<>();
        this.pokemonsCapturados = new ArrayList<>();
    }

    public boolean capturarPokemon(Pokemon p) {
        return pokemonsCapturados.add(p);
    }

    public void instruirMovimientoAlPokemonActual(Pokemon oponente, int ordinalMovimiento) {

        if (pokemonActual == null) {
            System.out.println("No hay un Pokemon actualmente seleccionado.");
            return;
        }

        if (ordinalMovimiento < 0 || ordinalMovimiento >= pokemonActual.getMovimientos().length) {
            System.out.println("El ordinal de movimiento no es valido.");
            return;
        }
        // Llamar al metodo atacar del Pokemon actual
        this.pokemonActual.atacar(oponente, ordinalMovimiento);
    }

    public boolean estaDerrotado() {
        for (Pokemon pokemon : pokemonsCapturados) {

            if (pokemon.gethp() > 0) {
                return false;
            }
        }
        return true;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public Pokemon getPokemonActual() {
        return pokemonActual;
    }

    public void setPokemonActual(Pokemon p) {
        this.pokemonActual = p;
    }

    public List<Pokemon> getPokemonsCapturados() {
        return pokemonsCapturados;
    }
}
