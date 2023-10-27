/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04013;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ThiSinh> ts = new ArrayList<>();
        ts.add(new ThiSinh(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        for (ThiSinh x : ts) {
            System.out.println(x);
        }
    }
}
