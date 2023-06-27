/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

//Hitung hasilnya disini
package tokoroti;
//import yaaa
import kelas.RotiPizza;
import varian.RotiManisVarian1;
import varian.RotiManisVarian2;
import varian.RotiManisVarian3;
import varian.RotiTawarVarian1;
import varian.RotiTawarVarian2;

/**
 *
 * @author Leo
 */

//baru class nya
public class TokoRotiPakRay {

 
    public static void main(String[] args) {
     
        System.out.println("Order1");
        RotiManisVarian1 manis1=new RotiManisVarian1();
        manis1.totalPesanan=50;
        manis1.tampilkan();
      
        System.out.println("Order2");
        RotiManisVarian2 manis2=new RotiManisVarian2();
        manis2.totalPesanan=100;
        manis2.tampilkan();         
        
        System.out.println("Order3");
        RotiManisVarian3 manis3=new RotiManisVarian3();
        manis3.totalPesanan=70;
        manis3.tampilkan(); 
        
        System.out.println("Order4");
        RotiTawarVarian1 tawar1=new RotiTawarVarian1();
        tawar1.totalPesanan=20;
        tawar1.tampilkan();
        
        System.out.println("Order5");
        RotiTawarVarian2 tawar2=new RotiTawarVarian2();
        tawar2.totalPesanan=15;
        tawar2.tampilkan();
        
        System.out.println("Order6");
        RotiPizza pizza=new RotiPizza();
        pizza.totalPesanan=10;
        pizza.tampilkan(); 
    }
    
}
