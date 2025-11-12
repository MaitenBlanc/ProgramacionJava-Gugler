package ej5;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ejercicio5 {
    public static void main(String[] args) {
        Date fechaActual = new Date();
        
        System.out.println("Fecha actual: " + fechaActual);

        // Formateo dd/MM/yyyy
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        String fechaFormateada = formatoFecha.format(fechaActual);

        System.out.println("Fecha formateada: " + fechaFormateada);

        Calendar c = Calendar.getInstance();
        c.setTime(fechaActual);

        int fecha = c.get(Calendar.DATE);
        int hora = c.get(Calendar.HOUR);
        int minutos = c.get(Calendar.MINUTE);
        int segundos = c.get(Calendar.SECOND);

        System.out.println("Fecha: " + fecha);
        System.out.println("Hora: " + hora);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);
    }
}
