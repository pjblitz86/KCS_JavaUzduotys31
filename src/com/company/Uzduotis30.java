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

    // nesigauna su ivedimo ilgiu kazkas vienu maziau leidzia ivest

    String[] ivestasMasyvas;
    String[] didejantisMasyvas;

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

    // surikiuoja gauta masyva didejimo tvarka
    private String[] surikiuotiDidejimoTvarka(String[] masyvas) {
        Arrays.sort(masyvas); // lengviausias budas jei String
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
