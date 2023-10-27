/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07072;

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
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<HoTen> ht = new ArrayList<>();
        while (sc.hasNextLine()) {
            ht.add(new HoTen(sc.nextLine()));
        }
        Collections.sort(ht);
        for (HoTen x : ht) {
            System.out.println(x);
        }
    }
}
