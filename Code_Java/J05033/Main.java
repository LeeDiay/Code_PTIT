/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05033;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
       
        ArrayList<GioPhut>  a = new ArrayList<>();
        for (int i = 0; i < t; i++) {
             sc.nextLine();
            String hour = sc.next();
            String min = sc.next();
            String sec = sc.next();
            a.add(new GioPhut(hour, min, sec));
            
        }
        Collections.sort(a);
        for (GioPhut x : a) {
            System.out.println(x);
        }
    }
}
