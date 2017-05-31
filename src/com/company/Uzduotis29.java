package com.company;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.ArrayList;


/**
 * Created by PauliusJ on 2017.05.28.
 */
public class Uzduotis29 {

    String nuskaitytasVardas;
    String nuskaitytaPavarde;
    int nuskaitytiMetai;

    Uzduotis29() {
        Skaitymas objektas2 = new Skaitymas();
        objektas2.paklausimas();
        objektas2.atidarytiFaila();
        objektas2.skaitymasIsFailo();
        new Person(nuskaitytasVardas, nuskaitytaPavarde, nuskaitytiMetai);

        Irasymas objektas = new Irasymas();
        objektas.paklausimas();
        objektas.irasymasIFaila();


    }


    public class Person {

        // sukuriame dvimati ArrayList kaupti vartotoju duomenims;
        ArrayList<ArrayList<String>> vartotojuSarasas = new ArrayList<ArrayList<String>>();

        private String vartotojoVardas;
        private String vartotojoPavarde;
        private int metai;

        Person(String v, String p, int m) {
            vartotojoVardas = v;
            vartotojoPavarde = p;
            metai = m;
        }

    }


    public class Irasymas {
        private String _failoVardas;
        private Scanner _sc;
        private FileWriter _out = null;

        public Irasymas() {
            _sc = new Scanner(System.in);
        }

        public void paklausimas() {
            System.out.println("Iveskite naujo failo pavadinimą sukurimui");
            _failoVardas = _sc.nextLine();

        }

        public void irasymasIFaila() {
            System.out.println("Iveskite teksta ka rasysite i faila");
            System.out.println("parasius pabaiga irasymas bus nutrauktas");
            String tekstas = _sc.nextLine();
            try {
                _out = new FileWriter(_failoVardas);
                while (!tekstas.equals("pabaiga")) {
                    _out.write(tekstas);
                    _out.write('\n');
                    tekstas = _sc.nextLine();
                }
                _out.close();
            } catch (Exception e) {
            }
        }
    }

    public class Skaitymas {
        private String _failoVardas;
        private Scanner _sc;
        private FileReader _in = null;
        private BufferedReader _bufferis;

        public Skaitymas() {
            _sc = new Scanner(System.in);
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

        public void skaitymasIsFailo() {
            try {
                String eilute = _bufferis.readLine();
                while (eilute != null) {
                    nuskaitytasVardas = eilute;
                    eilute = _bufferis.readLine();
                    nuskaitytaPavarde = eilute;
                    try {
                        eilute = _bufferis.readLine();
                        nuskaitytiMetai = Integer.parseInt(eilute);
                    } catch (Exception e) {
                        System.out.println("Nepavyko nuskaityti vartotojo metu" + e);
                    }
                }
                _bufferis.close();
                _in.close();
            } catch (Exception e) {
                System.out.println("Kazko nepavyko nuskaityti" + e);
            }
        }
    }
}
