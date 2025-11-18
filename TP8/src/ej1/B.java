package ej1;

import ej1.exceptions.E2;
import ej1.exceptions.E3;

public class B {
    public void b() throws E3 {
        C c = new C();

        try {
            c.c();
        } catch (E2 e) {
            e.printStackTrace();
        }


        throw new E3();
    }


}
