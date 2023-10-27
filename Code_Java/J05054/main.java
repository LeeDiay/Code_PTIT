/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05054;

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
        int stt = 1;
        ArrayList<HocSinh> hs = new ArrayList<>();
        ArrayList<HocSinh> hs2 = new ArrayList<>();
        while (t-- > 0) {
            String ten = sc.nextLine();
            double diem = Double.parseDouble(sc.nextLine());
            hs.add(new HocSinh(stt, ten, diem));
            hs2.add(new HocSinh(stt, ten, diem));
            stt++;
        }

        
        Collections.sort(hs2);
        stt = 1;
        hs2.get(0).setRank(stt);
        for (int i = 1; i < hs2.size(); i++) {
            if (hs2.get(i).getDiemTB() == hs2.get(i - 1).getDiemTB()) {
                hs2.get(i).setRank(stt);
            } else {
                stt = i + 1;
                hs2.get(i).setRank(stt);
            }
        }

        for (HocSinh x : hs) {
            double tmp = x.getDiemTB();
            for (int i = 0; i < hs2.size(); i++) {
                if (tmp == hs2.get(i).getDiemTB()) {
                    x.setRank(hs2.get(i).getRank());
                    break;
                }
            }
        }
        for (HocSinh x : hs) {
            System.out.println(x);
        }

    }
}
