package ej1;

import ej1.exceptions.E1;
import ej1.exceptions.E2;

public class C {
    public void c() throws E2 {
		
		try {
			throw new E1();
		} catch (E1 e) {
			e.printStackTrace();
		}
		
		throw new E2();
	}
}
