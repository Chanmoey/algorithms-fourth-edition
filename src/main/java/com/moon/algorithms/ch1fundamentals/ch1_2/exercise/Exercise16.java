package com.moon.algorithms.ch1fundamentals.ch1_2.exercise;

/**
 * @author Chanmoey
 * @date 2023/9/15
 */
public class Exercise16 {
    public static void main(String[] args) {
        System.out.println(new Rational(1, 2));
        System.out.println(new Rational(-1, 2));
        System.out.println(new Rational(1, 2).plus(new Rational(1, 3)));
        System.out.println(new Rational(1, 2).minus(new Rational(1, 3)));
        System.out.println(new Rational(1, 2).times(new Rational(1, 3)));
        System.out.println(new Rational(1, 2).divides(new Rational(1, 3)));

    }
}
