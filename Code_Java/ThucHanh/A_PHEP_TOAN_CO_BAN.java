/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class A_PHEP_TOAN_CO_BAN {

    public static void main(String[] args) throws FileNotFoundException {
        //Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<BigInteger> a = new ArrayList<>();
        BigInteger sum = new BigInteger("0");
        for (int i = 0; i < t; i++) {
            String str = sc.nextLine();
            BigInteger temp = new BigInteger(str);
            a.add(temp);
            sum = sum.add(temp);
        }
        Collections.sort(a);
        System.out.println(a.get(0));
        System.out.println(a.get(t-1));
        System.out.println(sum);
    }
}
//5
//213
//2435
//653224
//34326
//6467