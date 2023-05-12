package Taller3;
import ucn.*;

import java.util.Objects;

public class SistemaBeatTheRyhthmImpl implements SistemaBeatTheRyhthm {

    ListaInstrumentos listaInstrumentos;
    public void menu(){
        String opcion = null;
        while(!Objects.equals(opcion, "4")){
            StdOut.println(""" 
                    [***Beat The Rhythm***]
                    
                    [1] Agregar instrumento
                    [2] Vender instrumento
                    [3] Consultar inventario
                    [4] Cerrar sesion
                    """);

            StdOut.print("Escoja una opcion: ");
            opcion = StdIn.readLine();

        }

    }

    public void agregarInstrumento(){
    String opcion = null;
    while (!Objects.equals(opcion,"d")){
        StdOut.println("**Agregar Instrumento**");
        StdOut.println("Seleccione el tipo de instrumento entre:  a)Cuerda b)Percusion c)Viento d)Volver al menu");
        StdOut.println("Ingrese su opcion: ");
        opcion = StdIn.readString();
        }

    }



}

