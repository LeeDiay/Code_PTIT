/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07057;


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
        Scanner sc = new Scanner(new File("THISINH.in"));
        int t = Integer.parseInt(sc.nextLine());
        int stt = 1;
        ArrayList<ThiSinh> ts = new ArrayList<>();
        while (t-- > 0) {
            ts.add(new ThiSinh(stt, sc.nextLine(), Double.parseDouble(sc.nextLine()), sc.nextLine(), Double.parseDouble(sc.nextLine())));
            stt++;
        }
        Collections.sort(ts);
        for (ThiSinh x : ts) {
            System.out.println(x);
        }
    }
}
