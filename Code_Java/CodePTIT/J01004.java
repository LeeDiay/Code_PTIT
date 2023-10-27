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
public class J01004 {
    public static boolean check(int n){
        if (n < 2)
            return false;
       for (int i = 2 ; i <= Math.sqrt(n); i++)
           if (n % i == 0) {
               return false;
           }
         return true;      
    }
            
          
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if (check(n) == false)
               System.out.println("NO");
            else System.out.println("YES");
        }
        
    }
}
