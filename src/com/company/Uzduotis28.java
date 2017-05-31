package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Created by PauliusJ on 2017.05.28.
 */
public class Uzduotis28 {

    private String _failoVardas1;
    private String _failoVardas2;
    private FileReader _in = null;
    private BufferedReader _bufferis;
    private int skaiciai1;
    private int skaiciai2;
    private int suma1;
    private int suma2;
    private ArrayList<Integer> skaiciuSarasas1 = new ArrayList<Integer>();
    private ArrayList<Integer> skaiciuSarasas2 = new ArrayList<Integer>();

    public Uzduotis28(String failoVardas1, String failoVardas2) {
        _failoVardas1 = failoVardas1;
        _failoVardas2 = failoVardas2;
        atidarytiFaila1();
        skaitymasIsFailo1();
        atvaizdavimasIsSaraso1();
        atidarytiFaila2();
        skaitymasIsFailo2();
        atvaizdavimasIsSaraso2();
        sumosSkaiciavimas();
    }

    private void atidarytiFaila1() {
        try {
            _in = new FileReader(_failoVardas1);
            _bufferis = new BufferedReader(_in);
        } catch (Exception e) {

        }
    }
    private void atidarytiFaila2() {
        try {
            _in = new FileReader(_failoVardas2);
            _bufferis = new BufferedReader(_in);
        } catch (Exception e) {

        }
    }

    // nuskaito vardus ir prideda i ArrayList
    private void skaitymasIsFailo1() {
        try {
            String eilute = _bufferis.readLine();
            while (eilute != null) {
                eilute = _bufferis.readLine();
                skaiciai1 = Integer.parseInt(eilute);
                skaiciuSarasas1.add(skaiciai1);
            }
            _bufferis.close();
            _in.close();
        } catch (Exception e) {

        }
    }

    private void skaitymasIsFailo2() {
        try {
            String eilute = _bufferis.readLine();
            while (eilute != null) {
                eilute = _bufferis.readLine();
                skaiciai2 = Integer.parseInt(eilute);
                skaiciuSarasas2.add(skaiciai2);
            }
            _bufferis.close();
            _in.close();
        } catch (Exception e) {

        }
    }
    private void atvaizdavimasIsSaraso1(){
        System.out.println(skaiciuSarasas1);
    }
    private void atvaizdavimasIsSaraso2(){
        System.out.println(skaiciuSarasas2);
    }
    private void sumosSkaiciavimas(){
        for (int sk : skaiciuSarasas1) {
            suma1 += sk;
        }
        for (int sk : skaiciuSarasas2) {
            suma2 += sk;
        }
        System.out.println("Suma is 1o saraso: " + suma1);
        System.out.println("Suma is 2o saraso: " + suma2);
    }
}
