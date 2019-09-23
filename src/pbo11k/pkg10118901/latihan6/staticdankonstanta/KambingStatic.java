/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118901.latihan6.staticdankonstanta;

/**
 *
 * @author
 * NAMA         : Dedi Cahya
 * KELAS        : IF-11-K
 * NIM          : 10118901
 * DESKRIPSI    : Belajar mengkases class yang berbeda
 */
public class KambingStatic {
    
    public static final String NAMA_KAMBING = "Midun";
    public static void main(String[] args) {
        PBO11K10118901Latihan6StaticDanKonstanta.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak " + PBO11K10118901Latihan6StaticDanKonstanta.jumlahKambing);
    }
     
}
