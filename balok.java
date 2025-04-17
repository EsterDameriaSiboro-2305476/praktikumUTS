/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ester2305476.utspraktikum;

/**
 *
 * @author ASUS Vivobook
 */
public class balok {
     private int panjang;
    private int lebar;
    private int tinggi;

    public balok(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public int getLuas() {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }

    public int getKeliling() {
        return 4 * (panjang + lebar + tinggi);
    }

    public int getVolume() {
        return panjang * lebar * tinggi;
    }

    public void cetakInfo() {
        System.out.println("Balok dengan panjang: " + this.panjang +
                ", lebar: " + this.lebar +
                " dan tinggi: " + this.tinggi +
                ". Luasnya: " + getLuas() +
                ", kelilingnya: " + getKeliling() +
                " dan volumenya: " + getVolume());
    }
}
