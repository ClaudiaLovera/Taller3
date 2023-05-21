package BeatTheRhythm;

public class ListaBoleta {

    private Boleta[] boletas;
    private int cantBoletas;
    private int cantMax;

    /**
     * Constructor del contenedor
     * @param cantMax cantidad maxima del arreglo
     */
    public ListaBoleta(int cantMax) {
        boletas = new Boleta[cantMax];
        this.cantMax = cantMax;
        cantBoletas = 0;
    }

}
