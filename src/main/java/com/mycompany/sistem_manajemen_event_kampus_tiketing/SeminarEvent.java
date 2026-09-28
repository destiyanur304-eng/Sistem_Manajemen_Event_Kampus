/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistem_manajemen_event_kampus_tiketing;

/**
 *
 * @author A c e r
 */
public class SeminarEvent extends Event{
    
    private String pembicara;
    public SeminarEvent(String namaEvent, String kategori, String tanggal, String lokasi, String pembicara){
        super(namaEvent, kategori, tanggal, lokasi);
        this.pembicara = pembicara;
    }
    public String getPembicara(){
        return pembicara;
    }
    public void setPembicara(String pembicara){
        this.pembicara = pembicara;
    }
    @Override
    public void tampilkanInfoEvent(){
        super.tampilkanInfoEvent();
            System.out.println("Pembicara : " + pembicara);
    }
}
