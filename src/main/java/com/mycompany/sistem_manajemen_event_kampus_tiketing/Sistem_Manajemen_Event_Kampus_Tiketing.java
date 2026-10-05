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
    
       //Object SeminarEvent
        SeminarEvent seminar1 = new SeminarEvent(
            "Seminar Teknologi AI",
            "Seminar",
            "15 September 2026",
            "Gedung Ilmu Komputer Lt.3",
            "Dr.Budi Santoso"
        );
        //Object WorkshopEevnt
        WorkshopEvent workshop1 = new WorkshopEvent(
            "Workshop Pemograman Java",
            "Workshop",
            "20 September 2026",
            "Gedung MIPA Terpadu",
            "Pemograman Java Dasar"
        );
        //Object Peserta
        Peserta peserta1 = new Peserta(
            "Destiya Nurfadillah",
            "2507071004",
            "D3 Manajemen Informatika"
        );
        //Object Tiket
        Tiket tiket1 = new Tiket(
            "Reguler",
            25000
        );
        
        //Menampilakn Informasi
        int pilihan;
        do{
            System.out.println("\n--------------------------------------");
            System.out.println("SISTEM MANAJEMEN EVENT KAMPUS");
            System.out.println("--------------------------------------");
            System.out.println("---------- Menu Pilihan --------------");
            System.out.println("1. Lihat Detail Seminar");
            System.out.println("2. Lihat Detail Workshop");
            System.out.println("3. Lihat Informasi Peserta");
            System.out.println("4. Lihat Informasi Tiket");
            System.out.println("5. Demonstrasi Polymorphism");
            System.out.println("6. Demonstrasi Interface");
            System.out.println("7. Simulasi Setter dan Getter");
            System.out.println("8. Keluar");
            System.out.println("Pilih menu: ");
            
            pilihan = input.nextInt();
    
            if(pilihan == 1){
                System.out.println("\n");
                seminar1.tampilkanDetail();
            }else if(pilihan == 2){
                System.out.println("\n");
                workshop1.tampilkanDetail();
            }else if(pilihan == 3){
                System.out.println("\n--------Informasi Peserta-------");
                peserta1.tampilkanInfoPeserta();
            }else if(pilihan == 4){
                System.out.println("\n--- Informasi Tiket ----");
                tiket1.tampilkanInfoTiket();
            }else if(pilihan == 5){
                System.out.println("\n---------------------------------");
                System.out.println("----Demonstrasi Polymorphism----");
                Event eventPolimorfis;
                eventPolimorfis = seminar1;
            System.out.println("---------------------------------");
            System.out.println("\nObject Seminar Event:");
            eventPolimorfis.tampilkanDetail();
            System.out.println("Jenis Event : " + eventPolimorfis.getJenisEvent());
            WorkshopEvent eventPolomorfis = workshop1;
            System.out.println("\n---------------------------------");
            System.out.println("Object Workshop Event:");
            eventPolimorfis.tampilkanDetail();
            System.out.println("Jenis Event : " + eventPolimorfis.getJenisEvent());
            
            }else if(pilihan == 6){
                System.out.println("\n----- Demonstrasi Interface -----");
                seminar1.daftarPeserta();
                seminar1.daftarPeserta("Destiya Nurfadillah");
                seminar1.batalkanPendaftaran();
            }else if(pilihan == 7){
                System.out.println("\n--- Simulasi Getter dan Setter ---");
                System.out.println("\nData sebelum perubahan:");
                System.out.println("Nama Event :" + seminar1.getNamaEvent());
                System.out.println("Harga Tiket : Rp" + tiket1.getHarga());
                
                //Setter valid
                System.out.println("\nMnegubah harga tiket menjadi Rp30000");
                tiket1.setHarga(30000);
                System.out.println("Harga setelah perubahan: Rp" + tiket1.getHarga());
                
                //Setter tidak valid
                System.out.println("\nMengubah harga tiket menjadi Rp-5000");
                tiket1.setHarga(-5000);
                System.out.println("Harga setelah data tidak valid: Rp" + tiket1.getHarga());
            }else if(pilihan == 8){
                System.out.println("\nTerima kasih telah menggunakan sistem");
            }else{
                System.out.println("\nPilihan tidak tersedia.");
            }
        }while(pilihan !=8);
        input.close();
    }
}
