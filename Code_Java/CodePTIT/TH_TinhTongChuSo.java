/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class TH_TinhTongChuSo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String str = sc.nextLine();
            ArrayList<Character> sm = new ArrayList<>();
            int sum = 0;
            for (char x : str.toCharArray()) {
                if (Character.isDigit(x)) {
                    sum = sum + (x - '0');
                } 
                else {
                    sm.add(x);
                }
            }
            Collections.sort(sm);
            for (char x : sm) {
                System.out.print(x);
            }
            System.out.println(sum);
        }
    }
}
