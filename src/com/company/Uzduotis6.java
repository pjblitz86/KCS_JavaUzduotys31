package com.company;

import java.util.Scanner;

/**
 * Created by PauliusJ on 2017.05.25.
 */
public class Uzduotis6 {

    // konstruktorius
    public Uzduotis6() {
        ivesti5Zodzius();
    }

    // paprasyti ivesti 5 zodzius ir po viso ivedimo atvaizduoti juos
    private void ivesti5Zodzius() {
        String[] zodziai = new String[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Iveskite zodi:");
            zodziai[i] = sc.nextLine();
        }
        System.out.println("Buvo ivesti zodziai:");
        for(String x : zodziai){
            System.out.println(x);
        }
    }
}
