/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class J03010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        String res;
        HashMap<String, Integer> mp = new HashMap<>();
        while (t-- > 0) {
            String s = sc.nextLine().trim().toLowerCase();
            String[] a = s.split("\\s+");
            res = "";
            res += a[a.length - 1];
            for (int i = 0; i < a.length - 1; i++)
                res +=  a[i].substring(0, 1);
            if (mp.containsKey(res) == false)
                mp.put(res, 1);
            else {
                mp.put(res, mp.get(res) + 1);
            }
            if (mp.get(res) == 1)
                System.out.println(res + "@ptit.edu.vn");
            else System.out.println(res + mp.get(res) + "@ptit.edu.vn");
        }   
        
    }
}
