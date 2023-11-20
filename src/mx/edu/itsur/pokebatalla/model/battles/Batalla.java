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
        System.out.println(" <<<< LA BATTA ESTA POR DAR INICIO >>>> ");
        System.out.println("LOS OPONENTES SON: ");
        System.out.println(entrenador1.getNombre() + " <----- V.S -----> " + entrenador2.getNombre());

        System.out.println("");

        do {
            try {
                eligeUnPokemon(entrenador1);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Solamente cuentas con:  " + "{" + entrenador1.getPokemonsCapturados().size() + "}" + "  En tu mochila, elige alguno de ellos");
                entrenador1.setPokemonActual(null);
            }
        } while (entrenador1.getPokemonActual() == null);

        do {
            try {
                eligeUnPokemon(entrenador2);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Solamente cuentas con:  " + "{" + entrenador2.getPokemonsCapturados().size() + "}" + "  En tu mochila, elige alguno de ellos");
                entrenador2.setPokemonActual(null);
            }
        } while (entrenador2.getPokemonActual() == null);

        while (!batallaFinalizada) {
            Entrenador entrenadorEnTurno = (turno == 1) ? entrenador1 : entrenador2;
            Entrenador oponente = (turno == 1) ? entrenador2 : entrenador1;
             System.out.println("------------------------------------------------------");
            System.out.println("Turno del entrenador: " + entrenadorEnTurno.getNombre());
            
            if (oponente.getPokemonActual() == null) {
                System.out.println("No hay un Pokemon seleccionado actualmente para el atacante");
                return;
            }
           
            seleccionaUnAtaque(entrenadorEnTurno, oponente.getPokemonActual());
            if (entrenadorEnTurno.getPokemonActual() == null || entrenadorEnTurno.getPokemonActual().gethp() <= 0) {
                cambiarDePokemon(entrenadorEnTurno);
            }
            while (entrenadorEnTurno.getPokemonActual() == null || entrenadorEnTurno.getPokemonActual().gethp() <= 0) {
                    System.out.println("Alto!!! No puedes avanzar sin cambiar de Pokemon.");
                    cambiarDePokemon(entrenadorEnTurno);
                }

            if (oponente.estaDerrotado()) {
                System.out.println("¡El entrenador " + oponente.getNombre() + " ha sido derrotado por: " );
            System.out.println(" <------------------- LA BATALLA A FINALIZADO -------------------> ");
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
        System.out.println("Elige un  pokemon " + ent.getNombre() + ":");
             System.out.println("------------------------------------------------------");

        char auxLectura = '0';

        try {
            auxLectura = (char) System.in.read();
            System.in.read((new byte[System.in.available()]));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
             System.out.println("------------------------------------------------------");

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

        int escAtaque = -1;
        while (true) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String input = br.readLine();
            
            escAtaque = Integer.parseInt(input);
            if (escAtaque < 1 || escAtaque > pokemonActual.getMovimientos().length) {
                    System.out.println("La opcion de ataque no es valida. Intentalo de nuevo.");
                } else {
                    break;  // Salir del bucle si no hay excepciones y la opción es válida
                }
            
        } catch (IOException ex) {
            System.out.println("Error al leer la entrada. Intentalo de nuevo.");
                ex.printStackTrace();
        }catch (NumberFormatException ex) {
            System.out.println("Por favor, ingresa un numero que si sea correcto. Ingrese nuevamente.");
        }
    }
        ent.instruirMovimientoAlPokemonActual(oponente, escAtaque - 1);
    
    }
    private void cambiarDePokemon(Entrenador ent) {
        System.out.println("¿Quieres cambiar de Pokemon? (Y/N)");
        char respuesta = 'N';

        while (true) {
        try {
            respuesta = (char) System.in.read();
            System.in.read((new byte[System.in.available()]));
            break;
        } catch (IOException ex) {
            System.out.println("Error de entrada o salida al leer la respuesta. Intenta de nuevo.");
            ex.printStackTrace();
        }
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
           int pokemonNew = Character.getNumericValue(auxLectura) - 1;
           if (pokemonNew >= 0 && pokemonNew < ent.getPokemonsCapturados().size()) {
                Pokemon nuevoPokemon = ent.getPokemonsCapturados().get(pokemonNew);
                ent.setPokemonActual(nuevoPokemon);
                System.out.println("Elegiste a " + nuevoPokemon.getClass().getSimpleName() + " en tu equipo.");
            } else {
                System.out.println("La opcion de Pokemon no es valida. Intenta de nuevo.");
            }
        }
    }
}