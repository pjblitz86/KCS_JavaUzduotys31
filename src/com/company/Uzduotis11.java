package com.company;

import java.util.Scanner;

/**
 * Created by PauliusJ on 2017.05.25.
 */
public class Uzduotis11 {

    public Uzduotis11() {
        ivedimas();
    }
    Scanner sc = new Scanner(System.in);
    int skaicius;
    int suma = 0;
    int sandauga = 1;

    // uzklausiam skaiciaus ir nuskaitom, jei <=1 issokam is metodo ir baigiam programa
    private void ivedimas() {
        System.out.println("Iveskite naturalu skaiciu >= 1");
        skaicius = sc.nextInt();
        if (skaicius < 1) {
            System.out.println("Bloga ivestis");
        }else{
            pasirinkimas();
        }
    }

    private void pasirinkimas(){
        System.out.println("Pasirinkite ka skaiciuoti, spauskite:\n" +
                            "1 - sumai nuo 1 iki " + skaicius +
                            "\n2 - sandaugai nuo 1 iki " + skaicius);
        int parinkimas = sc.nextInt();
        switch (parinkimas){
            case 1:
                sumavimasIkiN();
            /* su rekursija
            int rezultatas = sumavimasRekursija(skaicius);
            System.out.println("Suma: " + rezultatas);*/
            break;
            case 2:
                sandaugaIkiN();
                /* su rekursija
            int rezultatas = sandaugaRekursija(skaicius);
            System.out.println("Sandauga: " + rezultatas);*/
                break;
            default:
                System.out.println("Neatpazintas parinkimas");
        }
    }

    // sumuojame su for
    private void sumavimasIkiN() {
        for (int i = 1; i <= skaicius; i++) {
            suma += i;
        }
        System.out.println("Suma visu naturaliu skaiciu nuo 1 iki " + skaicius + " yra " + suma);
    }

    // sandauga analogiskai su for
    private void sandaugaIkiN() {
        for (int i = 1; i <= skaicius; i++) {
            sandauga *= i;
        }
        System.out.println("Sandauga visu naturaliu skaiciu nuo 1 iki " + skaicius + " yra " + sandauga);
    }

    // kitas var rekursija sumavimas
    private int sumavimasRekursija(int n) {
        int result;
        if (n == 1) return 1;
        result = sumavimasRekursija(n - 1) + n;
        return result;
    }
    // kitas var rekursija sandauga
    private int sandaugaRekursija(int n) {
        int result;
        if (n == 1) return 1;
        result = sumavimasRekursija(n - 1) * n;
        return result;
    }
}
