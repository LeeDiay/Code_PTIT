/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;
import java.util.*;
/**
 *
 * @author DELL
 */
public class TH_SoPhatLoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            String s = sc.next();
            System.out.println(s.length() >= 2 && s.substring(s.length() - 2).equals("86") ? "YES" : "NO");
        }
    }
}
