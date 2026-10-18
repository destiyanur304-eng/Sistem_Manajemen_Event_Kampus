/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistem_manajemen_event_kampus_tiketing;

/**
 *
 * @author A c e r
 */
import java.util.ArrayList;
import java.util.List;

public class Panitia {
    private String nama;
    
    private List<Event>daftarEvent;
    public Panitia(String nama){
        this.nama = nama;
        this.daftarEvent = new ArrayList<>();
    }
    
    public void tambahEvent(Event event){
        daftarEvent.add(event);
    }
    
    public void tampilkanDaftarEvent(){
        System.out.println("Panitia: " + nama);
        System.out.println("Daftar Event yang Dikelola:");
        
        for(Event event : daftarEvent){
            System.out.println("- " + event.getNamaEvent() + ")");
        }
    }
    
    public void melayaniPeserta(Peserta peserta){
        System.out.println(nama + " melayani peserta " + peserta.getNama() + ".");
    }
}
