public class FractionTester {

    public static void main(String[] args) {
        Fraction number = new Fraction(3, 3);
        int numerator = number.getNumerator();
        int denominator = number.getDenominator();

        System.out.printf("Numerator:%d \n", numerator);
        System.out.printf("Denominator:%d \n", denominator); 


        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 3);

        Fraction f3 = f1.add(f2);
        System.out.println(f3.toString());

        Fraction f4 = f1.subtract(f2);
        System.out.println(f4.toString());

        Fraction f5 = f1.multiply(f2);
        System.out.println(f5.toString());

        Fraction f6 = f1.multiply(f2);
        System.out.println(f6.toString());
    }

   

}