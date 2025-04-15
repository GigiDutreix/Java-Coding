package Labs.Lab06;

public class Vectorutil {

    public static double dotProduct(double[] vector1, double[] vector2) {
        if (vector1 == null || vector2 == null || vector1.length != vector2.length) {
            return 0;
        }

        double dotProduct = 0;
        for (int i = 0; i < vector1.length; i++) {
            dotProduct += vector1[i] * vector2[i];
        }
        return dotProduct;
    }
}