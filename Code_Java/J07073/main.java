/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07073;

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
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<MonHoc> mh = new ArrayList<>();
        while (t-- > 0){
            mh.add(new MonHoc(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(mh);
        for (MonHoc x : mh) {
            if (!x.getThucHanh().equals("Truc tiep")) {
                System.out.println(x);
            }
        }
    }
}
