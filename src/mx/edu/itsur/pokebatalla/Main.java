/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.edu.itsur.pokebatalla;

import mx.edu.itsur.pokebatalla.model.Bullbasaur;
import mx.edu.itsur.pokebatalla.model.Pikachu;
import mx.edu.itsur.pokebatalla.model.Charmander;
import mx.edu.itsur.pokebatalla.model.Jigglypuff;
import mx.edu.itsur.pokebatalla.model.Machop;
import mx.edu.itsur.pokebatalla.model.Squirtle;
/**
 *
 * @author FJML1983
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello PokeBatalla!");
         
        Pikachu pikachuSalvaje = new Pikachu();
        Charmander charmanderSalvaje = new Charmander() ;
        Bullbasaur bullbasaurSalvaje = new Bullbasaur();
        Jigglypuff jigglypuffSalvaje = new Jigglypuff();
        Machop machopSalvaje = new Machop();
        Squirtle squirtleSalvaje= new Squirtle();
        
        
        //Realizar la captura del pikachu salvaje
        pikachuSalvaje.setNombre("Pedro");        
        Pikachu miPikachu = pikachuSalvaje;
        miPikachu.atacar(charmanderSalvaje);
        miPikachu.atacar(charmanderSalvaje, "ATACKTRUENO");
        
        charmanderSalvaje.setNombre("mauricio");
        Charmander miCharmander = charmanderSalvaje;
        miCharmander.atacar(bullbasaurSalvaje);
        miCharmander.atacar(bullbasaurSalvaje, "MAR LLAMAS");
        
        bullbasaurSalvaje.setNombre("leo");
        Bullbasaur miBullbasaur = bullbasaurSalvaje;
        miBullbasaur.atacar(jigglypuffSalvaje);
        miBullbasaur.atacar(jigglypuffSalvaje, "ESPESURA");
        
        jigglypuffSalvaje.setNombre("leo");
        Jigglypuff miJigglypuff = jigglypuffSalvaje;
        miJigglypuff.atacar(pikachuSalvaje);
        miJigglypuff.atacar(pikachuSalvaje, "BRILLO MAGICO");
        
        machopSalvaje.setNombre("nenis");
        Machop miMachop = machopSalvaje;
        miMachop.atacar(jigglypuffSalvaje);
        miMachop.atacar(jigglypuffSalvaje, "GOLPE ROCA");
        
        squirtleSalvaje.setNombre("blue");
        Squirtle miSquirtle = squirtleSalvaje;
        miSquirtle.atacar(pikachuSalvaje);
        miSquirtle.atacar(pikachuSalvaje, "BURBUJAS");
    }
    
}
