package BeatTheRhythm;

//Aqui solo van los metodos declarados
public interface SistemaBeatTheRhythm {

    /**
     * Menu principal del sistema
     * @param sistemaBeatTheRhythm instancia de SistemaBeatTheRhythm
     */
    void menu(SistemaBeatTheRhythm sistemaBeatTheRhythm);

    /**
     * Metodo para salir del sistema
     * @param sistemaBeatTheRhythm instancia de SistemaBeatTheRhythm
     */

    void salirDelSistema(SistemaBeatTheRhythm sistemaBeatTheRhythm);

    /**
     * Metodo para consultar inventario segun las preferencias del cliente
     * @param sistemaBeatTheRhythm instancia de SistemaBeatTheRhythm
     */

    void consultarInventario(SistemaBeatTheRhythm sistemaBeatTheRhythm);

    /**
     * Metodo para vender instrumentos
     * @param codigo codigo del instrumento
     */

    void venderInstrumento(String codigo);

    /**
     * Metodo para agregar instrumentos de viento
     * @param sistemaBeatTheRhythm instancia de SistemaBeatTheRhythm
     */
    void agregarInsViento(SistemaBeatTheRhythm sistemaBeatTheRhythm);

    /**
     * Metodo para agregar instrumentos de percusion
     * @param sistemaBeatTheRhythm instancia de SistemaBeatTheRhythm
     */
    void agregarInsPercusion(SistemaBeatTheRhythm sistemaBeatTheRhythm);

    /**
     * Metodos para agregar instrumentos de cuerda
     * @param sistemaBeatTheRhythm instancia de SistemaBeatTheRhythm
     */
    void agregarInsCuerda(SistemaBeatTheRhythm sistemaBeatTheRhythm);

    /**
     * Metodo para agregar instrumentos
     * @param sistemaBeatTheRhythm instancia de SistemaBeatTheRhythm
     */
    void agregarInstrumento(SistemaBeatTheRhythm sistemaBeatTheRhythm);

    /**
     * Lee el archivo de entrada
     * @param sistemaBeatTheRhythm instancia de SistemaBeatTheRhythm
     */
    void lecturaArchivo(SistemaBeatTheRhythm sistemaBeatTheRhythm);



}
