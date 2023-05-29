package ual.hmis.sesion05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Ejercicio2Test {

	@CsvSource({
			"user,pass,true",
			"'',pass,false",
			"user,'',false",
			"asdfghjklpoiuytrewqascvbnmlkjhg,pass,false",
			"user,asdfghjklpoiuytrewqascvbnmlkjhgaaaaaaaaaa,false",
			"user,wrongpassword,false",
			"usuario,pass,false" })

	@ParameterizedTest(name = "{index} => Con usuario ({0}) y password ({1}) sale {2}")
	void testLogin_parametrized(String username, String password, String result) {
		Ejercicio2 ej2 = new Ejercicio2();
		assertEquals(Boolean.parseBoolean(result), ej2.login(username, password));
	}

}
