
import ar.com.gugler.examenFinal.Alumno;
import ar.com.gugler.examenFinal.Curso;
import java.util.ArrayList;
import java.util.List;

public class Final1 {
    public static void main(String[] args) throws Exception {
        
        // Alumno 1
        List<Integer> notas1 = new ArrayList<>();
        notas1.add(90);
        notas1.add(85);
        notas1.add(95);

        // Alumno 2
        List<Integer> notas2 = new ArrayList<>();
        notas2.add(100);
        notas2.add(80);
        notas2.add(60);

        // Alumno 3
        List<Integer> notas3 = new ArrayList<>();
        notas3.add(10);
        notas3.add(20);
        notas3.add(30);

        // Alumno 4
        List<Integer> notas4 = new ArrayList<>();
        
        // Intanciación alumnos
        Alumno a1 = new Alumno(notas1, "Martinez", 12354632, "Juan");
        Alumno a2 = new Alumno(notas2, "Ramirez", 1651321, "Maria");
        Alumno a3 = new Alumno(notas3, "Lopez", 65416132, "Rolo");
        // Pruba alumno sin notas
        Alumno a4 = new Alumno(notas4, "Gimenez", 545213, "Lautaro");

        // Creo un curso
        Curso cursoJava = new Curso("Java", null);
        cursoJava.addStudent(a1);
        cursoJava.addStudent(a2);
        cursoJava.addStudent(a3);
        cursoJava.addStudent(a4);


        // Mostrar todos los alumnos ordenados por promedio
        cursoJava.listarAlumnosPorPromedio();

        // Mostrar alumnos aprobados
        cursoJava.ListarAlumnosAprobados();

        // Mostrar alumnos desaprobados
        cursoJava.ListarAlumnosDesaprobados();
    }
}
