/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Raditya membuat perhitungan berat filling, harga filling
package varian;


/**
 *
 * @author Raditya
 */
public class RotiManisVarian3 extends kelas.RotiManis implements Filling{
    int beratkeju = 10;
    double beratKejuPSN;

    int beratSosis = 10;
    double beratSosisPSN;

    @override
    public void hitungBeratFilling(){
        this.beratKejuPSN = this.beratKeju*totalPesanan;
        this.beratSosisPSN = this.beratSosis*totalPesanan;

        System.out.println("Berat Filling Keju: "+ beratKejuPSN +" gr")
        System.out.println("Berat Filling Sosis: "+ beratSosisPSN +" gr")
    }
    
    @override
    public double hitungHargaFilling(){
        double hargaSosis = (31000/250)*beratSosisPSN;
        double hargaKeju = (29000/500)*beratKejuPSN;
        double hargaFilling = hargaSosis + hargaKeju;
        return hargaFilling;
    }
    
    public void tampilkan(){
        System.out.println("Roti Manis Varian 3");
        System.out.println("Jumlah: "+totalPesanan+" pcs \n");
        hitungBeratBahan();
        hitungBeratFilling();
        System.out.println("-------------------");
        System.out.println("Harga Bahan: Rp"+hitungHargaBahan());
        System.out.println("Harga Filling: Rp"+hitungHargaFilling());
        double hargaJual= hitungHargaBahan()+hitungHargaFilling()+((hitungHargaBahan()+hitungHargaFilling())*(50/100));
        System.out.println("Harga Jual Per pcs: Rp"+hargaJual/totalPesanan);
        System.out.println("\n \n");
    }
}

    
