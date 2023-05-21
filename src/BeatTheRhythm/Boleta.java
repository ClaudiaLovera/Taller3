package BeatTheRhythm;

public class Boleta {

    Instrumento instrumento;
    private int codigo;
    private int precio;

    /**
     * Constructor de la clase
     * @param instrumento instrumento que se vende
     * @param codigo codigo del instrumento
     * @param precio precio del instrumento
     */
    public Boleta(Instrumento instrumento, int codigo, int precio) {
        this.instrumento = instrumento;
        this.codigo = codigo;
        this.precio = precio;
    }

    /**
     * Obtiene el codigo
     * @return codigo del instrumento
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Obtiene el precio
     * @return precio del instrumento
     */
    public int getPrecio() {
        return precio;
    }
}
