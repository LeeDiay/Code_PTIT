/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh;

import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author DELL
 */
public class TH_LopINSET {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        TreeSet<Integer> IntSet = new TreeSet();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            IntSet.add(a[i]);
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
            IntSet.add(b[i]);
        }
        for (Integer x : IntSet) {
            System.out.print(x + " ");
        }
        
//        IntSet s1 = new IntSet(a);
//        IntSet s2 = new IntSet(b);
//        IntSet s3 = s1.union(s2);
//        System.out.println(s3);
    }
}
