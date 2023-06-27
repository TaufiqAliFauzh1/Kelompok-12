/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// Raditya membuat perhitungan berat filling, harga filling
package varian;

import interfaces.Filling;

/**
 *
 * @author Raditya
 */
public class RotiTawarVarian2 extends kelas.RotiTawar implements Filling{

    int beratKeju = 80;
    double beratKejuPSN;
    
    @override
    public void hitungBeratFilling(){
        this.beratKejuPSN = this.beratKeju*totalPesanan;

        System.out.println("Berat Keju: "+ beratKejuPSN +" gr");
    }    
    
    @override
    public double hitungHargaFilling(){
        double hargaKeju = (31000/250)*beratKejuPSN;
        return hargaKeju;
    }

    public void tampilkan(){
        System.out.println("Roti Tawar Varian 2");
        System.out.println("Jumlah: "+ total pesanan +" pcs\n");
        hitungBeratBahan();
        hitungBeratFilling();
        System.out.println("-------------------------")
        System.out.println("Harga Bahan: Rp "+ hitungBahanHarga());
        System.out.println("Harga Filling: Rp "+ hitungHargaFilling()):;
        double hargaJual= hitungHargaBahan()+hitungHargaFilling()+((hitungHargaBahan()+hitungHargaFilling())*(40/100);
        System.out.println("Harga Jual Per pcs: Rp "+ hargaJual/totalPesanan);
        System.out.println("\n \n");
    }   
}
