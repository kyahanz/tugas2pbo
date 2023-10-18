package Tugas;

import Tugas.Matematika;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika emteka = new Matematika();
        int ValuePertambahan = emteka.pertambahan(24, 12);
        int ValuePengurangan = emteka.pengurangan(16, 8);
        int Hsilperkalian = emteka.perkalian(16, 9);
        double Hsilpembagian = emteka.pembagian(12, 8);
        System.out.println("Pertambahan: 24 + 12 = " + ValuePertambahan);
        System.out.println("Pengurangan: 16 - 8 = " + ValuePengurangan);
        System.out.println("Perkalian: 16 * 9 = " + Hsilperkalian);
        System.out.println("Pembagian: 12 / 8 = " + Hsilpembagian);
    }


}
