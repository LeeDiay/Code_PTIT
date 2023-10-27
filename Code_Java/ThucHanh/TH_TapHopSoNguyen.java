/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author DELL
 */
public class TH_TapHopSoNguyen {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        int n = ip.nextInt();
        int m = ip.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        TreeMap<Integer, Integer> map = new  TreeMap<>();
        for (int i = 0; i< n; i++) {
            int d = ip.nextInt();
            if (map.containsKey(d) == false) {
                map.put(d, 1);
                
            }
            else map.put(d, map.get(d) + 1);
        }
        for (int i = 0; i< m; i++) {
            int d = ip.nextInt();
            if (map.containsKey(d) == false) {
                map.put(d, 1);
                
            }
            else map.put(d, map.get(d) + 1);
        }
        for (int i = 0; i < m + n; i++) {
            if (map.get(i) != 1)
                System.out.println(i);
        }
    }
}
