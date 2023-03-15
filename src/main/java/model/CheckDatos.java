package model;

import java.util.Scanner;

public class CheckDatos {

    public CheckDatos(){

    }

    public static String checkNombre(){
        String nombre = "";
        boolean correcto = false;

        do{
            try {
                sc = new Scanner(System.in);
                System.out.println("Introduce un nombre para el gato");
                nombre = sc.nextLine();
                correcto = nombre.length() >= 3;
            } catch (ArithmeticException e) {
                System.out.println("Error. La longitud mínima ha de ser de 3.");
            }
        }while(!correcto);

        return nombre;
    }
}
