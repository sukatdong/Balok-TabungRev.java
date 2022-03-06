/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author HP
 */
public class Tabung extends varr implements MenghitungRuang{
public Tabung (double panjang, double lebar, double tinggi, double jari){
super (panjang,lebar, tinggi,jari);
}

   
    
    @Override
    public void luaspermukaan() {
        double luastabung;
        luastabung = 2 * 3.14 * jari * (jari + tinggi) ;
        System.out.println("Luas Permukaan Tabung : " + luastabung);
    }

    @Override
    public void volume() {
        double volumetabung;
        volumetabung = 3.14 * jari * jari * tinggi;
                
        System.out.println("Volume Tabung : " + volumetabung);
    }
    
    
    
}
