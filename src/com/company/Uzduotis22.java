package com.company;

import java.util.Scanner;

/**
 * Created by PauliusJ on 2017.05.28.
 */
public class Uzduotis22 {

    Uzduotis22() {
        nuskaitymas();
    }

    Scanner sc = new Scanner(System.in);
    String tekstas;
    int kiekAtskiruZodziu;


    private void nuskaitymas() {
        System.out.println("Iveskite teksta:");
        tekstas = sc.nextLine();
        tikrinimas(tekstas);
    }

    // naudojame spilt funkcija, w+ nurodo kad nekreipt demesio i white space
    // ir length pasakys kiek zodziu
    private void tikrinimas(String tekstas) {
        kiekAtskiruZodziu = tekstas.split("\\w+").length;
        System.out.print("Atskiru zodziu kiekis: " + kiekAtskiruZodziu);
    }

}
