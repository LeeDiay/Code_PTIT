/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;

import java.util.Scanner;

class GiaoVien {
    private final String id;
    private final String name;
    private final long luong;

    public GiaoVien(String id, String name, long luong) {
        this.id = id;
        this.name = name;
        this.luong = luong;
    }
    
    public void hienthi() {
        long bacluong = (this.id.charAt(2) - '0') * 10 + this.id.charAt(3) - '0';
        long pc = 0;
        if (this.id.charAt(1) == 'T')
            pc = 2000000;
        if (this.id.charAt(1) == 'P')
            pc = 900000;
        if (this.id.charAt(1) == 'V')
            pc = 500000;
        System.out.printf("%s %s %d %d %d", this.id, this.name, bacluong, pc, luong * bacluong + pc);
    }
}


/**
 *
 * @author DELL
 */
public class J04015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GiaoVien gv = new GiaoVien(sc.nextLine(), sc.nextLine(), sc.nextLong());
        gv.hienthi();
    }
}
