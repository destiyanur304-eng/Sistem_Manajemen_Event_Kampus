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
            System.out.println("4. Keluaar");
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
                System.out.println("\nTerima kasih telah menggunakan sistem.");
            }else{
                System.out.println("\nPilihan Tidak tersedia.");
            }
        }while(pilihan !=4);
        input.close();
    }
}
