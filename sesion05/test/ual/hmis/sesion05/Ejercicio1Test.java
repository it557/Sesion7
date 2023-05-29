package ual.hmis.sesion05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Ejercicio1Test {

	@ParameterizedTest(name = "{index} => Con entrada ({0}) sale {1}")
	@CsvSource({ "4, 1",
			"10, 1",
			"6, 1",
			"14, 7" })

	void testTransformar(int input, int expected) {
		Ejercicio1 ej1 = new Ejercicio1();
		assertEquals(expected, ej1.transformar(input));

	}

}
