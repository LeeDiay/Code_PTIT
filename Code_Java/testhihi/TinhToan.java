/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testhihi;

import java.awt.BorderLayout;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author DELL
 */
public class TinhToan {
    public static void main(String[] args) {
        System.out.println("Bang cuu chuong: ");
        Scanner sc = new Scanner(System.in);
        int i;
        for (i = 2; i <= 9; i++){
            for (int j = 1; j <= 9; j++)
               System.out.println(i + " * " + j + " = " + (i*j));
            
        };
    }
}
