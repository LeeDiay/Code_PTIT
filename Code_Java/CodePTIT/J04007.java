/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;

import java.util.Scanner;

class NhanVien {
    private final String name;
    private final String sex;
    private final String birth;
    private final String add;
    private final String code;
    private final String date;

    public NhanVien(String name, String sex, String birth, String add, String code, String date) {
        this.name = name;
        this.sex = sex;
        this.birth = birth;
        this.add = add;
        this.code = code;
        this.date = date;
    }
    
    public void hienthi() {
        System.out.printf("00001 %s %s %s %s %s %s", this.name, this.sex, this.birth, this.add, this.code, this.date);
    }
    
}

/**
 *
 * @author DELL
 */
public class J04007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien nv = new NhanVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        nv.hienthi();
    }
}
