package mx.edu.itsur.pokebatalla.model;
import java.util.ArrayList;
/**
 *
 * @author JUANA DEL ROSARIO TENORIO RIVERA
 */
public class Machop  extends Pokemon{

    //Constructor default
    public Machop() {
        this.tipo = "LUCHA";
        this.hp = 70;
        this.ataque = 80;
        this.defensa = 50;
        this.nivel = 1;
        this.precision = 3;
        this.habilidades = new ArrayList<>();
        this.habilidades.add("GOLPE ROCA");
        this.habilidades.add("PUNTAPIE");
        //....
    }    
    
    //Constructor alterno 1
    public Machop(String nombre){
        this(); //invocando al constructor default
        this.nombre = nombre;
    }
    
    public void atacar(Pokemon oponente, String habilidad){
        if(habilidad.equals("GOLPE ROCA")){
            //Logica del daño por GOLPE ROCA
            System.out.println("Realizando GOLPE ROCA");
        }else if(habilidad.equals("PUNTAPIE")){
            //Logica del daño por PUNTAPIE
            System.out.println("Realizando PUNTAPIE");            
        }
        System.out.println("");
    }
   
}