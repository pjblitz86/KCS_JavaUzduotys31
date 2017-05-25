package com.company;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by PauliusJ on 2017.05.25.
 */
public class Uzduotis30 {

    public Uzduotis30() {
        uzklausimas();
        isvedimas();
    }

    int[] ivestasMasyvas;
    int[] didejantisMasyvas;

    // uzklausiam koki kieki nori ivesti i masyva ir nuskaitom i masyva
    private void uzklausimas() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite kiek skaiciu noresite ivesti:");
        int kiek = sc.nextInt();
        ivestasMasyvas = new int[kiek];
        System.out.println("Iveskite " + kiek + " sveika skaiciu:");
        for (int i = 0; i < ivestasMasyvas.length; i++) {
            System.out.println("Iveskite " + (i+1)+ " skaiciu");
            ivestasMasyvas[i] = sc.nextInt();
        }
    }

    // surikiuoja gauta masyva didejimo tvarka
    private int[] surikiuotiDidejimoTvarka(int[] masyvas) {
        for (int i = 0; i < masyvas.length - 1; i++) {
            for (int j = i + 1; j < masyvas.length; j++) {
                if (masyvas[j] > masyvas[i]) {
                    int temp;
                    temp = masyvas[j];
                    masyvas[j] = masyvas[i];
                    masyvas[i] = temp;
                }
            }
        }

        // Arrays.sort(masyvas); // lengviausias budas jei String
        return masyvas;
    }

    private void isvedimas() {
        didejantisMasyvas = surikiuotiDidejimoTvarka(ivestasMasyvas);
        System.out.println("Surikiuotas masyvas didejimo tvarka:");
        for (int i = 0; i < ivestasMasyvas.length; i++) {
            System.out.println(didejantisMasyvas[i]);
        }
    }
}
