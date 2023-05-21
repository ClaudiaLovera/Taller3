package BeatTheRhythm;

public class Percusion extends Instrumento {

    private String tipoPercusion;
    private String altura;

    /**
     * Constructor de la clase
     * @param material material del instrumento
     * @param tipoInstrumento tipo de instrumento
     * @param tipoPercusion tipo de percusion del instrumento
     * @param altura altura del instrumento
     * @param codigo codigo del instrumento
     * @param precio precio del instrumento
     * @param stock stock del instrumento
     */
    public Percusion(String material, String tipoInstrumento, int codigo, int precio, int stock, String tipoPercusion, String altura) {
        super(material, tipoInstrumento, codigo, precio, stock);
        this.tipoPercusion = tipoPercusion;
        this.altura = altura;
    }

    /**
     * Obtiene el tipo del percusion del instrumento
     * @return percusion del instrumento
     */
    public String getTipoPercusion() {
        return tipoPercusion;
    }

    /**
     * Establece el tipo de percusion del instrumento
     * @param tipoPercusion nuevo tipo de percusion del instrumento
     */
    public void setTipoPercusion(String tipoPercusion) {
        this.tipoPercusion = tipoPercusion;
    }

    /**
     * Obtiene la altura del instrumento
     * @return altura del instrumento
     */
    public String getAltura() {
        return altura;
    }

    /**
     * Establece la nueva altura del instrumento
     * @param altura nueva altura del instrumento
     */
    public void setAltura(String altura) {
        this.altura = altura;
    }


}
