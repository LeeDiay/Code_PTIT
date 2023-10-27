/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class J07021 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while (true) {
            String res = sc.nextLine().trim().toUpperCase();
            if (res.equals("END")) {
                break;
            }
            String[] a = res.split("\\s+");
            String ans = "";
            for (String x : a) {
                ans = ans + x.toUpperCase().charAt(0) + x.toLowerCase().substring(1) + " ";
            }
            System.out.println(ans);
        }
    }
}
