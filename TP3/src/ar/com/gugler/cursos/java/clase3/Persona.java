package ar.com.gugler.cursos.java.clase3;

public class Persona {

    private String apellido;
    private String nombre;
    private Long edad = 18L;
    public boolean esAdulto;

    // Constructores
    public Persona() {
        super();

    }

    public Persona(String apellido, String nombre, Long edad) {
        super();
        this.apellido = apellido;
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String apellido, String nombre, Long edad, boolean esAdulto) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.edad = edad;
        this.esAdulto = esAdulto;
    }

    // Métodos de la clase
    public void mostrarDatos() {
        System.out.println("Apellido: " + this.apellido + "\nNombre: " + this.nombre + "\nEdad: " + this.edad);
    }

    public void aumentarEdad() {
        this.edad++;
    }

    public void reducirEdad() {
        this.edad--;
    }

    public String obtenerNombreCompleto() {
        return "Nombre Completo: " + this.apellido + ", " + this.nombre;
    }

    // Getter 
    public boolean getEsAdulto() {
        if (this.edad >= 18) {
            return true;
        } else {
            return false;
        }

    }

    // Getters and setters
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getEdad() {
        return edad;
    }

    public void setEdad(Long edad) {
        this.edad = edad;
    }

}
