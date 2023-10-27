/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class HangHoa implements Comparable<HangHoa> {

    private final String id;
    private final String name;
    private final String uni;
    private final int giamua;
    private final int giaban;
    private final int loinhuan;

    public HangHoa(int stt, String name, String uni, int giamua, int giaban) {
        this.id = "MH" + String.format("%03d", stt);
        this.name = name;
        this.uni = uni;
        this.giamua = giamua;
        this.giaban = giaban;
        this.loinhuan = this.giaban - this.giamua;
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.uni + " " + this.giamua + " " + this.giaban + " " + this.loinhuan;
    }

    @Override
    public int compareTo(HangHoa t) {
        if (this.loinhuan == t.loinhuan) {
            if (this.id.compareTo(t.id) < 0)
                return -1;
            else return 1;
        } else {
            if (this.loinhuan > t.loinhuan) {
                return -1;
            } else {
                return 1;
            }
        }
    }

}

/**
 *
 * @author DELL
 */
public class J05081 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<HangHoa> a = new ArrayList<>();
        int stt = 1;
        for (int i = 1; i <= t; i++) {
            String ten = sc.nextLine();
            String donvi = sc.nextLine();
            int giamua = Integer.parseInt(sc.nextLine());
            int giaban = Integer.parseInt(sc.nextLine());
            a.add(new HangHoa(stt, ten, donvi, giamua, giaban));
            stt++;
        }

        Collections.sort(a);
        for (HangHoa x : a) {
            System.out.println(x);
        }
    }
}