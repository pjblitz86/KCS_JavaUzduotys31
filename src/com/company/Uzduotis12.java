package com.company;

import java.util.Scanner;

/**
 * Created by PauliusJ on 2017.05.25.
 */
public class Uzduotis12 {

    public Uzduotis12() {
        ivedimas();
    }

    int[] skaiciai = new int[5];
    int maxSkaicius;

    // uzklausiame ir ivedame skaicius i masyva bei iskvieciame max reiksmes skaiciavimo metoda
    private void ivedimas() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite 5 sveikus skaicius:");
        for (int i = 0; i < skaiciai.length; i++) {
            skaiciai[i] = sc.nextInt();
        }
        maxSkaicius = maxGrazinimas(skaiciai);
        System.out.print("Max skaicius ivestame masyve yra: " + maxSkaicius);
    }

    // max reiksmes is ivesto masyvo skaiciavimas ir grazinimas
    private int maxGrazinimas(int[] a) {
        int maxReiksme = Integer.MIN_VALUE;
        int maxReiksmesIndeksas = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= maxReiksme) {
                maxReiksme = a[i];
                maxReiksmesIndeksas = i;
            }
        }
        return maxReiksme;
    }
}
