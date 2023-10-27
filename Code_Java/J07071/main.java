/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07071;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class main {
    
    static boolean check(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        int cnt = 0;
        for(int i = 0; i< s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                cnt++;
            }
            
            if(cnt >= 2){
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) throws FileNotFoundException {
        //Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<HoTen> ht = new ArrayList<>();
        while (t-- > 0) {
            ht.add(new HoTen(sc.nextLine()));
        }
        t = Integer.parseInt(sc.nextLine());
        Collections.sort(ht);
        while (t-- > 0) {
            String tmp = sc.nextLine();
            for (HoTen x : ht) {
                if (check(x.getVietTat(), tmp)) {
                    System.out.println(x);
                }
            }
        }

    }
}
