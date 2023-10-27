/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05036;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<HangHoa> hh = new ArrayList<>();
        int stt = 1;
        while (t-- > 0) {
            hh.add(new HangHoa(stt, sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Integer.parseInt(sc.nextLine())));
            
            stt++;
        }
        for (HangHoa x : hh) {
            System.out.println(x);
        }
    }
}
