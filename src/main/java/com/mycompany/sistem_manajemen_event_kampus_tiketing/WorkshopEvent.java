/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistem_manajemen_event_kampus_tiketing;

/**
 *
 * @author A c e r
 */
public class WorkshopEvent extends Event {

    private String materi;

    // Constructor
    public WorkshopEvent(String namaEvent, String kategori, String tanggal,
                         String lokasi, String materi) {
        super(namaEvent, kategori, tanggal, lokasi);
        this.materi = materi;
    }

    // Getter dan Setter
    public String getMateri() {
        return materi;
    }

    public void setMateri(String materi) {
        this.materi = materi;
    }

    // Overriding Abstract Method
    @Override
    public void tampilkanDetail() {
        System.out.println("----- Detail Workshop -----");
        System.out.println("Nama Event : " + namaEvent);
        System.out.println("Kategori : " + kategori);
        System.out.println("Tanggal : " + tanggal);
        System.out.println("Lokasi : " + lokasi);
        System.out.println("Materi : " + materi);
    }

    @Override
    public String getJenisEvent() {
        return "Workshop";
    }
}