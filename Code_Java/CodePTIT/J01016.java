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
public class J01016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long count = 0;
        long du;
        while (n > 0){
            du = n % 10;
            if (du == 4)
                count++; 
            if (du == 7)
                count++;
            n /= 10;
        }
        if (count == 4 || count == 7)
             System.out.println("YES");
        
        else System.out.println("NO");
    }
 
}
