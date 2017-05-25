package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by PauliusJ on 2017.05.25.
 */
public class Uzduotis31 {
    public Uzduotis31() {
        uzklausimas();
        isvedimas();
    }

    int[] ivestasMasyvas;
    int[] mazejantisMasyvas;

    // uzklausiam koki kieki nori ivesti i masyva ir nuskaitom i masyva
    private void uzklausimas() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite kiek skaiciu noresite ivesti:");
        int kiek = sc.nextInt();
        ivestasMasyvas = new int[kiek];
        System.out.println("Iveskite " + kiek + " skaicius:");
        for (int i = 0; i < ivestasMasyvas.length; i++) {
            System.out.println("Iveskite " + (i + 1) + " skaiciu");
            ivestasMasyvas[i] = sc.nextInt();
        }
    }

    // surikiuoja gauta masyva mazejimo tvarka
    private int[] surikiuotiMazejimoTvarka(int[] masyvas) {
        for (int i = 0; i < masyvas.length; i++) {
            for (int j = 0; j < masyvas.length; j++) {
                if (masyvas[j] < masyvas[i]) {
                    int temp;
                    temp = masyvas[i];
                    masyvas[i] = masyvas[j];
                    masyvas[j] = temp;
                }
            }
        }
        //Arrays.sort(masyvas, Collections.reverseOrder()); // lengviausias budas jei String

        return masyvas;
    }

    private void isvedimas() {
        mazejantisMasyvas = surikiuotiMazejimoTvarka(ivestasMasyvas);
        System.out.println("Surikiuotas masyvas mazejimo tvarka:");
        for (int i = 0; i < ivestasMasyvas.length; i++) {
            System.out.println(mazejantisMasyvas[i]);
        }
    }
}
