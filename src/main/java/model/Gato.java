package model;

import java.io.Serializable;
import java.util.List;

public class Gato implements Serializable {

    private String nombre;
    private int edad;
    private final int minLongitudNombre = 3;
    private boolean longitudNombre;
    private boolean numPositivo;

    public Gato(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        try{
            longitudNombre = nombre.length() >= minLongitudNombre;
        }catch (ArithmeticException arExc){
            System.out.println("Error. La longitud mínima ha de ser de 3.");
        }
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
        try{
            numPositivo = edad > 0;
        }catch (Exception e){
            System.out.println("La edad ha de ser un número positivo.");
        }
    }

    //    public List<Gato> load(String nombreFichero){
//
//    }


    @Override
    public String toString() {
        return "Gato{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
