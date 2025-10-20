package ej2_3_4;

public class Vaca extends Animal implements Herbivoro {

    @Override
    public void hablar() {
        System.out.println("Muuu");
    }

    @Override
    public void comerHierva() {
        System.out.println("Comiendo hierva...");
    }
}
