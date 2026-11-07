/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistem_manajemen_event_kampus_tiketing;

/**
 *
 * @author A c e r
 */
import java.io.Serializable;
        
public class KartuPeserta implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nomorKartu;
    private String namaPemilik;
    
    public KartuPeserta(String nomorKartu, String namaPemilik){
        this.nomorKartu = nomorKartu;
        this.namaPemilik = namaPemilik;
    }
    
    public void tampilkanInfoKartu(){
        System.out.println("Nomor Kartu : " + nomorKartu);
        System.out.println("Nama Pemilik : " + namaPemilik);
    }
}
