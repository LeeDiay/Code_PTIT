/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05049;

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
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<NhapXuat> nx = new ArrayList<>();
        while (t-- > 0) {
            nx.add(new NhapXuat(sc.nextLine(), Long.parseLong(sc.nextLine())));
        }
        Collections.sort(nx);
        String tmp = sc.nextLine();
        for (NhapXuat x : nx) {
            if (x.getId().contains(tmp))
                System.out.println(x);
        }
    }
  
}
