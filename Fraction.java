import java.lang.Math;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = Math.abs(numerator);
        if (numerator * denominator < 0) {
            this.numerator = this.numerator * -1;
        }
        this.denominator = Math.abs(denominator);
    }

    public int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    public Fraction add(Fraction other) {
        int newNumerator = (this.getNumerator() * other.getDenominator()) + (other.getNumerator() * this.getDenominator());
        int newDenominator = this.getDenominator() * other.getDenominator();
        Fraction sum = this.simplify(newNumerator, newDenominator);
        return sum;
    }

    public Fraction subtract(Fraction other) {
        int newNumerator = (this.getNumerator() * other.getDenominator()) - (other.getNumerator() * this.getDenominator());
        int newDenominator = this.getDenominator() * other.getDenominator();
        Fraction sum = this.simplify(newNumerator, newDenominator);
        return sum;
    }

    public Fraction multiply(Fraction other) {
        int newNumerator = this.getNumerator() * other.getNumerator();
        int newDenominator = this.getDenominator() * other.getDenominator();
        Fraction product = this.simplify(newNumerator, newDenominator);
        return product;
    }

    public Fraction simplify(int numerator, int denominator) {
      
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }

        if (numerator == 0) {
             return new Fraction(0, 1);
        }

        int simplifiedNumerator = numerator;
        int simplifiedDenominator = denominator;

        for (int i = simplifiedDenominator; i > 1; i--) {
            if (simplifiedNumerator % i == 0 && simplifiedDenominator % i == 0) {
                simplifiedNumerator = simplifiedNumerator / i;
                simplifiedDenominator = simplifiedDenominator / i;
                 break;
            }
        }
        return new Fraction(simplifiedNumerator, simplifiedDenominator);
    }

}