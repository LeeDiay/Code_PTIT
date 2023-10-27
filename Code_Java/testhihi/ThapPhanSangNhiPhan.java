package testhihi;

import java.util.*;

public class ThapPhanSangNhiPhan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so thap phan: ");
        int a = sc.nextInt();
        String nhi = "";
        while (a > 0) {
            nhi = (a % 2) + nhi;
            a = a / 2;
        }
        System.out.println("Nhi phan la: " + nhi);
    }
}
