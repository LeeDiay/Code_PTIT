/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05030;

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
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<BangDiem> bd = new ArrayList<>();
        int stt = 1; 
        while (t-- > 0) {
            bd.add(new BangDiem(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
            sc.nextLine();
        }
        Collections.sort(bd);
        for (BangDiem x : bd) {
            System.out.printf("%d " + x + "\n", stt);
            stt++;
        }
    }
}
