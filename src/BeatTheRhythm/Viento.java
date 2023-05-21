package BeatTheRhythm;

public class Viento extends Instrumento {


    /**
     *
     * @param material        material del instrumento
     * @param tipoInstrumento tipo de instrumento
     * @param codigo codigo del intrumento
     * @param precio precio del instrumento
     * @param stock stock del instrumento
     */
    public Viento(String material, String tipoInstrumento, int codigo, int precio, int stock) {
        super(material, tipoInstrumento, codigo, precio, stock);
    }
}
