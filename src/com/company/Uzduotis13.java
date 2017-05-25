package com.company;

import java.util.Scanner;

/**
 * Created by PauliusJ on 2017.05.25.
 */
public class Uzduotis13 {

    public Uzduotis13() {
        ivedimas();
    }

    int[] skaiciai = new int[5];
    int minSkaicius;

    // uzklausiame ir ivedame skaicius i masyva bei iskvieciame min reiksmes skaiciavimo metoda
    private void ivedimas() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite 5 sveikus skaicius:");
        for (int i = 0; i < skaiciai.length; i++) {
            skaiciai[i] = sc.nextInt();
        }
        minSkaicius = minGrazinimas(skaiciai);
        System.out.print("Maziausias skaicius ivestame masyve yra: " + minSkaicius);
    }

    // min reiksmes is ivesto masyvo skaiciavimas ir grazinimas
    private int minGrazinimas(int[] a) {
        int minReiksme = Integer.MAX_VALUE;
        int minReiksmesIndeksas = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < minReiksme) {
                minReiksme = a[i];
                minReiksmesIndeksas = i;
            }
        }
        return minReiksme;
    }
}
