/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.latihan44;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi Program : Program ini berisi program hukum ohm
 * (OBJECT ORIENTED)
 * 
 */
public class Program {
    public static void main(String[] args) {
        Baterai batre = new Baterai();
        batre = new Baterai(3.0f, 12.0f);
        System.out.println("Kuat Arus : ".
                concat(Float.toString(batre.getKuatArus())).concat(" ampere"));
        System.out.println("Hambatan : ".
                concat(Float.toString(batre.getHambatan())).concat(" ohm"));
        System.out.println("Hasil Tegangan : ".
                concat(Float.toString(batre.hitungTegangan())).concat(" volt"));
    }
}
