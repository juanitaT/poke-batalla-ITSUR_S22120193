/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.edu.itsur.pokebatalla;

import java.io.Serializable;
import mx.edu.itsur.pokebatalla.model.Pokemons.Bullbasaur;
import mx.edu.itsur.pokebatalla.model.Pokemons.Pikachu;
import mx.edu.itsur.pokebatalla.model.Pokemons.Charmander;
import mx.edu.itsur.pokebatalla.model.Pokemons.Jigglypuff;
import mx.edu.itsur.pokebatalla.model.Pokemons.Machop;
import mx.edu.itsur.pokebatalla.model.Pokemons.Squirtle;
import mx.edu.itsur.pokebatalla.model.battles.Batalla;
import mx.edu.itsur.pokebatalla.model.battles.Entrenador;
import mx.edu.itsur.pokebatalla.model.utils.FileManager;

/**
 *
 * @author juanita tenorio rivera
 */
public class Main implements Serializable {
    public static void main(String[] args) {
        Batalla poke = FileManager.CargarPartida();
        System.out.println("Hello PokeBatalla!");
        if (poke == null) {
            //la sobre carga de metodos seria cuando utilizas varias veces un metodo por ejemplo los pokemones 
            //que se puede usar en varias ocasiones varias veces.
            Pikachu pikachuSalvaje = new Pikachu();
            Charmander charmanderSalvaje = new Charmander();
            Bullbasaur bullbasaurSalvaje = new Bullbasaur();
            Jigglypuff jigglypuffSalvaje = new Jigglypuff();
            Machop machopSalvaje = new Machop();
            Squirtle squirtleSalvaje = new Squirtle();

            squirtleSalvaje.setNombre("blue");
            machopSalvaje.setNombre("nenis");
            jigglypuffSalvaje.setNombre("leonardo");
            bullbasaurSalvaje.setNombre("leo");
            pikachuSalvaje.setNombre("Pedro");
            charmanderSalvaje.setNombre("mauricio");

            Entrenador ent1 = new Entrenador("Mario");
            ent1.capturarPokemon(pikachuSalvaje);
            ent1.capturarPokemon(jigglypuffSalvaje);

            Entrenador ent2 = new Entrenador("Dennis");
            ent2.capturarPokemon(machopSalvaje);
            ent2.capturarPokemon(squirtleSalvaje);

            poke = new Batalla(ent1, ent2);

        }
        poke.desarrollarBatalla();

        /*
        System.out.println("################################################################");
        
System.out.println("Juanita va rumbo a su casa, pero escucho un ruido extrano.... ");
System.out.println("(Hojas moviendose) ");
System.out.println("Y de repende salta un pokemon y me quiere atacar... ");

System.out.println("Empiezo la batalla, utilizando a " + jigglypuffSalvaje.nombre + " y " + squirtleSalvaje.nombre);

System.out.println(jigglypuffSalvaje.nombre + " Empieza atacar primero ");
jigglypuffSalvaje.atacar(machopSalvaje, Jigglypuff.Movimientos.BOMBA_SONICA);
System.out.println("(En pelea)");    
System.out.println(machopSalvaje.nombre+" Se enoja y ataca ");
machopSalvaje.atacar(jigglypuffSalvaje, Machop.Movimientos.Contraataque);

System.out.println(pikachuSalvaje.nombre+" Al ver esto ataca a mi pokemon " + squirtleSalvaje.nombre);
pikachuSalvaje.atacar(squirtleSalvaje, Pikachu.Movimientos.IMPACTRUENO);
System.out.println(squirtleSalvaje.nombre+" Se enoja y responde ");
squirtleSalvaje.atacar(pikachuSalvaje, Squirtle.Movimientos.Refugio);

System.out.println(machopSalvaje.nombre+" vuelve atacar a mi pokemon " +jigglypuffSalvaje.nombre);
machopSalvaje.atacar(squirtleSalvaje, Machop.Movimientos.LanzaLlamas);
System.out.println("Mi pokemon "+jigglypuffSalvaje.nombre+" responde ");
jigglypuffSalvaje.atacar(machopSalvaje, Jigglypuff.Movimientos.BOMBA_HUEVO);

System.out.println(pikachuSalvaje.nombre+" vuelve atacar a "+squirtleSalvaje.nombre);
pikachuSalvaje.atacar(squirtleSalvaje, Pikachu.Movimientos.IMPACTRUENO);
System.out.println(squirtleSalvaje.nombre+" Responde con ");
squirtleSalvaje.atacar(pikachuSalvaje, Squirtle.Movimientos.Burbuja);

System.out.println(machopSalvaje.nombre+" vuelve atacar a mi pokemon " +jigglypuffSalvaje.nombre);
machopSalvaje.atacar(pikachuSalvaje, Machop.Movimientos.PantallaDeLuz);
System.out.println("Mi pokemon "+jigglypuffSalvaje.nombre+" responde ");
jigglypuffSalvaje.atacar(squirtleSalvaje, Jigglypuff.Movimientos.BESO_AMOROSO);

System.out.println("Como ya ven a mis pokemones debiles el oponente " +bullbasaurSalvaje.nombre+ " Ataca a mi pokemon " +squirtleSalvaje.nombre);
bullbasaurSalvaje.atacar(squirtleSalvaje, Bullbasaur.Movimientos.Toxico);
System.out.println(squirtleSalvaje.nombre+" Responde con ");
squirtleSalvaje.atacar(bullbasaurSalvaje, Squirtle.Movimientos.Cascada);

System.out.println("Mi pokemon "+charmanderSalvaje.nombre+" al ver esto entra en accion a luchar contra "+bullbasaurSalvaje.nombre);
charmanderSalvaje.atacar(bullbasaurSalvaje, Charmander.Movimientos.Llamarada);
System.out.println(bullbasaurSalvaje.nombre+" Ataca a mi pokemon "+charmanderSalvaje.nombre);
bullbasaurSalvaje.atacar(charmanderSalvaje, Bullbasaur.Movimientos.Acido);
System.out.println(charmanderSalvaje.nombre+ " Le regresa el ataque a "+bullbasaurSalvaje.nombre);
charmanderSalvaje.atacar(bullbasaurSalvaje, Charmander.Movimientos.PunoFuego);
        System.out.println("");
        System.out.println("¡¡¡AQUI TERMINA LA BATALLA!!!");
        System.out.println("PARTE 2?");
    } 
         */
    }
}
