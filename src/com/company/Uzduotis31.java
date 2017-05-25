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

    // nesigauna su ivedimo ilgiu kazkas vienu maziau leidzia ivest

    String[] ivestasMasyvas;
    String[] mazejantisMasyvas;

    // uzklausiam koki kieki nori ivesti i masyva ir nuskaitom i masyva
    private void uzklausimas() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite kiek skaiciu/zodziu noresite ivesti:");
        int kiek = sc.nextInt();
        ivestasMasyvas = new String[kiek];
        System.out.println("Iveskite " + kiek + " skaiciu/zodziu:");
        for (int i = 0; i < ivestasMasyvas.length; i++) {
            ivestasMasyvas[i] = sc.nextLine();
        }
    }

    // surikiuoja gauta masyva mazejimo tvarka
    private String[] surikiuotiMazejimoTvarka(String[] masyvas) {
        Arrays.sort(masyvas, Collections.reverseOrder()); // lengviausias budas jei String
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
