/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05021;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        ArrayList<SinhVien> sv = new ArrayList<>();
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            if(s.isEmpty()){
                break;
            }
            sv.add(new SinhVien(s, sc.nextLine(), sc.nextLine(), sc.nextLine()));
//            System.out.println(sv.size());
        }
        Collections.sort(sv);
        for (SinhVien x : sv) {
            System.out.println(x);
        }
    }
}
