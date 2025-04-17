/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ester2305476.utspraktikum.soal2patterns;

/**
 *
 * @author ASUS Vivobook
 */
public class PatternB {
      public static String getPattern() {
        StringBuilder result = new StringBuilder("Pattern B:\n");
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                result.append(j).append(" ");
            }
            result.append("\n");
        }
        return result.toString();
    }
}
