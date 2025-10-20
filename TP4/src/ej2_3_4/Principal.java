package ej2_3_4;

public class Principal {

    public static void main(String[] args) {
        Animal miPerro = new Perro();
        Animal miGato = new Gato();
        Animal miVaca = new Vaca();

        hablarAnimal(miPerro);
        hablarAnimal(miGato);
        hablarAnimal(miVaca);

        comerAnimal(miPerro);
        comerAnimal(miGato);
        comerAnimal(miVaca);

    }

    public static void hablarAnimal(Animal a) {
        a.hablar();
    }

    public static void comerAnimal(Animal a) {
        if (a instanceof Carnivoro) {
            Carnivoro c = (Carnivoro) a;
            c.comerCarne();
        } else if (a instanceof Herbivoro) {
            Herbivoro h = (Herbivoro) a;
            h.comerHierva();
        }
    }
}
