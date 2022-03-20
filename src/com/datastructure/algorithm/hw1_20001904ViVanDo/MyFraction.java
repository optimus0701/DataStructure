package com.datastructure.algorithm.hw1_20001904ViVanDo;

public class MyFraction {
    private int numerator;
    private int denominator;

    public MyFraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public MyFraction add(MyFraction other) {
        int denominator = this.denominator * other.denominator;
        int numerator = this.numerator * other.denominator + this.denominator * other.numerator;
        int gcd = gcd(numerator, denominator);
        return new MyFraction(numerator / gcd, denominator / gcd);
    }

    public MyFraction add(MyFraction[] others) {
        MyFraction results = this;
        for (MyFraction fr : others) {
            results = results.add(fr);
        }
        return results;
    }


    public MyFraction subtract(MyFraction other) {
        int denominator = this.denominator * other.denominator;
        int numerator = this.numerator * other.denominator - this.denominator * other.numerator;
        int gcd = gcd(numerator, denominator);
        return new MyFraction(numerator / gcd, denominator / gcd);
    }

    public MyFraction subtract(MyFraction[] others) {
        MyFraction results = this;
        for (MyFraction fr : others) {
            results = results.subtract(fr);
        }
        return results;
    }

    public MyFraction multiply(MyFraction other) {
        int numerator = this.numerator * other.numerator;
        int denominator = this.denominator * other.denominator;
        int gcd = gcd(numerator, denominator);
        return new MyFraction(numerator / gcd, denominator / gcd);
    }

    public MyFraction multiply(MyFraction[] others) {
        MyFraction results = this;
        for (MyFraction fr : others) {
            results = results.multiply(fr);
        }
        return results;
    }

    public MyFraction divide(MyFraction other) {
        int numerator = this.numerator * other.denominator;
        int denominator = this.denominator * other.numerator;
        int gcd = gcd(numerator, denominator);
        return new MyFraction(numerator / gcd, denominator / gcd);
    }

    public MyFraction divide(MyFraction[] others) {
        MyFraction results = this;
        for (MyFraction fr : others) {
            results = results.divide(fr);
        }
        return results;
    }


    @Override
    public String toString() {
        if (numerator == denominator || denominator == 1) {
            return numerator + "";
        } else if (numerator == 0) {
          return 0 + "";
        } else {
            return numerator + "/" + denominator;
        }
    }

    public int gcd(int n1, int n2) {
        int gcd = 1;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
