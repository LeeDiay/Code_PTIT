/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07048;

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
        //Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<SanPham> sp = new ArrayList<>();
        while (t-- > 0) {
            sp.add(new SanPham(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine())));
        }
        Collections.sort(sp);
        for (SanPham x : sp) {
            System.out.println(x);
        }
    }
}
