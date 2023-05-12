package Taller3;

public class ListaInstrumentos {
    private int cantMax;
    private int cantActual;
    private Instrumentos[] lista;

    public ListaInstrumentos(int cantMaxima){
        this.cantActual = 0;
        this.cantMax = cantMax;
        lista = new Instrumentos[cantMax];
    }
    //Agrega instrumentos a la lista
    public void agregar(Instrumentos nuevoInstrumento){
        if (cantActual == cantMax){
            return;
        }
        this.lista[cantActual] = nuevoInstrumento;
        cantActual++;
    }

}
