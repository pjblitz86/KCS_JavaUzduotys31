package com.company;

import java.util.Scanner;

/**
 * Created by PauliusJ on 2017.05.24.
 */
public class Uzduotis3 {

    // konstruktorius
    public Uzduotis3() {
        skaiciuIvedimas();
        sumosAtspausdinimas();
    }



    // paprasyti pakartotinai vesti skaicius ir juos sumuoti i kintamaji
    // kai iveda 0, nutraukti ivedima ir atvaizduoti suma

    double suma = 0;

    private void skaiciuIvedimas() {
        label:
        {
            Scanner sc = new Scanner(System.in);
            double skaicius;
            System.out.println("Iveskite skaiciu");
            skaicius = sc.nextDouble();
            if (skaicius == 0){
                break label;
            } else {
                suma += skaicius;
                while (skaicius != 0) {
                    System.out.println("Iveskite skaiciu");
                    skaicius = sc.nextDouble();
                    suma += skaicius;
                }
            }
        }
    }

    private void sumosAtspausdinimas() {
        System.out.println("Suma = " + suma);
    }

}
