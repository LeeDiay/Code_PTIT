/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05044;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Luong> l = new ArrayList<>();
        int stt = 1;
        while (t-- > 0) {
            l.add(new Luong(stt, sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
            stt++;
        }
        String res = sc.nextLine();
        for (Luong x : l) {
            if (res.equals(x.getChucVu()))
                System.out.println(x);
        }
    }
}
