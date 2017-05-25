package com.company;

import java.util.Scanner;

/**
 * Created by PauliusJ on 2017.05.25.
 */
public class Uzduotis10 {

    public Uzduotis10() {
        ivedimas();
    }

    int skaicius;
    int suma = 0;

    // uzklausiam skaiciaus ir nuskaitom, jei <=1 issokam is metodo ir baigiam programa
    private void ivedimas() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite naturalu skaiciu >= 1");
        skaicius = sc.nextInt();
        if (skaicius < 1) {
            System.out.println("Bloga ivestis");
        } else {
            sumavimasIkiN();
            /* su rekursija
            int rezultatas = sumavimasRekursija(skaicius);
            System.out.println("Suma: " + rezultatas);*/
        }
    }
    // sumuojame su for
    private void sumavimasIkiN() {
        for (int i = 1; i <= skaicius; i++) {
            suma += i;
        }
        System.out.println("Suma visu naturaliu skaiciu nuo 1 iki " + skaicius + " yra " + suma);
    }

    // kitas var rekursija (kazkas blogai kode)
    private int sumavimasRekursija(int n) {
        int result;
        if (n == 1) return 1;
        result = sumavimasRekursija(n - 1) + n;
        return result;
    }
}

