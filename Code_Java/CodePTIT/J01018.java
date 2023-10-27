/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class J01018 {
    public static boolean checksum(long n){
       long sum = 0;
       while (n > 0){
           sum = sum + n % 10;
           n /= 10;
       }
       if (sum % 10 == 0)
           return true;
       return false;  
    }
    
    public static boolean checkchuso(long n) {
        long truoc = n % 10, du;
            n /= 10;
            while (n > 0) {
                du = n % 10;
                if (Math.abs(truoc - du) != 2){
                    return false;
                }
                truoc = n % 10;
                n /= 10;
            }
            return true;
    }
            
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-- > 0) {
            long n = sc.nextLong();
        if (checksum(n) == true && checkchuso(n) == true) 
            System.out.println("YES");
            else System.out.println("NO");
        
        }
        
    }
}
