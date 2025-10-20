package ej2_3_4;

public class Gato extends Animal implements Carnivoro {

    @Override
    public void hablar() {
        System.out.println("Miau");
    }

    @Override
    public void comerCarne() {
        System.out.println("Comiendo carne...");
    }
}
