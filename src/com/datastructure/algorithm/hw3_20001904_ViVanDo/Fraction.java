package com.datastructure.algorithm.hw3_20001904_ViVanDo;


public class Fraction {
    private float numerator;
    private float denominator;

    public Fraction(float numerator, float denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public float getNumerator() {
        return numerator;
    }

    public void setNumerator(float numerator) {
        this.numerator = numerator;
    }

    public float getDenominator() {
        return denominator;
    }

    public void setDenominator(float denominator) {
        this.denominator = denominator;
    }

    public Fraction normalize(Fraction c) {
        while (((int) c.numerator) != c.numerator || ((int) c.denominator) != c.denominator) {
            c.numerator = c.numerator * 10;
            c.denominator = c.denominator * 10;
        }
        if (c.denominator < 0) {
            c.numerator = c.numerator * -1;
            c.denominator = c.denominator * -1;
        }
        int gcd = gcd((int) c.numerator, (int) c.denominator);
        return new Fraction(c.numerator / gcd, c.denominator / gcd);
    }

    public Fraction normalize() {
        while (((int) numerator) != numerator || ((int) denominator) != denominator) {
            numerator = numerator * 10;
            denominator = denominator * 10;
        }
        if (denominator < 0) {
            numerator = numerator * -1;
            denominator = denominator * -1;
        }
        int gcd = gcd((int) numerator, (int) denominator);
        return new Fraction(numerator / gcd, denominator / gcd);
    }

    public Fraction add(Fraction c) {
        float denominator = this.denominator * c.denominator;
        float numerator = this.numerator * c.denominator + this.denominator * c.numerator;
        return normalize(new Fraction(numerator, denominator));
    }

    public Fraction minus(Fraction c) {
        float denominator = this.denominator * c.denominator;
        float numerator = this.numerator * c.denominator - this.denominator * c.numerator;
        return normalize(new Fraction(numerator, denominator));
    }

    public Fraction multi(Fraction c) {
        float numerator = this.numerator * c.numerator;
        float denominator = this.denominator * c.denominator;
        return normalize(new Fraction(numerator, denominator));
    }

    public Fraction divi(Fraction c) {
        float numerator = this.numerator * c.denominator;
        float denominator = this.denominator * c.numerator;
        return normalize(new Fraction(numerator, denominator));
    }

    @Override
    public String toString() {
        if (numerator == denominator || denominator == 1) {
            return numerator + "";
        } else if (numerator == 0) {
            return 0 + "";
        } else {
            StringBuilder result = new StringBuilder();
            if ((int) numerator == numerator) {
                result.append((int) numerator);
            } else {
                result.append(numerator);
            }

            result.append("/");

            if ((int) denominator == denominator) {
                result.append((int) denominator);
            } else {
                result.append(denominator);
            }
            return result.toString();
        }
    }

    public int gcd(int a, int b) {
        int gcd = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public double toDouble() {
        return numerator / denominator;
    }
}
