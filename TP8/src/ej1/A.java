package ej1;

import ej1.exceptions.E3;

public class A {
    public void a() {
		B b = new B();
		
		try {
			b.b();
		} catch (E3 e) {
			e.printStackTrace();
		}
	}
}
