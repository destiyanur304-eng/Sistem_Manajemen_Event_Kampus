/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistem_manajemen_event_kampus_tiketing;

/**
 *
 * @author A c e r
 */
public class Event {
    //Field
    private String namaEvent;
    private String kategori;
    private String tanggal;
    private String lokasi;
    
    //Method
    public void tampilkanInfoEvent(){
        System.out.println("Nama Event :" + namaEvent);
        System.out.println("Kategori :" + kategori);
        System.out.println("Tanggal :" + tanggal);
        System.out.println("Lokasi :" + lokasi);
    }
    
    //Constructor
    public Event(String namaEvent, String kategori, String tanggal, String lokasi){
        this.namaEvent = namaEvent;
        this.kategori = kategori;
        this.tanggal = tanggal;
        this.lokasi = lokasi;
    } 
    
    //Getter
    public String getNamaEvent(){
        return namaEvent;
    }
    public String getKategori(){
        return kategori;
    }
    public String getTanggal(){
        return tanggal;
    }
    public String getLokasi(){
        return lokasi;
    }
    
    //Setter
    public void setNamaEvent(String namaEvent){
        this.namaEvent = namaEvent;
    }
    public void setKategori(String kategori){
        this.kategori = kategori;
    }
    public void setTanggal(String tanggal){
        this.tanggal = tanggal;
    }
    public void setLokasi(String lokasi){
        this.lokasi = lokasi;
    }
}
