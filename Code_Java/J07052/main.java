/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07052;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class main {
    public static void main(String[] args) throws IOException, FileNotFoundException {
//        Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("THISINH.in"));
        
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> ts = new ArrayList<>();
        while (t-- > 0) {
            ts.add(new ThiSinh(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        t = Integer.parseInt(sc.nextLine());
        double diemChuan = 0;
        Collections.sort(ts);
        //Tinh diem chuan
        while (t != 0) {
            for (ThiSinh x : ts) { 
                diemChuan = x.getXetTuyen();
                t--;
                if (t == 0) break;
            }
          
        }
        System.out.println(diemChuan);
        for (ThiSinh x : ts) {
            if (x.getXetTuyen() >= diemChuan) {
                System.out.print(x);
                System.out.println(" TRUNG TUYEN");
            }
            else {
                System.out.print(x);
                System.out.println(" TRUOT");
            }
        }
    }
}