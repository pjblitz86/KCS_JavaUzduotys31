package com.company;

import java.util.Scanner;

/**
 * Created by PauliusJ on 2017.05.25.
 */
public class Uzduotis7 {

    public Uzduotis7() {
        skaiciuIvedimasirVeiksmai();
    }

    // paklausti kiek nori ivesti skaiciu
    // ivedimo nuskaitymas
    // atvaizduoti ivestus skaicius > 100
    private void skaiciuIvedimasirVeiksmai() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nurodykite kiek norite ivesti skaiciu:");
        int kiekSkaciuIves = sc.nextInt();
        double[] skaiciai = new double[kiekSkaciuIves];
        System.out.println("Iveskite " + kiekSkaciuIves + " skaicius");
        for (int i = 0; i < kiekSkaciuIves; i++) {
            skaiciai[i] = sc.nextDouble();
        }
        System.out.println("Jusu ivesti skaiciai didesni nei 100 buvo:");
        for (double x : skaiciai) {
            if (x > 100) {
                System.out.println(x);
            }
        }
    }
}
