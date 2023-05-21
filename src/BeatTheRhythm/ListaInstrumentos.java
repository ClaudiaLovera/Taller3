package BeatTheRhythm;

import edu.princeton.cs.stdlib.In;
import ucn.StdOut;

import java.awt.*;

public class ListaInstrumentos {

    private Instrumento[] instrumentos;
    private int cantInstrumentos;
    private int cantMax;

    /**
     * Constructor del contenedor
     * @param cantMax cantidad maxima del arreglo
     */
    public ListaInstrumentos(int cantMax) {
        instrumentos = new Instrumento[cantMax];
        this.cantMax = cantMax;
        cantInstrumentos = 0;
    }



    /**
     * Agrega instrumentos a la lista
     * @param instrumento instrumento a agregar
     */
    public void agregarInstrumento(Instrumento instrumento) {
        if (cantMax == cantInstrumentos) {
            return;
        }

        this.instrumentos[cantInstrumentos] = instrumento;
        cantInstrumentos++;
    }

    /**
     * Buscar instrumento por código
     * @param codigo codigo del instrumento a buscar
     * @return instrumento encontrado
     */

    public Instrumento buscarCodigo(int codigo) {
        for (Instrumento instrumento : instrumentos) {
            if (instrumento.getCodigo() == codigo) {
                return instrumento;
            }
        }
        return null; //No se encuentra el instrumento </3
    }

    /**
     * Buscar instrumento por tipo
     * @param tipo tipo de instrumento a buscar
     * @return instrumento encontrado
     */

    public ListaInstrumentos buscarInstTipo(String tipo) {

        for (Instrumento instrumento : instrumentos) {
            if (instrumento instanceof Cuerda && tipo.equalsIgnoreCase("cuerda")) {

            } else if (instrumento instanceof Percusion && tipo.equalsIgnoreCase("percusiom")) {

            } else if (instrumento instanceof Viento && tipo.equalsIgnoreCase("viento")){

            }
        }

        return buscarInstTipo(tipo);
    }


    /**
     * Metodo usado para vender instruemntos segun el codigo
     * @param codigo codigo del instrumento a vender
     */
    public void venderInstrumento(int codigo) {
        Instrumento instrumento = buscarCodigo(codigo);
        if (instrumento != null) {
            if (instrumento.getStock() > 0) {
                instrumento.setStock(instrumento.getStock() -1); //Se actualiza el stock c:
                //Se genera la boleta con (instrumento)

            } else {
                StdOut.println("No hay stock.");
            }

        } else {
            StdOut.println("Vuelva a intentarlo"); //En caso de que se ingrese un dato errone
        }
    }

    /**
     * Metodo para generar la boleta
     * @param instrumento instrumento el cual aparece en la boleta
     */
    public void generarBoleta(Instrumento instrumento) {
        StdOut.println("Boleta");
        StdOut.println("i. Instrumento vendido: "+instrumento.getCodigo());
        StdOut.println("ii. Precio: $"+instrumento.getPrecio());

        //Ojala esto este bueno porque se me acaba de ocurrir y en mi mente, funciona
    }

    /**
     * Desplegar inventario
     */
    public void desplegarInventario() {
        for (Instrumento instrumento : instrumentos) {
            StdOut.println("Código: "+instrumento.getCodigo());
            StdOut.println("Precio: "+instrumento.getPrecio());

            if (instrumento instanceof Cuerda) { //Intrumento cuerda
                Cuerda instCuerda = (Cuerda) instrumento;
                //Desplegar todos los datos de instrumento de cuerdas

            } else if (instrumento instanceof Percusion) { //Instrumento percusión
                Percusion instPercusion = (Percusion) instrumento;
                //Desplegar todos los datos de instrumento de percusión

            } else if (instrumento instanceof Viento) { //Instrumento de viento
                Viento instViento = (Viento) instrumento;
                //Desplegar todos los datos de instrumento de viento
            }

        }
        StdOut.println();

    }

    public int getCantInstrumentos() {
        return cantInstrumentos;
    }
}
