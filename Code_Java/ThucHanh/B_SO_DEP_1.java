/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class B_SO_DEP_1 {

    public static int check(int x) {
        String s = x + "";
        if (s.length() < 2) {
            return 0;
        }
        for (int t = 0; t < s.length() - 1; t++) {
            if ((s.charAt(t + 1) - '0') < (s.charAt(t) - '0')) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream input1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) input1.readObject();
        ObjectInputStream input2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a1 = (ArrayList<Integer>) input2.readObject();
        int[] cnt1 = new int[100005];
        int[] cnt2 = new int[100005];
        for (int x : a) {
            if (check(x) == 1) {
                cnt1[x]++;
            }
        }

        for (int x : a1) {
            if (check(x) == 1) {
                cnt2[x]++;
            }
        }

        for (int i = 10; i <= 9999; i++) {
            if (cnt1[i] != 0 && cnt2[i] != 0) {
                System.out.println(i + " " + cnt1[i] + " " + cnt2[i]);
            }
        }
    }
}
