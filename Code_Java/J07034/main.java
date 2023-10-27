/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07034;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
       // Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<MonHoc> mt = new ArrayList<>();
        while (t-- > 0) {
            mt.add(new MonHoc(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
            
        }
        Collections.sort(mt);
        for (MonHoc x : mt) {
            System.out.println(x);
        }
    }
    
}
