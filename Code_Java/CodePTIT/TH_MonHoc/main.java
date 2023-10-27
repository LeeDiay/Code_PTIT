/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT.TH_MonHoc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        HashSet<String> s = new HashSet<>();
        ArrayList<MonHoc> mh = new ArrayList<>();
        while (sc.hasNextLine()) {
            MonHoc x = new MonHoc(sc.nextLine(), sc.nextLine(), sc.nextLine());
            if (!s.contains(x.getId())) {
                mh.add(x);
            }
            s.add(x.getId());
        }
        Collections.sort(mh);
        for (MonHoc it : mh) {
            System.out.println(it);
        }
    }
}
