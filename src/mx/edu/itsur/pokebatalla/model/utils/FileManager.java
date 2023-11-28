/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.utils;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import mx.edu.itsur.pokebatalla.model.battles.Batalla;

/**
 *
 * @author JUANA DEL ROSARIO TENORIO RIVERA
 */
public class FileManager {

    public static final String Guarda_Batalla = "BatallaFinalGuardada.txt";

    public static void batallaGuardada(Batalla poke) {
        try (ObjectOutputStream GuardadoDeObjetos = new ObjectOutputStream(new FileOutputStream(Guarda_Batalla))) {
            GuardadoDeObjetos.writeObject(poke);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public static Batalla CargarPartida() {
        Batalla poke = null;
        try (ObjectInputStream GuardadoDeObjetos = new ObjectInputStream(new FileInputStream(Guarda_Batalla))) {
            poke = (Batalla) GuardadoDeObjetos.readObject();
        } catch (EOFException e) {
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return poke;
    }
    public static void EliminacionDeBatalla() {
        File file = new File(Guarda_Batalla);
        if (file.exists()) {
            file.delete();
            System.out.println("La partida que ha pasado ha sido completamente eliminada.");
        }
    }
}
