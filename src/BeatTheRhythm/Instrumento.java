package BeatTheRhythm;

public abstract class Instrumento {


    private String material;
    private String tipoInstrumento;
    private int codigo;
    private int precio;
    private int stock;

    /**
     * Contructor de la clase
     * @param material material del instrumento
     * @param tipoInstrumento tipo de instrumento
     */

    public Instrumento(String material, String tipoInstrumento, int codigo, int precio, int stock) {
        this.material = material;
        this.tipoInstrumento = tipoInstrumento;
        this.codigo = codigo;
        this.precio = precio;
        this.stock = stock;
    }

    /**
     * Obtiene el tipo de material del instrumento
     * @return material del instrumento
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Obtiene el tipo de instrumento
     * @return tipo de instrumento
     */
    public String getTipoInstrumento() {
        return tipoInstrumento;
    }

    /**
     * Obtiene el codigo del instrumento
     * @return codigo del instrumento
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Obtiene el precio del instrumento
     * @return precio del instrumento
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Obtiene el stock del instrumento
     * @return stock del instrumento
     */
    public int getStock() {
        return stock;
    }

    /**
     * Establece el material del instrumento
     * @param material nuevo material del instrumento
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * Establece el tipo de instrumento
     * @param tipoInstrumento nuevo tipo de instrumento
     */
    public void setTipoInstrumento(String tipoInstrumento) {
        this.tipoInstrumento = tipoInstrumento;
    }

    /**
     * Establece el codigo del instrumento
     * @param codigo nuevo codigo del instrumento
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Establece el precio del instrumento
     * @param precio nuevo precio del instrumento
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * Establece el stock del instrumento
     * @param stock nuevo stock del instrumento
     */
    public void setStock(int stock) {
        this.stock = stock;
    }
}
