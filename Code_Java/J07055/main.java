/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07055;

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
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int t = Integer.parseInt(sc.nextLine());
        int stt = 1;
        ArrayList<BangDiem> bd = new ArrayList<>();
        while (t-- > 0) {
            bd.add(new BangDiem(stt, sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
            stt++;
        }
        Collections.sort(bd);
        for (BangDiem x : bd) {
            System.out.println(x);
        }
    }
}
