/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author DELL
 */
public class L_HINH_CHU_NHAT_DON_SAC {
    public static long cal(long[] a, int n) {
        long res = Long.MIN_VALUE;
        Stack<Integer> st = new Stack<>();
        int i = 0;
        while (i < n) {
            if (st.empty() || a[i] > a[st.peek()]) {
                st.push(i);
                i++;
            } else {
                int e = st.pop();
                if (st.empty()) {
                    res = Math.max(res, (long)i * a[e]);
                } else {
                    res = Math.max(res, (long) a[e] * (i - st.peek() - 1));
                }
            }
        }
        while (!st.empty()) {
            int e = st.pop();
            if (st.empty()) {
                res = Math.max(res, (long)i * a[e]);
            } else {
                res = Math.max(res, (long) a[e] * (i - st.peek() - 1));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        long[] a = new long[n];
        long[] b = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = m - a[i];
        }   
        long res = Long.MIN_VALUE;
        res = Math.max(res, cal(a, n));
        res = Math.max(res, cal(b, n));
        System.out.println(res);
    }
}
