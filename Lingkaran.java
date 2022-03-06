/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author HP
 */
public class Lingkaran extends varr implements MenghitungBidang{

    public Lingkaran (double panjang, double lebar, double tinggi, double jari){
    super (panjang, lebar, tinggi, jari);
    }

    @Override
    public void keliling() {
        double kelilinglingkaran;
        kelilinglingkaran = 3.14* 2 * jari ;
        System.out.println("keliling Lingkaran : " + kelilinglingkaran);
    }

    @Override
    public void luas() {
        double luaslingkaran;
                
        luaslingkaran = 3.14 * jari * jari ;
        System.out.println("Luas Lingkaran : " + luaslingkaran);
    }
    
}
