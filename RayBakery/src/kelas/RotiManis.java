/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//  Taufiq membuat public class roti manis extends dari abstraksi adonan untuk menghitung berat bahan
package kelas;

/**
 *
 * @author Taufiq 
 */

public class RotiManis extends abstraksi.Adonan{
  
  @Override
  public void hitungBeratBahan(){
    double jumlahRotiPerAdonan= 2350/50;
    this.beratTepungPSN=(1000/jumlahRotiPerAdonan)*totalPesanan;
    this.beratGulaPSN=(150/jumlahRotiPerAdonan)*totalPesanan; 
    this.beratButterPSN=(150/jumlahRotiPerAdonan)*totalPesanan;
    this.beratRagiPSN=(20/jumlahRotiPerAdonan)*totalPesanan;
    this.beratSusuBubukPSN=(300/jumlahRotiPerAdonan)*totalPesanan;
    this.beratSusuCairPSN=(250/jumlahRotiPerAdonan)*totalPesanan;
    this.beratTelurPSN=(80/jumlahRotiPerAdonan)*totalPesanan;
    this.beratEsBatuPSN=(400/jumlahRotiPerAdonan)*totalPesanan;
    }
}
