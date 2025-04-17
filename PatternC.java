/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ester2305476.utspraktikum.soal2patterns;

/**
 *
 * @author ASUS Vivobook
 */
public class PatternC {
     public static String getPattern() {
        StringBuilder result = new StringBuilder("Pattern C:\n");
        for (int i = 1; i <= 6; i++) {
            for (int s = 1; s <= 6 - i; s++) {
                result.append("  ");
            }
            for (int j = 1; j <= i; j++) {
                result.append(j).append(" ");
            }
            result.append("\n");
        }
        return result.toString();
    }
}