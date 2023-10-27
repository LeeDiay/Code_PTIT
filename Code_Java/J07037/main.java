/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07037;

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
        Scanner sc = new Scanner(new File("DN.in"));
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<ThucTap> tt = new ArrayList<>();
        while (t-- > 0) {
            tt.add(new ThucTap(sc.nextLine(), sc.nextLine(), sc.nextLine()));
            //sc.nextLine();
        }
        Collections.sort(tt);
        for (ThucTap x : tt) {
            System.out.println(x);
        }
    }
}
