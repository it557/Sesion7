package ual.hmis.sesion05;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class Ejercicio5Test {
    public static List<List<Double>> testCases() {
        List<List<Double>> cases = new ArrayList<>();
        List<Double> nula = null;
        List<Double> empty = new ArrayList<>();
        List<Double> l1 = new ArrayList<>();
        List<Double> l2 = new ArrayList<>();
        l1.add(1.0);
        l1.add(2.0);
        l1.add(3.0); // Primera lista
        l2.add(3.0);
        l2.add(4.0);
        l2.add(5.0); // segunda lista
        cases.add(nula);
        cases.add(empty);
        cases.add(l1);
        cases.add(l2);
        return cases;
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void testUnion(List<Double> list) {
        new Ejercicio5(); // para cobertura del 100
        List<Double> emptyList = new ArrayList<>();
        List<Double> l3 = new ArrayList<>();
        l3.add(6.0);
        l3.add(7.0);
        l3.add(8.0);

        List<Double> resultEmptyList = Ejercicio5.union(list, emptyList);
        List<Double> resultList3 = Ejercicio5.union(list, l3);
        // Resultado si list está vacía o es nula
        if (list == null || list.isEmpty()) {
            assertTrue("La unión debería ser una lista vacía", resultEmptyList.isEmpty());
            assertEquals(l3, resultList3);
        } else {
            assertEquals(resultEmptyList.size(), list.size());
            assertEquals(resultList3.size(), list.size() + 3);
            List<Double> cero = new ArrayList<>();
            cero.add(0.0);
            assertEquals(resultList3.size() + 1, Ejercicio5.union(resultList3, cero).size());
        }
    }
}
