/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07054;

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
        stt = 1;
        Collections.sort(bd);
        System.out.println(bd.get(0) + " " + stt);
        for (int i = 1; i < bd.size(); i++) {
            if (bd.get(i).getTrungBinh() == bd.get(i - 1).getTrungBinh()) {
                System.out.println(bd.get(i) + " " + stt);
            } else {
                stt = i + 1;
                System.out.println(bd.get(i) + " " + stt);
            }
        }
    }
}
