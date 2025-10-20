package ar.com.gugler.cursos.java.clase3;

public class Principal {

    public static void main(String[] args) {
        // a)
        Persona p1;

        // b)
        p1 = new Persona();

        // c) 
        Persona p2 = new Persona("Gomez", "Jorge", 35L);

        // d)
        System.out.println("Datos de p1: ");
        if (p1.getEsAdulto()) {
            p1.mostrarDatos();
        } else {
            System.out.println("La persona no es mayor de edad.");
        }

        // e)
        p2.aumentarEdad();

        // f)
        System.out.println("Datos de p2: ");
        if (p2.getEsAdulto()) {
            p2.mostrarDatos();
        } else {
            System.out.println("La persona no es mayor de edad.");
        }

        // g)
        p1.setNombre("Exequiel");
        p1.setApellido("Rodriguez");
        p1.setEdad(24L);

        // h)
        Persona p3;

        // i)
        p3 = new Persona();

        // j)
        p3.setNombre(p1.getNombre());
        p3.setApellido(p2.getApellido());
        p3.setEdad(16L);

        // k)
        System.out.println("Datos de p3: ");
        if (p3.getEsAdulto()) {
            p3.mostrarDatos();
        } else {
            System.out.println("La persona no es mayor de edad.");
        }

    }
}
