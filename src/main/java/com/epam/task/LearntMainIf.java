package com.epam.task;

public class LearntMainIf {
    public static void main(String[] args) {
    }

    public static double perimetr(double A, double B, String name) {
        double rezultat;
        if (name == null) {
            if (A > 0 && B > 0) {
                rezultat = 2 * (A + B);
            } else {
                rezultat = -1;
            }
        } else {
            throw new IllegalArgumentException("" + name);
        }
        return rezultat;
    }
}
