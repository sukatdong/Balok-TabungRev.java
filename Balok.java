/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author HP
 */
public class Balok extends varr implements MenghitungRuang {
    
    public Balok (double panjang, double lebar, double tinggi, double jari){
    super(panjang, lebar, tinggi, jari);
    
    }

    @Override
    public void luaspermukaan() {
        double luasbalok;
        luasbalok = 2*(panjang * lebar + panjang * tinggi + lebar * tinggi) ;
        System.out.println("Luas Persegi Panjang : " + luasbalok);
        
    }

    @Override
    public void volume() {
        double volumebalok;
        volumebalok = panjang*lebar*tinggi ;
        System.out.println("Luas Persegi Panjang : " + volumebalok);
        
        
    }
    

    
}
