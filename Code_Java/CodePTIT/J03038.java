/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class J03038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] dd = new int[127];
        for (int i = 0; i < str.length(); i++)
            dd[str.charAt(i)]++;
        int dem = 0;
        for (char i = 'a'; i <= 'z'; i++)
            if (dd[i] > 0)
                dem++;
        System.out.println(dem);
    }
}
