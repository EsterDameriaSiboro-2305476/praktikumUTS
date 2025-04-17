/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ester2305476.utspraktikum;

/**
 *
 * @author ASUS Vivobook
 */
import java.util.Scanner;

public class PalindromTigaDigit {
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tiga digit integer: ");
        int angka = input.nextInt();

        int digitPertama = angka / 100;
        int digitTerakhir = angka % 10;

        if (digitPertama == digitTerakhir) {
            System.out.println(angka + " adalah palindrom");
        } else {
            System.out.println(angka + " bukan palindrom");
        }
    }
}