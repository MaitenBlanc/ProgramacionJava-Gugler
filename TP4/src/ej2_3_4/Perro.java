package ej2_3_4;

public class Perro extends Animal implements Carnivoro {

    @Override
    public void hablar() {
        System.out.println("Guau");
    }

    @Override
    public void comerCarne() {
        System.out.println("Comiendo carne...");
    }

}
