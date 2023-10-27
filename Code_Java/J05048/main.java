/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05048;

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
        ArrayList<NhapXuat> nx = new ArrayList<>();
        while (t-- > 0) {
            nx.add(new NhapXuat(sc.nextLine(), Long.parseLong(sc.nextLine())));
        }
        for (NhapXuat x : nx) {
            System.out.println(x);
        }
    }
  
}
