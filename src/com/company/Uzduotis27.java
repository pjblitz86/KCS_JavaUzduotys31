package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Created by PauliusJ on 2017.05.28.
 */
public class Uzduotis27 {

    private String _failoVardas1;
    private String _failoVardas2;
    private FileReader _in = null;
    private BufferedReader _bufferis;
    private ArrayList<String> varduSarasas1 = new ArrayList<String>();
    private ArrayList<String> varduSarasas2 = new ArrayList<String>();

    public Uzduotis27(String failoVardas1, String failoVardas2) {
        _failoVardas1 = failoVardas1;
        _failoVardas2 = failoVardas2;
        atidarytiFaila1();
        skaitymasIsFailo1();
        atvaizdavimasIsSaraso1();
        atidarytiFaila2();
        skaitymasIsFailo2();
        atvaizdavimasIsSaraso2();
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
                varduSarasas1.add(eilute);
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
                varduSarasas2.add(eilute);
            }
            _bufferis.close();
            _in.close();
        } catch (Exception e) {

        }
    }
    private void atvaizdavimasIsSaraso1(){
        System.out.println(varduSarasas1);
    }
    private void atvaizdavimasIsSaraso2(){
        System.out.println(varduSarasas2);
    }

}
