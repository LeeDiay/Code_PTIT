/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT.Submit;

import java.util.*;
import java.io.*;
/**
 *
 * @author DELL
 */

public class main {

    public static void main(String[] args) throws FileNotFoundException {
//        Scanner sc = new Scanner(new File("LUYENTAP.in"));
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        sc.nextLine();
        ArrayList<SinhVien> sv = new ArrayList<>();
        while (t-- > 0) {
            sv.add(new SinhVien(sc.nextLine(), Integer.parseInt(sc.next()), Integer.parseInt(sc.next())));
            sc.nextLine();
        }
        Collections.sort(sv);
        for (SinhVien x : sv) {
            System.out.println(x);
        }
    }
}

