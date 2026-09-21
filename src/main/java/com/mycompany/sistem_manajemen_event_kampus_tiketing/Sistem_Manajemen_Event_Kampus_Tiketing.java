/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistem_manajemen_event_kampus_tiketing;

/**
 *
 * @author A c e r
 */
import java.util.Scanner;
public class Sistem_Manajemen_Event_Kampus_Tiketing {
    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
       //Object Pertama
        Event event1 = new Event(
            "Seminar Teknologi AI",
            "Seminar",
            "15 September 2026",
            "Gedung Ilmu Komputer Lt.3"
        );
        
        Peserta peserta1 = new Peserta(
            "Destiya Nurfadillah",
            "2507071004",
            "D3 Manajemen Informatika"
        );
        
        Tiket tiket1 = new Tiket(
            "Reguler",
            25000
        );
        
        //Menampilakn Informasi
        int pilihan;
        do{
            System.out.println("--------------------------------------");
            System.out.println("\n----Menu Pilihan----");
            System.out.println("1. Lihat Informasi Event");
            System.out.println("2. Lihat Informasi Tiket");
            System.out.println("3. Lihat Informasi Peserta");
            System.out.println("4. Simulasi Setter dan Getter");
            System.out.println("5. Keluar");
            System.out.println("Pilih menu: ");
            
            pilihan = input.nextInt();
    
            if(pilihan == 1){
                System.out.println("\n----Informasi Event----");
                event1.tampilkanInfoEvent();
            }else if(pilihan == 2){
                System.out.println("\n----Informasi Tiket----");
                tiket1.tampilkanInfoTiket();
            }else if(pilihan == 3){
                System.out.println("\n----Informasi Peserta----");
                peserta1.tampilkanInfoPeserta();
            }else if(pilihan == 4){
            System.out.println("\n--- Simulasi Setter dan Getter ----");
            
            System.out.println("\nData sebelum berubah:");
            System.out.println("\nNama Event : " + event1.getNamaEvent());
            System.out.println("\nJenis Tiket : " + tiket1.getJenisTiket());
            System.out.println("\nHarga Tiket : Rp" + tiket1.getHarga());
            
            //Setter dengan data valid
            System.out.println("\nMengubah Harga Tiket Menjadi Rp30000");
            tiket1.setHarga(30000);
            System.out.println("\nHarga Setelah Perubahan : Rp" + tiket1.getHarga());
            
            //Setter dengan harga tidak valid
            System.out.println("\nMengubah Harga Tiket Menjadi Rp-5000");
            tiket1.setHarga(-5000);
            System.out.println("\nHarga Setelah Data Tidak Valid : Rp" + tiket1.getHarga());
        }else if(pilihan == 5){
                System.out.println("\nTerima kasih telah menggunakan sistem.");
            }else{
                System.out.println("\nPilihan Tidak tersedia.");
            }
        }while(pilihan !=5);
        input.close();
    }
}
