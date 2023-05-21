package BeatTheRhythm;
import ucn.*;
import java.io.IOException;

//Claudia Lovera 21.008.288-3
//Antonia Flores 21.202.798-7
//Paralelo C2
public class Main {


    public static void main(String[] args) throws IOException {
        SistemaBeatTheRhythmImpl sistemaBeatTheRhythm = new SistemaBeatTheRhythmImpl();
        menu(sistemaBeatTheRhythm);
        lecturaArchivo(sistemaBeatTheRhythm);

    }
    private SistemaBeatTheRhythmImpl ListaInstrumentos;

    /**
     *
     * Metodo para leer el archivo que contiene los instrumentos
     * @param sistemaBeatTheRhythm instancia de SistemaBeatTheRhythm
     * @throws IOException captura las excepciones de campos en el txt
     */
    private static void lecturaArchivo(SistemaBeatTheRhythm sistemaBeatTheRhythm) throws IOException {
        ArchivoEntrada archivoEntrada = new ArchivoEntrada("instrumentos.txt");
    }

    /**
     * Menu principal del sistema
     * @param sistemaBeatTheRhythm instancia de SistemaBeatTheRhythm
     */
    private static void menu(SistemaBeatTheRhythm sistemaBeatTheRhythm){

        String opcion = "";
        while(!opcion.equalsIgnoreCase("D")){
            StdOut.println("""
                    *** Sistema Beat The Rhythm ***
                    
                    [A] Agregar instrumento
                    [B] Vender instrumento
                    [C] Consultar inventario
                    [D] Salir
                    
                    Ingrese su opcion (A, B, C o D)""");

            opcion = StdIn.readString();
            switch(opcion){
                case "A" -> agregarInstrumento(sistemaBeatTheRhythm);
                case "B" -> venderInstrumento(sistemaBeatTheRhythm);
                case "C" -> consultarInventario(sistemaBeatTheRhythm);
                case "D" -> salirDelSistema(sistemaBeatTheRhythm);
            }
        }
    }


    /**
     * Menu para agregar instrumentos
     * @param sistemaBeatTheRhythm instancia de SistemaBeatTheRhythm
     */
    private static void agregarInstrumento(SistemaBeatTheRhythm sistemaBeatTheRhythm){
        String opcion = "";
        while(opcion.equalsIgnoreCase("D")){
            StdOut.println("""
                    *** Agregar instrumento ***
                    
                    [A] Cuerda
                    [B] Percusion
                    [C] Viento
                    [D] Volver al menu principal
                    
                    Ingrese su opcion (A, B, C o D)""");

            opcion = StdIn.readString();
            switch(opcion){
                case "A" -> agregarInsCuerda(sistemaBeatTheRhythm);
                case "B" -> agregarInsPercusion(sistemaBeatTheRhythm);
                case "C" -> agregarInsViento(sistemaBeatTheRhythm);
                case "D" -> StdOut.println("... Cargando menú anterior ...");

            }
        }
    }

    /**
     * Agrega los instrumento de tipo cuerda
     * @param sistemaBeatTheRhythm instancia de SistemaBeatTheRhythm
     */
    private static void agregarInsCuerda(SistemaBeatTheRhythm sistemaBeatTheRhythm){

        StdOut.println("*** Agregar instrumento : Cuerda ***");
        int codigo = 012;
        //Stock
        double precio = Math.random();
        int stock = 1;
        StdOut.println("Ingrese el tipo de instrumento(Guitarra,Bajo,Violin,Arpa)");
        String tipoInsCuerda = StdIn.readString();
        StdOut.println("Ingrese el tipo de cuerda del instrumento(Nylon, acera, tripa)");
        String tipoCuerda = StdIn.readString();
        StdOut.println("Ingrese el numero de cuerdas del instrumento");
        int numCuerdas =  StdIn.readInt();
        StdOut.println("Ingrese el material del instrumento(madera,metal)");
        String material = StdIn.readString();
        StdOut.println("Ingrese el tipo de instrumento(acustico o electrico)");
        String tipoIns = StdIn.readString();


        Cuerda cuerda = new Cuerda(tipoInsCuerda,tipoCuerda,numCuerdas,material,tipoIns,codigo,stock,precio);

    }

