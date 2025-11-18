package ej3;

import java.io.File;
import java.io.IOException;

public class CreadorArchivo {
    public static void crearArchivo(String nombre) throws IOException {
        File archivo = new File(nombre);
        archivo.createNewFile();
    }

    public static void main(String[] args) {
        String nombreArchi = "Z:\\cursoJava.txt";
        // Agrego un try/catch
        try {
            crearArchivo(nombreArchi);
        } catch (IOException e) {
            System.out.println("Error al crear el archivo");
            e.printStackTrace();
        }
    }
}
