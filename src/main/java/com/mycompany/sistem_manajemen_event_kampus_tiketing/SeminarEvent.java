/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistem_manajemen_event_kampus_tiketing;

/**
 *
 * @author A c e r
 */
public class SeminarEvent extends Event implements BisaDidaftarkan, BisaDibatalkan{
    
    private String pembicara;
    // Constructor
    public SeminarEvent(String namaEvent, String kategori, String tanggal, String lokasi, String pembicara){
        super(namaEvent, kategori, tanggal, lokasi);
        this.pembicara = pembicara;
    }
    // Getter dan Setter
    public String getPembicara(){
        return pembicara;
    }
    public void setPembicara(String pembicara){
        this.pembicara = pembicara;
    }
    
    // overriding abstract method
    @Override
    public void tampilkanDetail(){
        System.out.println("----- Detail Seminar ------");
        System.out.println("Nama Event :" + namaEvent);
        System.out.println("Kategori :" + kategori);
        System.out.println("Tanggal :" + tanggal);
        System.out.println("Lokasi :" + lokasi);
        System.out.println("Pembicara :" + pembicara);
    }
    
    @Override
    public String getJenisEvent(){
        return "Seminar";
    }
    
    @Override
    public void daftarPeserta(){
        System.out.println("Pendaftaran peserta seminar berhasil.");
    }
    
    @Override
    public void daftarPeserta(String namaPeserta){
        System.out.println("Peserta " + namaPeserta + " berhasil didaftarkan ke seminar.");
    }
    
    @Override
    public void batalkanPendaftaran(){
        System.out.println("Pendaftran seminar dibatalkan.");
    }

    @Override
    public String getJenisEven() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
