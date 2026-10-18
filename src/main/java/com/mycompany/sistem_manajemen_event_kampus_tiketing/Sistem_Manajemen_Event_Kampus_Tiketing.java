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
            "18 September 2026",
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
        
        //Object Panitia
        Panitia panitia1 = new Panitia(
             "Panitia Kampus"
        );
        
        //Menampilakn Informasi
        panitia1.tambahEvent(seminar1);
        panitia1.tambahEvent(workshop1);
        int pilihan = 0;
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
            System.out.println("8. Demonstrasi Exception Handling");
            System.out.println("9. Demonstrasi Relasi Antar-Objek");
            System.out.println("10. Keluar");
            System.out.println("Pilih menu: ");
            
            try{
                pilihan = Integer.parseInt(input.nextLine());
            }catch(NumberFormatException e){
                System.out.println("Input harus berupa angka.");
                continue;
            }
            
            if(pilihan == 1){
                seminar1.tampilkanDetail();
            }else if(pilihan == 2){
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
            eventPolimorfis = workshop1;
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
                System.out.println("Nama Event :" + seminar1.getNamaEvent());
                System.out.println("Harga Tiket : Rp" + tiket1.getHarga());
                try{
                    tiket1.setHarga(30000);
                    System.out.println("Harga setelah perubahan: Rp" + tiket1.getHarga());
                }catch(HargaTiketTidakValidException e){
                    System.out.println("Kesalahan: " + e.getMessage());
                }finally{
                    System.out.println("Pemeriksa harga pertama selesai.");
                }
            }else if(pilihan == 8){
                System.out.println("\n---- Demonstrasi Exception Handling ----");
                
                //Pengujian harga tidak valid
            try{
                System.out.println("Mengubah harga menjadi Rp-5000.");
                tiket1.setHarga(-5000);
                System.out.println("Harga berhasil diubah.");
            } catch(HargaTiketTidakValidException e){
                System.out.println("Kesalahan: " + e.getMessage());
            }finally{
                System.out.println("Proses pengujian harga tidak valid selesai.");
            }
                System.out.println("Harga tiket akhir: Rp" + tiket1.getHarga());
            }else if(pilihan == 9){
                System.out.println("\n---- Demoonstrasi Relasi Antar Objek ---");
                System.out.println("[1] Composition - Kartu Peserta");
                peserta1.tampilkanInfoPeserta();
                peserta1.tampilkanKartuPeserta();
                System.out.println("\n[2] Assiociation - Interaksi Panitia");
                panitia1.melayaniPeserta(peserta1);
            }else if (pilihan == 10){
                System.out.println("\nTerima kasih telah menggunakan sistem.");
            }else {
                System.out.println("\nPilihan tidak tersedia.");
            }      
        }while(pilihan != 10);
        input.close();
    }
}
