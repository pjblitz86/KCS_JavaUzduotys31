package com.company;

import java.util.Scanner;

/**
 * Created by PauliusJ on 2017.05.24.
 */
public class Uzduotis4 {

    // konstruktorius
    public Uzduotis4() {
        skaiciuIvedimas();
    }
    // sumos kaupiamasis kintamasis


    // paprasyti pakartotinai vesti skaicius ir juos sumuoti i kintamaji
    // kai iveda 0, nutraukti ivedima ir atvaizduoti suma


    private void skaiciuIvedimas() {
        double suma = 0;
        Scanner sc = new Scanner(System.in);

        double skaicius = Double.NaN;

        while (skaicius != 0) {
            while (skaicius != 0) {
                skaicius = Double.NaN;
                while (Double.isNaN(skaicius)) {
                    try {
                        System.out.println("Iveskite skaiciu");
                        skaicius = Double.parseDouble(sc.nextLine());

                    } catch (Exception e) {
                        System.out.println("Ivedete ne skaiciu kartokite");
                    }
                }
                suma += skaicius;
                System.out.println("Jus ivedete: " + skaicius);
                System.out.println("Suma = " + suma);
            }
        }
    }
}
