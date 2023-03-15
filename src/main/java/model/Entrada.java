package model;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {


    public static void introducirValores(){
        Scanner sc = new Scanner(System.in);
        int A, B;

        try {
            System.out.println("Introduce un valor para A:");
            A = sc.nextInt();
            System.out.println("Introduce un valor para B:");
            B = sc.nextInt();
            System.out.println(A/B);
        }catch (InputMismatchException iME){
            System.out.println("Error. Has de introducir un número.");
        }catch (ArithmeticException aE){
            System.out.println("Error. No puedes dividir entre 0.");
        }

    }

    public static double introValoresVector(int a, int b){
        Scanner sc;
        double valor = 0;
        boolean correcto = false;

        do {
            try {
                sc = new Scanner(System.in);
                System.out.println("Introduce un valor (" + a + "/" + b + ")");
                valor = sc.nextDouble();
                correcto = true;
            } catch (InputMismatchException e) {
                System.out.println("Solo se permiten números.");
            }
        }while(!correcto);

        return valor;

    }

    public static void nombreGato(){
        Scanner sc;


    }

    public static int edadGato(){
        Scanner sc;
        int edad = 0;
        boolean correcto = false;

        do{
            try {
                sc = new Scanner(System.in);
                System.out.println("Introduce la edad del gato");
                edad = sc.nextInt();
                correcto = edad >= 0;
            } catch (ArithmeticException arEcx) {
                System.out.println("Error. La edad no puede ser negativa.");
            } catch (InputMismatchException inME){
                System.out.println("Error. Has de introducir un número.");
            }
        }while(!correcto);

        return edad;

    }

}
