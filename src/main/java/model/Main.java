package model;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
//        Entrada.introducirValores();
//        Vector v = new Vector();
        String nombreGato;
        int edadGato;

        ArrayList<Gato> gatoArrayList = new ArrayList<>();

        for(int i = 1 ; i <= 5 ; i++){
            gatoArrayList.add(new Gato(Entrada.nombreGato(), Entrada.edadGato()));
        }
    }
}