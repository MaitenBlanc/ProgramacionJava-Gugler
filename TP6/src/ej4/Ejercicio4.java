package ej4;

public class Ejercicio4 {
    public static void main(String[] args) {
        StringBuffer string1 = new StringBuffer("Java Programmer");
        StringBuffer string2 = new StringBuffer("");
    
        string2.append(string1.reverse());
        
        System.out.println(string2);
    }
    
}
