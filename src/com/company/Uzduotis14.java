package com.company;

import com.sun.deploy.util.ArrayUtil;

import java.util.Scanner;

/**
 * Created by PauliusJ on 2017.05.25.
 */
public class Uzduotis14 {

    public Uzduotis14() {
        uzklausimas();
        isvedimas();
    }

    int[] skaiciai1 = new int[5];
    int[] apsuktasMasyvas = new int[5];

    // uzklausiam kad ivestu 5 skaicius ir nuskaitom i masyva
    private void uzklausimas() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite 5 sveikus skaicius:");
        for (int i = 0; i < skaiciai1.length; i++) {
            skaiciai1[i] = sc.nextInt();
        }

    }

    // apsukame masyva
    private int[] apsuktiMasyva(int[] masyvas) {
        for (int i = 0; i < masyvas.length / 2; i++) {
            int temp = masyvas[i];
            masyvas[i] = masyvas[masyvas.length - i - 1]; // ?????
            masyvas[masyvas.length - i - 1] = temp;
        }
        // 2 budas: Collections.reverse(ivestasMasyvas)
        // bet reikia konvertuoti paprasta array i List.
        // 3 budas: bet reikia konvertuoti i String
        // ArrayUtil.reverse(ivestasMasyvas);
        return masyvas;
    }

    private void isvedimas() {
        System.out.println("Ivesti skaiciai i masyva:");
        for(int i=0; i<skaiciai1.length; i++){
            System.out.println("Indeksas: " + i + "\tSkaicius: " + skaiciai1[i]);
        }
        apsuktasMasyvas = apsuktiMasyva(skaiciai1);
        System.out.println("Apsukti skaiciai is ivesto masyvo:");
        for(int i=0; i<skaiciai1.length; i++){
            System.out.println("Indeksas: " + i + "\tSkaicius: " + apsuktasMasyvas[i]);
        }
    }
}
