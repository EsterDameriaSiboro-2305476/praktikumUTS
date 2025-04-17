/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ester2305476.utspraktikum.soal2patterns;

/**
 *
 * @author ASUS Vivobook
 */
public class PatternA {
  public static String getPattern() {
        StringBuilder result = new StringBuilder("Pattern A:\n");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                result.append(j).append(" ");
            }
            result.append("\n");
        }
        return result.toString();
    }
}

