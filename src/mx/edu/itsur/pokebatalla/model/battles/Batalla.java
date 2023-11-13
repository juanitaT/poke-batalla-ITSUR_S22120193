/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itsur.pokebatalla.model.battles;

import mx.edu.itsur.pokebatalla.model.Pokemons.Pokemon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author JUANA DEL ROSARIO TENORIO RIVERA
 */
public class Batalla {
    protected Entrenador entrenador1;
    protected Entrenador entrenador2;
    protected int turno = 1;
    protected boolean batallaFinalizada = false;

    //Constructor
    public Batalla(Entrenador entrenador1 , Entrenador entrenador2) {
        this.entrenador1 = entrenador1;
        this.entrenador2 = entrenador2;
    }    
    
    public void desarrollarBatalla() {
        System.out.println(" ******************************************************** LA BATTA ESTA POR DAR INICIO ********************************************************");
        System.out.println("LOS OPONENTES SON: ");
        System.out.println(entrenador1.getNombre() + "  <CONTRA>  " + entrenador2.getNombre());

        System.out.println("");

        eligeUnPokemon(entrenador1);
        eligeUnPokemon(entrenador2);

        while (!batallaFinalizada) {
            Entrenador entrenadorEnTurno = (turno == 1) ? entrenador1 : entrenador2;
            Entrenador oponente = (turno == 1) ? entrenador2 : entrenador1;

            System.out.println("Turno del entrenador: " + entrenadorEnTurno.getNombre());

            
            if (entrenadorEnTurno.getPokemonActual() == null || entrenadorEnTurno.getPokemonActual().gethp() <= 0) {
                cambiarDePokemon(entrenadorEnTurno);
            }
            
            if (oponente.getPokemonActual() == null) {
                System.out.println("No hay un Pokemon seleccionado actualmente para el atacante");
                return;
            }

            
            seleccionaUnAtaque(entrenadorEnTurno, oponente.getPokemonActual());

            Pokemon pokemonEnTurno = entrenadorEnTurno.getPokemonActual();

            if (oponente.estaDerrotado()) {
                System.out.println("¡El entrenador " + oponente.getNombre() + " ha sido derrotado!");
                batallaFinalizada = true;
            } else {
                
                turno = (turno == 1) ? 2 : 1;
            }
        }
    }

    private void eligeUnPokemon(Entrenador ent) {
        int idx = 1;
  
        System.out.println("------------------------------------------------------");
        for (Pokemon pokemon : ent.getPokemonsCapturados()) {
            System.out.println(idx + ".- " + pokemon.getClass().getSimpleName());
            idx++;
             System.out.println("------------------------------------------------------");
        }
        System.out.println("");
        System.out.println("Elige un  pokemon " + ent.getNombre());

        char auxLectura = '0';

        try {
            auxLectura = (char) System.in.read();
            System.in.read((new byte[System.in.available()]));
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        Pokemon pokemonSeleccionado = ent.getPokemonsCapturados()
                .get(Character.getNumericValue(auxLectura) - 1);
        ent.setPokemonActual(pokemonSeleccionado);
    }

    private void seleccionaUnAtaque(Entrenador ent, Pokemon oponente) {

        Pokemon pokemonActual = ent.getPokemonActual();

        System.out.println("-----------------------------------------------------");
        System.out.println("Seleccione un ataque para " + pokemonActual.getClass().getSimpleName() + ":");

        int idx = 1;

        for (Enum movimiento : pokemonActual.getMovimientos()) {
            System.out.println(idx + ".- " + movimiento);
            idx++;
        }
        System.out.println("-----------------------------------------------------");

        int opcionAtaque = -1;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            opcionAtaque = Integer.parseInt(br.readLine());
        } catch (IOException | NumberFormatException ex) {
            System.out.println("Por favor, ingresa un número que si sea correcto.");
            return;
        }

        if (opcionAtaque < 1 || opcionAtaque > pokemonActual.getMovimientos().length) {
            System.out.println("La opción de ataque no es correcta.");
            return;
        }

        ent.instruirMovimientoAlPokemonActual(oponente, opcionAtaque - 1);
    }

    private void cambiarDePokemon(Entrenador ent) {
        System.out.println("¿Quieres cambiar de Pokémon? (Y/N)");

        char respuesta = 'N';

        try {
            respuesta = (char) System.in.read();
            System.in.read((new byte[System.in.available()]));
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        if (respuesta == 'Y' || respuesta == 'y') {

            System.out.println("Pokemones disponibles:");
            int idx = 1;
            for (Pokemon pokemon : ent.getPokemonsCapturados()) {
                System.out.println(idx + ".- " + pokemon.getClass().getSimpleName());
                idx++;
            }

            System.out.println("Elige un nuevo Pokemon:");

            char auxLectura = '0';

            try {
                auxLectura = (char) System.in.read();
                System.in.read((new byte[System.in.available()]));
            } catch (IOException ex) {
                ex.printStackTrace();
            }

            Pokemon nuevoPokemon = ent.getPokemonsCapturados().get(Character.getNumericValue(auxLectura) - 1);
            ent.setPokemonActual(nuevoPokemon);

            System.out.println("Elegiste a " + nuevoPokemon.getClass().getSimpleName() + " en tu equipo.");
        }
    }
}
