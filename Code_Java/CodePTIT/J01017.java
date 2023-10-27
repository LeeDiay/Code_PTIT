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
public class J01017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long check = 1;
            long n = sc.nextLong();
            long truoc = n % 10, du;
            n /= 10;
            while (n > 0) {
                du = n % 10;
                if (Math.abs(truoc - du) != 1){
                    check = 0;
                    break;
                }
                
                truoc = n % 10;
                n /= 10;
            }
            if (check == 1) 
                System.out.println("YES");
            else System.out.println("NO");
        }   
    }
}