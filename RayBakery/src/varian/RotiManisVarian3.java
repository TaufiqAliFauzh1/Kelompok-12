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
    public void hitungBeratFilling() {
        this.beratKejuPSN = this.beratKeju*totalPesanan;
        this.beratSosisPSN = this.beratSosis*totalPesanan;

        System.out.println("Berat Filling Keju: "+ beratKejuPSN +" gr")
        System.out.println("Berat Filling Sosis: "+ beratSosisPSN +" gr")
}

    
