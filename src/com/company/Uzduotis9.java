package com.company;

import java.util.Scanner;

/**
 * Created by PauliusJ on 2017.05.25.
 */
public class Uzduotis9 {

    public Uzduotis9() {
        ivedimas2Skaiciai();
        arKartoti();
    }

    Scanner sc = new Scanner(System.in);
    double skaicius1;
    double skaicius2;

    // paprasome ivesti 2 skaicius ir nukreipiam i skaiciavimas() metoda
    private void ivedimas2Skaiciai() {
        System.out.println("Iveskite 1a skaiciu:");
        skaicius1 = sc.nextDouble();
        System.out.println("Iveskite 2a skaiciu:");
        skaicius2 = sc.nextDouble();
        skaiciavimas();
    }

    // paklausiam koki aritmetini veiksma pasirinks, nuskaitom ir switch pagalba suskaiciuojam
    // po to nukreipiam i arKartoti() metoda
    private void skaiciavimas() {
        System.out.println("Pasirinkite aritmetikos veiksma, spauskite:\n" +
                "1 - suma\n" + "2 - skirtumas\n" + "3 - sandauga");
        int veiksmoPasirinkimas = sc.nextInt();
        switch (veiksmoPasirinkimas) {
            case 1:
                System.out.print("Suma = ");
                System.out.println(skaicius1 + skaicius2);
                break;
            case 2:
                System.out.print("Skirtumas = ");
                System.out.println(skaicius1 - skaicius2);
                break;
            case 3:
                System.out.print("Sandauga = ");
                System.out.println(skaicius1 * skaicius2);
                break;
        }
        arKartoti();
    }

    // ar kartosim? nukreipia i ivedimas2Skaiciai metoda jei taip
    // taip suksis ratu kartojimas jei vartotojas po veiksmu spaus 5
    private void arKartoti() {
        System.out.println("Ar norite kartoti? Spauskite 5 jei taip");
        int kartojimas = sc.nextInt();
        if (kartojimas == 5) {
            ivedimas2Skaiciai();
        }
    }
}

