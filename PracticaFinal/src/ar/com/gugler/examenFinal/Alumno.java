package ar.com.gugler.examenFinal;

import java.util.List;

public class Alumno extends Persona {
    private List<Integer> notas;

    public Alumno(List<Integer> notas, String apellido, int dni, String nombre) {
        super(dni, apellido, nombre);
        if (notas != null) {
            this.notas = notas;
        }
    }

    public List<Integer> getNotas() {
        return notas;
    }

    public void setNotas(List<Integer> notas) {
        this.notas = notas;
    }
    
    public double getPromedio() throws Exception {
        if (notas.isEmpty()) {
            throw new Exception("El alumno " + this.getNombre() + " no tiene notas para calcular el promedio.");
        }

        double suma = 0;
        for (int nota : notas) {
            suma += nota;
        }
        return suma / notas.size();
    }

    // Método que muestra si el alumno está aprobado o no
    public boolean isApproved() {
        try {
            double promedio = getPromedio();
            boolean notasMayor70 = true;

            for (int nota : notas) {
                if (nota <= 70) {
                    notasMayor70 = false;
                    break;
                }
            }

            return promedio >= 80 && notasMayor70;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
