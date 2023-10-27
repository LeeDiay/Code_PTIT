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
public class J01009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long tmp = 1, res = 0;
        for (int i = 1; i <= n; i++){
            tmp = tmp * i;
            res = res + tmp;
        }    
        System.out.println(res);
    }
}
