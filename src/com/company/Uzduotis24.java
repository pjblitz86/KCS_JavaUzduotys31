package com.company;

import java.util.Scanner;

/**
 * Created by PauliusJ on 2017.05.26.
 */
public class Uzduotis24 {

    public Uzduotis24() {
        ivedimas();
        metodoParinkimasIrIsvedimas();
    }

    // paskelbiam kintamuosius kuriu reikes
    double skaicius1;
    double skaicius2;
    char zenklas;
    double suma;
    double skirtumas;
    double sandauga;

    // uzklausiame 2 skaicius ir aritmetikos zenkla ir nuskaitom i kintamuosius
    private void ivedimas() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite 1a skaiciu:");
        skaicius1 = sc.nextDouble();
        System.out.println("Iveskite 2a skaiciu:");
        skaicius2 = sc.nextDouble();
        System.out.println("Iveskite aritmetikos zenkla:\n+ sudeciai\n- skirtumui\n* daugybai");
        zenklas = sc.next().charAt(0); // char nuskaitymas skiriasi
    }

    // pagal ivesta zenkla darom switch, kuris paleis atitinkama metoda su isvedimu
    private void metodoParinkimasIrIsvedimas() {
        switch (zenklas) {
            case '+':
                suma = sumavimas(skaicius1, skaicius2);
                System.out.println("Suma = " + suma);
                break;
            case '-':
                suma = atimtis(skaicius1, skaicius2);
                System.out.println("Skirtumas = " + skirtumas);
                break;
            case '*':
                suma = daugyba(skaicius1, skaicius2);
                System.out.println("Sandauga = " + sandauga);
                break;
            default:
                System.out.println("Neatpazintas zenklas");
                break;
        }
    }

    private double sumavimas(double a, double b) {
        return a + b;
    }

    private double atimtis(double a, double b) {
        return a - b;
    }

    private double daugyba(double a, double b) {
        return a * b;
    }
}
