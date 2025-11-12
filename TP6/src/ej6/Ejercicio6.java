package ej6;

public class Ejercicio6 {
    public static void main(String[] args) {
        String propSistema = System.getProperty("os.name");
        String valorPath = System.getProperty("java.class.path");
        String directorio = System.getProperty("java.home");
        String usuario = System.getProperty("user.name");

        System.out.println("Propiedades del sistema");
        System.out.println("Sistema operativo: " + propSistema);
        System.out.println("Valor del path: " + valorPath);
        System.out.println("Directorio de la maquina virtual: " + directorio);
        System.out.println("Nombre de usuario: " + usuario);
    }
}
