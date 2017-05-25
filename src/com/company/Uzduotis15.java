package com.company;

import java.util.Scanner;

/**
 * Created by PauliusJ on 2017.05.25.
 */
public class Uzduotis15 {

    public Uzduotis15() {
        nuskaitymas();
    }

    String zodis;

    // paklausti zodzio ir ji nuskaityti
    private void nuskaitymas() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite zodi");
        zodis = sc.nextLine();
        patikrinimas(zodis);
    }

    // patikriname ar yra simboliu a ivestame zodyje
    // jei turi pripliusuojam i suma, jei ne atitinkamai return
    private int patikrinimas(String z) {
        int result = 0;
        for (int i = 0; i < z.length(); i++) {
            if (z.charAt(i) == 'a') {
                result++;
            }
        }
        System.out.println("Ivestas tekstas turi simboliu a. Ju suma: " + result);
        return result;
    }

}



