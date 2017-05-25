package com.company;

import java.util.Scanner;

/**
 * Created by PauliusJ on 2017.05.25.
 */
public class Uzduotis15 {

    public Uzduotis15() {
        nuskaitymas();
        isvedimas();
    }

    String zodis;
    int sumaA = 0;
    int arTuriA;

    // paklausti zodzio ir ji nuskaityti
    private void nuskaitymas() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite zodi");
        zodis = sc.nextLine();
        arTuriA = patikrinimas(zodis);
    }

    // patikriname ar yra simboliu a ivestame zodyje
    // jei turi pripliusuojam i suma, jei ne atitinkamai return
    private int patikrinimas(String z) {
        if (z.matches("a")) {
            for (int i = 0; i < z.length(); i++) {
                if (z.matches("a")) {
                    sumaA++;
                    return 1;
                }
            }
        } else {
            return 0;
        }
        return 0;
    }

    private void isvedimas() {
        if (arTuriA == 1) {
            System.out.println("Ivestas tekstas turi simboliu a. Ju suma: " + sumaA);
        } else if (arTuriA == 0) {
            System.out.println("Ivestame tekste nerasta simboliu a");
        }
    }


}
