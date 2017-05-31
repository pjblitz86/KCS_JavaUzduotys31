package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner skeneris = new Scanner(System.in);
        System.out.println("Pasirinkite uzduoti nuo 1 iki 31");
        int pasirinkimas = skeneris.nextInt();

        switch (pasirinkimas) {
            case 1:
                new Uzduotis1();
                break;
            case 2:
                new Uzduotis2();
                break;
            case 3:
                new Uzduotis3();
                break;
            case 4:
                new Uzduotis4();
                break;
            case 5:
                new Uzduotis5();
                break;
            case 6:
                new Uzduotis6();
                break;
            case 7:
                new Uzduotis7();
                break;
            case 8:
                new Uzduotis8();
                break;
            case 9:
                new Uzduotis9();
                break;
            case 10:
                new Uzduotis10();
                break;
            case 11:
                new Uzduotis11();
                break;
            case 12:
                new Uzduotis12();
                break;
            case 13:
                new Uzduotis13();
                break;
            case 14:
                new Uzduotis14();
                break;
            case 15:
                new Uzduotis15();
                break;
            case 16:
                new Uzduotis16();
                break;
            case 17:
                new Uzduotis17();
                break;
            case 18:
                new Uzduotis18();
                break;
            case 19:
                new Uzduotis19();
                break;
            case 20:
                new Uzduotis20();
                break;
            case 21:
                new Uzduotis21();
                break;
            case 22:
                new Uzduotis22();
                break;
            case 23:
                new Uzduotis23();
                break;
            case 24:
                new Uzduotis24();
                break;
            case 25:
                new Uzduotis25("Vardai1");
                break;
            case 26:
                new Uzduotis26("Skaiciai");
                break;
            case 27:
                new Uzduotis27("Vardai1", "Vardai2");
                break;
            case 28:
                new Uzduotis28("Skaiciai", "Skaiciai2");
                break;
            /*case 29:
                new Uzduotis29();
                break;*/
            case 30:
                new Uzduotis30();
                break;
            case 31:
                new Uzduotis31();
                break;
            default:
                System.out.println("Klaida: neatpazinta uzduotis");
        }
    }
}