    /**
     * Agrega los instrumentos de tipo Percusion
     * @param sistemaBeatTheRhythm instancia de SistemaBeatTheRhythm
     */
    private static void agregarInsPercusion(SistemaBeatTheRhythm sistemaBeatTheRhythm){
        StdOut.println("*** Agregar instrumento : Percusion ***");
        StdOut.println("Ingrese el tipo de instrumento(Bongo, Cajon, Campanas tubulares, Bombo)");
        String tipoinsPercusion = StdIn.readString();
        StdOut.println("Ingrese el tipo de percusion (Membranofono o idiofono)");
        String tipoPercusion = StdIn.readString();
        StdOut.println("Ingrese el material de el instrumento");
        String material = StdIn.readString();
        StdOut.println("Ingrese la altura del instrumento (Definida o indefinida))");
        String altura = StdIn.readString();

        Percusion percusion = new Percusion(tipoinsPercusion,tipoPercusion,material,altura);
    }

    /**
     * Agrega instrumentos de tipo viento
     * @param sistemaBeatTheRhythm instancia de SistemaBeatTheRhythm
     */
    private static void agregarInsViento(SistemaBeatTheRhythm sistemaBeatTheRhythm) {
        StdOut.println("*** Agregar instrumento : Viento ***");
        StdOut.println("Ingrese el tipo de instrumento(Trompeta, Saxofon , Clarinete, Flauta tarversa)");
        String tipoinsViento = StdIn.readString();
        StdOut.println("Ingrese el material del instrumento ");
        String material = StdIn.readString();

        Viento viento = new Viento(tipoinsViento,material);

    }

    /**
     * Metodo para vender instrumentos
     * @param codigo codigo del intrumento a vender
     */




    private static void venderInstrumento(String codigo) {
        StdOut.println(" *** Vender Instrumento *** ");
        StdOut.println("Ingrese el codigo del instrumento que desea vender: ");
        String codigo = StdIn.readString();

        venderInstrumento(codigo);

    }

    /**
     * Metodo que consulta el inventario disponible
     * @param sistemaBeatTheRhythm instancia de SistemaBeatTheRhythm
     */
    private static void consultarInventario(SistemaBeatTheRhythm sistemaBeatTheRhythm){
        StdOut.println("""
                *** Inventario ***
                
                A) Instrumento tipo: Cuerda
                B) Instrumento tipo: Viento
                C) Instrumento tipo: Percusion
                D) Volver al menu principal
                
                Ingrese el tipo de instrumento del cual desea ver el stock:  
                
                """);
        String opcion = StdIn.readString();

        while(!opcion.equalsIgnoreCase("D")){
            if(opcion.equalsIgnoreCase("A")){
                StdOut.println("El stock de instrumentos de tipo CUERDA es: " + Cuerda.getStock);

            }
            else if(opcion.equalsIgnoreCase("B")){
                StdOut.println("El stock de instrumentos de tipo VIENTO es: " + Viento.getStock);

            }else if(opcion.equalsIgnoreCase("C")){
                StdOut.println("El stock de instrumentos de tipo PERCUSION es: " + Percusion.getStock);

            }
        }
    }

    /**
     * Metodo para salir del programa
     * @param sistemaBeatTheRhythm instancia de SistemaBeatTheRhythm
     */
    private static void salirDelSistema(SistemaBeatTheRhythm sistemaBeatTheRhythm){
        ArchivoSalida archivoSalida = new ArchivoSalida("Instrumentos.txt");
        for (int i = 0;i < ListaInstrumentos.getCantInstrumentos(); i++){

            Registro registro = new Registro(5);

        }

    }

}
