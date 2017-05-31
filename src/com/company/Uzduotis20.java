package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Uzduotis20 {

    // kintamieji
    Scanner _sc = new Scanner(System.in);
    private String _failoVardas;
    private FileReader _in = null;
    private BufferedReader _bufferis;
    private int skaicius;
    private int i = 0; // indeksas masyvui i kuri saugosim skaicius - while prisumuos ciklo gale
    private int kiekSkaiciuRado = 0; // suteiksim masyvui ilgi po pirmo praskaitymo
    private int[] skaiciai;
    private int[] didejantisMasyvas;

    // konstruktorius
    public Uzduotis20() {
        paklausimas();
        atidarytiFaila();
        skaitymasIsFailoSkaiciu();
        didejantisMasyvas = surikiuotiDidejimoTvarka(skaiciai);
        isvedimas();
    }

    public void paklausimas() {

        System.out.println("Iveskite failo pavadinimą is kurio norite skaityti");
        _failoVardas = _sc.nextLine();
    }

    public void atidarytiFaila() {
        try {
            _in = new FileReader(_failoVardas);
            _bufferis = new BufferedReader(_in);
        } catch (Exception e) {

        }
    }

    // nuskaitome tik atskirtus skaicius eilutese ir irasome juos i masyva
    // bet butina try-catch kad pagautume klaidas
    public void skaitymasIsFailoSkaiciu() {
        try {
            System.out.println("Faile rasti skaiciai atskirose eilutese:");
            String eilute = _bufferis.readLine();
            while (eilute != null) {
                eilute = _bufferis.readLine();
                skaicius = Integer.parseInt(eilute);
                System.out.println(skaicius);
                kiekSkaiciuRado++;
            }
            skaiciai = new int[kiekSkaiciuRado];
            didejantisMasyvas = new int[kiekSkaiciuRado];
            _in = new FileReader(_failoVardas);
            eilute = _bufferis.readLine();
            while (eilute != null) {
                eilute = _bufferis.readLine();
                skaicius = Integer.parseInt(eilute);
                skaiciai[i] = skaicius;
                i++;
            }
            _bufferis.close();
            _in.close();
        } catch (Exception e) {

        }
    }

    private int[] surikiuotiDidejimoTvarka(int[] masyvas) {
        for (int i = 0; i < kiekSkaiciuRado; i++) {
            for (int j = 0; j < kiekSkaiciuRado; j++) {
                if (masyvas[j] > masyvas[i]) {
                    int temp;
                    temp = masyvas[j];
                    masyvas[j] = masyvas[i];
                    masyvas[i] = temp;
                }
            }
        }
        return masyvas;
    }

    private void isvedimas() {
        System.out.println("Surikiuotas masyvas didejimo tvarka:");
        for (int i = 0; i < skaiciai.length; i++) {
            System.out.println(didejantisMasyvas[i]);
        }

    }
}





