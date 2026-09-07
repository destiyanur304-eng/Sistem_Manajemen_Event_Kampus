/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistem_manajemen_event_kampus_tiketing;

/**
 *
 * @author A c e r
 */
public class Sistem_Manajemen_Event_Kampus_Tiketing {

    public static void main(String[] args) {
       //Object Pertama
        Event event1 = new Event(
            "Seminar Teknologi AI",
            "Seminar",
            "10 September 2026",
            "Gedung Ilmu Komputer"
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
        System.out.println("--------------------------------------");
        System.out.println("SISTEM MANAJEMEN EVENT KAMPUS TIKETING");
        System.out.println("\n----Informasi Event----");
        event1.tampilkanInfoEvent();
        System.out.println("\n----Informasi Peserta----");
        peserta1.tampilkanInfoPeserta();
        System.out.println("\n----Informasi Tiket----");
        tiket1.tampilkanInfoTiket();
        System.out.println("--------------------------------------");
    }
}
