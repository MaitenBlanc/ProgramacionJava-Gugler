
import ar.com.gugler.sgc.modelo.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class TPFinal1 {
    public static void main(String[] args) {
        // Instanciar 2 objetos Alumno y 1 Profesor (válidos)
        // Fechas de nacimiento e ingreso
        Date fechaNacAlu1 = Date.from(LocalDate.of(1912, 6, 23).atStartOfDay(ZoneId.systemDefault()).toInstant());
        Date fechaNacAlu2 = Date.from(LocalDate.of(1815, 12, 10).atStartOfDay(ZoneId.systemDefault()).toInstant());
        Date fechaNacProf = Date.from(LocalDate.of(1906, 12, 9).atStartOfDay(ZoneId.systemDefault()).toInstant());
        Date fechaIngresoProf = Date.from(LocalDate.of(1943, 1, 1).atStartOfDay(ZoneId.systemDefault()).toInstant());
        
        Alumno alumno1 = new Alumno("123", "12345678", "López", "María", fechaNacAlu1, "Calle 123", "3225415893", "maria@gmail.com");
        Alumno alumno2 = new Alumno("456", "87654321", "Pérez", "Juan", fechaNacAlu2, "Calle 315", "54213584", "juan@gmail.com");
        Profesor profesor = new Profesor("20-12345678-9", fechaIngresoProf, "254861352", "Martinez", "Fabricio", fechaNacProf, "Calle 654", "31589631", "fabricio@gmail.com");
        
        // Mostrar información
        System.out.println("Mostrar información desde Universidad: ");
        Universidad.mostrarDatos(profesor);
        Universidad.mostrarDatos(alumno1);
        Universidad.mostrarDatos(alumno2);

        // Crear curso 
        Curso curso = new Curso(24, 2532, "Programación en Java", profesor);
    
        // Agrego alumnos
        curso.agregarAlumno(alumno1);
        curso.agregarAlumno(alumno2);

        System.out.println("Curso '" + curso.getNombre() + "' creado.");
        System.out.println("Profesor asignado: " + curso.getProfesores().getApellido());
        System.out.println("Cantidad de alumnos inscriptos: " + curso.getAlumnos().size());

        // Probar admite inscripciones
        System.out.println("¿El curso admite inscripciones?: " + curso.admiteInscripciones());

        // Llenar el curso para probar el límite de 24
        System.out.println("Agregando 21 alumnos más para probar el límite...");
        for (int i = 0; i < 21; i++) {
            Alumno alum = new Alumno("Legajo"+i, "DNI" + i, "ape", "nom", fechaNacAlu1, "...", "...", "...");
            curso.agregarAlumno(alum);
        }
        
        System.out.println("Cantidad de alumnos inscriptos: " + curso.getAlumnos().size());
        System.out.println("¿El curso admite inscripciones?: " + curso.admiteInscripciones()); // Debería ser true

        // Agrego el alumno 24
        curso.agregarAlumno(new Alumno("Legajo24", "DNI24", "Test", "Alu", fechaNacAlu2, "...", "...", "..."));

        System.out.println("Cantidad de alumnos inscritos: " + curso.getAlumnos().size());
        System.out.println("¿El curso admite inscripciones?: " + curso.admiteInscripciones()); // Debería ser false
    }
}
