package ual.hmis.sesion05;

public class Ejercicio3 {

    public String enmascararPassword(String password) {
        int longitud = password.length();

        if (longitud < 5) {
            return "password demasiado corto";
        } else if (longitud <= 8) {
            return "********";
        } else if (longitud <= 40) {
            return "************";
        } else {
            return "password demasiado largo";
        }
    }
}
