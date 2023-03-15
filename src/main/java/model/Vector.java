package model;

public class Vector {

    private double[] vector;

    public Vector() {
        vector = new double[5];

        for(int i = 0; i < vector.length ; i++)
            vector[i] = Entrada.introValoresVector((i+1), vector.length);
    }
}
