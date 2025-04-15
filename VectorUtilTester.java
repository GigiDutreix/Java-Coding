package Labs.Lab06;

public class VectorUtilTester {

    public static void main(String[] args) {
        double[] a = {1, 2, 3};
        double[] b = {4, 5, 6};

        double result = VectorUtil.dotProduct(a, b);
        System.out.println(result); // Output: 32.0

        double[] c = {2.5, 3.0, 1.5};
        double[] d = {1.0, 2.0, 3.0};

        double result2 = VectorUtil.dotProduct(c, d);
        System.out.println(result2);

         double[] e = {1, 2};
         double[] f = {3, 4};

        double result3 = VectorUtil.dotProduct(e, f);
        System.out.println(result3);
    }
}