/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// Dian membuat perhitungan berat filling, harga filling,berat topping, harga topping 
package varian;

import interfaces.Filling;
import interfaces.Topping;

/**
 *
 * @author Dian
 */
public class RotiManisVarian1 extends kelas.RotiManis implements Filling, Topping{
    int beratKeju=5;
    double beratKejuPSN;
    
    int beratCoklatFilling=5;
    double beratCoklatFillingPSN;
    
    int beratCoklatTopping=5;
    double beratCoklatToppingPSN;
    

    @Override
    public void hitungBeratFilling() {
        this.beratKejuPSN=this.beratKeju*totalPesanan;
        this.beratCoklatFillingPSN=this.beratCoklatFilling*totalPesanan;
        
        System.out.println("Berat Filling Keju: "+beratKejuPSN+" gr");
        System.out.println("Berat Filling Coklat: "+beratCoklatFillingPSN+" gr"); 
    }

    @Override
    public double hitungHargaFilling() {
        double hargaCoklatFilling=(31000/250)*beratCoklatFillingPSN;  
        double hargaKeju=(29000/500)*beratKejuPSN;  
        double hargaFilling=hargaCoklatFilling+hargaKeju;
        return hargaFilling;
    }

    @Override
    public void hitungBeratTopping() {
        this.beratCoklatToppingPSN=this.beratCoklatTopping*totalPesanan;
        
        System.out.println("Berat Topping Coklat: "+beratCoklatToppingPSN+" gr");
    }

    @Override
    public double hitungHargaTopping() {
        double hargaCoklatTopping=(29000/500)*beratCoklatToppingPSN;    
        return hargaCoklatTopping;
    }
    
     public void tampilkan(){
        System.out.println("Roti Manis Varian 1");
        System.out.println("Jumlah: " + totalPesanan+" pcs \n");
        hitungBeratBahan();
        hitungBeratFilling();
        hitungBeratTopping();
        System.out.println("-------------------");
        System.out.println("Harga Bahan: Rp"+hitungHargaBahan());
        System.out.println("Harga Filling: Rp"+hitungHargaFilling());
        System.out.println("Harga Topping: Rp"+hitungHargaTopping());
        
        double hargaJual= hitungHargaBahan()+hitungHargaFilling()+hitungHargaTopping()+((hitungHargaBahan()+hitungHargaFilling()+hitungHargaTopping())*(40/100));
        System.out.println("Harga Jual Per pcs: Rp"+hargaJual/totalPesanan);
        System.out.println("\n \n");
    }
    
}
