/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author HP
 */
public class PersegiPanjang extends varr implements MenghitungBidang{
public PersegiPanjang(double panjang, double lebar, double tinggi, double jari){
super (panjang, lebar, tinggi, jari);
}

    
    
    @Override
    public void keliling() {
        double kelilingpanjang;
        kelilingpanjang = 2 *(panjang + lebar);
        System.out.println("Keliling Persegi Panjang : " + kelilingpanjang);
    }

    @Override
    public void luas() {
        double luaspanjang;
        luaspanjang = panjang * lebar ;
        System.out.println("Luas Persegi Panjang : " + luaspanjang);
    }
}
