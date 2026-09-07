/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistem_manajemen_event_kampus_tiketing;

/**
 *
 * @author A c e r
 */
public class Peserta {
    //Field
    String nama;
    String npm;
    String prodi;
    
    //Method
    public void tampilkanInfoPeserta(){
        System.out.println("Nama : " + nama);
        System.out.println("NPM : " + npm);
        System.out.println("Prodi : " + prodi);
    }
    
    //Constructor
    public Peserta(String nama, String npm, String prodi){
        this.nama = nama;
        this.npm = npm;
        this.prodi = prodi;
    }
}