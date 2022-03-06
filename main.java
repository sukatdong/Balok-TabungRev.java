/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int temp = 1;
        while(temp!=3){
        System.out.println("+==============================+");
        System.out.println("|           MENU UTAMA         |");
        System.out.println("+==============================+");
        System.out.println(" 1.Persegi Panjang dan Balok");
        System.out.println(" 2.Lingkaran dan Tabung");
        System.out.println(" 3.Exit");
        System.out.println("Input Menu  : ");
        int pilih = Input.nextInt();
        
        switch (pilih){
            case 1 : 
                System.out.println("+==============================+");
                System.out.println("|  Persegi Panjang Dan Balok   |");
                System.out.println("+==============================+");
                System.out.print("Input Panjang : "); double panjang = Input.nextDouble();
                System.out.print("Input Lebar   : "); double lebar = Input.nextDouble();
                System.out.print("Input Tinggi  : "); double tinggi = Input.nextDouble();
                PersegiPanjang persegipanjang = new PersegiPanjang (panjang, lebar, tinggi, 0);
                Balok balok = new Balok (panjang, lebar, tinggi, 0);
                System.out.println("+==============================+");
                System.out.println("|       Persegi Panjang        |");
                System.out.println("+==============================+");
                persegipanjang.keliling();
                persegipanjang.luas();
                System.out.println("+==============================+");
                System.out.println("|            Balok             |");
                System.out.println("+==============================+");
                balok.luaspermukaan();
                balok.volume();
                System.out.println("+==============================+");
                break;
            case 2 : 
                System.out.println("+==============================+");
                System.out.println("|    Lingkaran Dan Tabung      |");
                System.out.println("+==============================+");
                System.out.print("Input Jari-Jari : "); double jari = Input.nextDouble();
                System.out.print("Input Tinggi  : "); double tinggi1 = Input.nextDouble();
                Tabung tabung = new Tabung (0, 0, tinggi1, jari);
                Lingkaran lingkaran = new Lingkaran (0, 0,tinggi1 ,jari);
                System.out.println("+==============================+");
                System.out.println("|          Lingkaran           |");
                System.out.println("+==============================+");
                lingkaran.keliling();
                lingkaran.luas();
                System.out.println("+==============================+");
                System.out.println("|            Tabung            |");
                System.out.println("+==============================+");
                tabung.luaspermukaan();
                tabung.volume();
                System.out.println("+==============================+");
                break;
            case 3 : System.out.println("\nProgram Selesai ! "); System.exit(0);
                break;
            default : System.out.print("Masukkan Pilihan Dengan Benar !! \n");  
                
        }
        
        
        }
        }
        
        
    }
       
            
        
            
            
        
        
    
    

