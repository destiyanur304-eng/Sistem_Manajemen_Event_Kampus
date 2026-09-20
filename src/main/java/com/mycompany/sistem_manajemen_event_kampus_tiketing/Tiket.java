/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistem_manajemen_event_kampus_tiketing;

/**
 *
 * @author A c e r
 */
public class Tiket {
    //Field
    private String jenisTiket;
    private int harga;
    
    //Method
    public void tampilkanInfoTiket(){
        System.out.println("Jenis Tiket : " + jenisTiket);
        System.out.println("Harga : Rp" + harga);
    }
    
    //Constructor
    public Tiket(String jenisTiket, int harga){
        this.jenisTiket = jenisTiket;
        this.harga = harga;
    }
    
    //Getter
    public String getJenisTiket(){
        return jenisTiket;
    }
    public int getHarga(){
        return harga;
    }
    
    //Setter
    public void setJenisTiket(String jenisTiket){
        this.jenisTiket = jenisTiket;
    }
    public void setHarga(int harga){
        if(harga >= 0){
            this.harga = harga;
        }else{
            System.out.println("Jenis Tiket : " + jenisTiket);
            System.out.println("Harga : Rp" + harga);
        }
    }
}
