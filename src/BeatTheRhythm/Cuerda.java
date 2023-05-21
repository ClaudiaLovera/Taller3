package BeatTheRhythm;

public class Cuerda extends Instrumento{

    private int numCuerdas;

    //Tipo: acustico o electrico
    private String tipoInsCuerda;
    private String tipoCuerda;

    /**
     * Contructor de la clase
     * @param material material del instrumento
     * @param tipoInstrumento tipo de instrumento
     * @param codigo codigo del instrumento
     * @param precio precio del instrumento
     * @param stock stokc disponible del instrumento
     * @param numCuerdas numero de cuerdas de el instrumento
     * @param tipoInsCuerda tipo de instrumento de cuerda
     * @param tipoCuerda tipo de cuerda del instrumento
     */
    public Cuerda(String material, String tipoInstrumento, int codigo, int precio, int stock, int numCuerdas, String tipoInsCuerda, String tipoCuerda) {
        super(material, tipoInstrumento); //Esto de super no está en mi memoria ¿cuándo lo pasaron?
        this.numCuerdas = numCuerdas;
        this.tipoInsCuerda = tipoInsCuerda;
        this.tipoCuerda = tipoCuerda;
    }


    /**
     * Metodo que obtiene el numero de cuerdas del instrumento
     * @return el numero de cuerdas del instrumento
     */
    public int getNumCuerdas() {
        return numCuerdas;
    }

    /**
     * Metodo que establece el numero de cuerdas del instrumnto
     * @param numCuerdas nuevo numero de cuerdas del instrumento
     */

    public void setNumCuerdas(int numCuerdas) {
        this.numCuerdas = numCuerdas;
    }

    /**
     * Metodo que obtiene el tipo de instrumento de cuerda
     * @return tipo de instrumento de cuerda
     */
    public String getTipoInsCuerda() {
        return tipoInsCuerda;
    }

    /**
     * Metodo que establece el tipo de instrumento de cuerda
     * @param tipoInsCuerda nuevo tipo de instrumento de cuerda
     */
    public void setTipoInsCuerda(String tipoInsCuerda) {
        this.tipoInsCuerda = tipoInsCuerda;
    }

    /**
     * Metodo que obtiene el tipo de cuerda del instrumento
     * @return tipo de cuerda
     */
    public String getTipoCuerda() {
        return tipoCuerda;
    }

    /**
     * Metodo que establece el tipo de cuerda del instrumento
     * @param tipoCuerda nuevo tipo de cuerda del instrumento
     */
    public void setTipoCuerda(String tipoCuerda) {
        this.tipoCuerda = tipoCuerda;
    }
}
