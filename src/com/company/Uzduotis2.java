package com.company;

import java.util.Scanner;

/**
 * Created by PauliusJ on 2017.05.24.
 */
public class Uzduotis2 {

    // konstruktorius
    public Uzduotis2() {
        besikartojantisUzklausimas();
    }

    // paprasome vartotojo ivesti zodi ir ji atvaizduojame,
    // po to vel kartojame kol neiraso pabaiga
    // tada nutraukiame ivedima
    private void besikartojantisUzklausimas() {
        persokimas:
        {
            Scanner sc = new Scanner(System.in);
            String ivedimas = null;
            System.out.println("Iveskite zodi");
            ivedimas = sc.nextLine();
            if (ivedimas.toLowerCase().equals("Pabaiga")) {
                break persokimas;
            } else {
                System.out.println(ivedimas);
                while (!ivedimas.toLowerCase().equals("Pabaiga")) {
                    System.out.println("Iveskite zodi");
                    ivedimas = sc.nextLine();
                    System.out.println(ivedimas);
                }
            }

        }
    }
}

