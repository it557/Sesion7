package ual.hmis.sesion05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Ejercicio3Test {

    private Ejercicio3 ejercicio3 = new Ejercicio3();

    @ParameterizedTest
    @CsvSource({
            "pass, password demasiado corto",
            "password, ********",
            "password123456, ************",
            "cadenade41caracteresparaejemplo1234567890, password demasiado largo"
    })
    public void enmascararPassword_validarCadena(String password, String expected) {
        String enmascarado = ejercicio3.enmascararPassword(password);
        assertEquals(expected, enmascarado);
    }
}
