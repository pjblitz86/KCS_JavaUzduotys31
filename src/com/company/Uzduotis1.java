package com.company;

import java.util.Scanner;

/**
 * Created by PauliusJ on 2017.05.24.
 */
public class Uzduotis1 {

    private int skaicius;


    // konstruktorius
    public Uzduotis1(){
        nuskaitymas();
        arLyginis();
    }

    // paprasyti vartotojo ivesti sveika skaiciu ir nuskaityti i kintamaji
    private void nuskaitymas(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite sveika skaiciu:");
        skaicius = sc.nextInt();
    }

    // patikrinti ar skaicius lyginis ir atspausdinti i konsole
    private void arLyginis(){
        if(skaicius % 2 ==0){
            System.out.println("Skaicius yra lyginis");
        }
        else{
            System.out.println("Skaicius nelyginis");
        }
    }
}
