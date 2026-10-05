/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistem_manajemen_event_kampus_tiketing;

/**
 *
 * @author A c e r
 */
public class WorkshopEvent extends Event{
    private String materi;
    public WorkshopEvent(String namaEvent, String kategori, String tanggal, String lokasi, String materi){
        super(namaEvent, kategori, tanggal, lokasi);
        this.materi = materi;
    }
    public String getMateri(){
        return materi;
    }
    public void setMateri(String materi){
        this.materi = materi;
    }
    
    @Override
    public void tampilkanDetail(){
        System.out.println("------ Detailkan Workshop ------");
        System.out.println("Nama Event :" + namaEvent);
        System.out.println("Kategori :" + kategori);
        System.out.println("Tanggal :" + tanggal);
        System.out.println("Lokasi :" + lokasi);
        System.out.println("Materi :" + materi);
    }
    
    @Override
    public String getJenisEvent(){
        return "Workshop";
    }

    @Override
    public String getJenisEven() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
