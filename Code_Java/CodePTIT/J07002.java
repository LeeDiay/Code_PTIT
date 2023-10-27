/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class J07002 {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        long sum = 0;
        while (sc.hasNext()) {
            String s = sc.next();
            try {
                sum += Integer.parseInt(s);
            }
            catch (Exception e){ 
                
            }
        }
        System.out.println(sum);
    }
}
