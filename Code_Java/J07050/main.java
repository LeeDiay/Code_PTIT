/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07050;

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
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int t = sc.nextInt();
        int stt = 1;
        sc.nextLine();
        ArrayList<MatHang> sp = new ArrayList<>();
        while (t-- > 0) {
            sp.add(new MatHang(stt, sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
            stt++;
        }
        Collections.sort(sp);
        for (MatHang x : sp) {
            System.out.println(x);
        }
    }
}
