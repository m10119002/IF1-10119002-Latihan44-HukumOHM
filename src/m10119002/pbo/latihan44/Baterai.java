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
 * Deskripsi Program : Class untuk objek Baterai
 * 
 * 
 */
public class Baterai {
    private float kuatArus, hambatan;
    
    public Baterai() {
        System.out.println("=====Hukum Ohm=====");
        System.out.println("Kuat arus yang mengalir pada suatu kawat penghantar");
        System.out.println("akan berbanding lurus dengan beda potensial");
        System.out.println("pada ujung-ujung kawat penghantar tersebut");
        System.out.println("asalkan suhu kawat dijaga konstan.");
        System.out.println("");
    }
    public Baterai(float kuatArus, float hambatan)
    {this.kuatArus = kuatArus; this.hambatan = hambatan;}
    
    public float getKuatArus() {return this.kuatArus;}
    public float getHambatan() {return this.hambatan;}
    public float hitungTegangan() {return this.kuatArus*this.hambatan;}
}
