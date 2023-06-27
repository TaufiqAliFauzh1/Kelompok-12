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
    public double hitungHargaFilling(){
        this.beratKejuPSN = this.beratKeju*totalPesanan;

        System.out.println("Berat Keju: "+ beratKejuPSN +" gr")
    }    
}
