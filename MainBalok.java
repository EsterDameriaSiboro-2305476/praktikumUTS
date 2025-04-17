/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ester2305476.utspraktikum;

/**
 *
 * @author ASUS Vivobook
 */
public class MainBalok {
   public static void main(String[] args) {
        balok b1 = new balok(1, 1, 1);
        System.out.println("Balok dengan panjang: " + b1.getPanjang()
                + ", lebar: " + b1.getLebar()
                + " dan tinggi: " + b1.getTinggi()
                + ". Luasnya: " + b1.getLuas()
                + ", kelilingnya: " + b1.getKeliling()
                + " dan volumenya: " + b1.getVolume());

        balok b2 = new balok(30, 40, 50);
        System.out.println("Balok dengan panjang: " + b2.getPanjang()
                + ", lebar: " + b2.getLebar()
                + " dan tinggi: " + b2.getTinggi()
                + ". Luasnya: " + b2.getLuas()
                + ", kelilingnya: " + b2.getKeliling()
                + " dan volumenya: " + b2.getVolume());

        balok b3 = new balok(25, 35, 45);
        System.out.println("Balok dengan panjang: " + b3.getPanjang()
                + ", lebar: " + b3.getLebar()
                + " dan tinggi: " + b3.getTinggi()
                + ". Luasnya: " + b3.getLuas()
                + ", kelilingnya: " + b3.getKeliling()
                + " dan volumenya: " + b3.getVolume());
    }
}
