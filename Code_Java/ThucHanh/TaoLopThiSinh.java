/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
class ThiSinh {

    private String id, name, xepLoai;
    private double toan, li, hoa, khuVuc, uuTiendanToc, uuTiengiaiQuocgia, tongUutien, tongDiem;

    public ThiSinh(String id, String name, String danToc, double toan, double li, double hoa, String giaiQuocgia) {
        danToc = danToc.toLowerCase();
        this.id = id;
        this.name = name;
        this.toan = toan;
        this.li = li;
        this.hoa = hoa;
        //tinh uu tien khu vuc
        if (this.id.charAt(2) == '1') {
            this.khuVuc = 0;
        } else if (this.id.charAt(2) == '2') {
            this.khuVuc = 1;
        } else if (this.id.charAt(2) == '3') {
            this.khuVuc = 2;
        }

        //tinh uu tien dan toc
        if (danToc.equals("kinh")) {
            this.uuTiendanToc = 0;
        } else {
            this.uuTiendanToc = 1;
        }

        // tinh uu tien giai toan quoc
        if (giaiQuocgia.equals("1")) {
            this.uuTiengiaiQuocgia = 1.5;
        } else if (giaiQuocgia.equals("2")) {
            this.uuTiengiaiQuocgia = 1;
        } else if (giaiQuocgia.equals("3")) {
            this.uuTiengiaiQuocgia = 0.5;
        } else {
            this.uuTiengiaiQuocgia = 0;
        }

        //tinh tong diem uu tien
        this.tongUutien = this.uuTiendanToc + this.uuTiengiaiQuocgia + this.khuVuc;

        //tinh tong diem
        this.tongDiem = toan + li + hoa;

        //tinh xep loai
        if (this.tongDiem + this.tongUutien >= 26.8) {
            this.xepLoai = "TRUNG TUYEN";
        } else {
            this.xepLoai = "TRUOT";
        }

    }

    @Override
    public String toString() {
        String diemUuTien = "";
        String diemXetTuyen = "";

        if ((int) this.tongUutien == this.tongUutien) {
            diemUuTien = String.format("%.0f", tongUutien);
        } else {
            diemUuTien = String.format("%.1f", tongUutien);
        }

        if ((int) this.tongDiem == this.tongDiem) {
            diemXetTuyen = String.format("%.0f", this.tongDiem);
        } else {
            diemXetTuyen = String.format("%.1f", this.tongDiem);
        }
        return id + " " + name + " " + diemUuTien + " " + diemXetTuyen + " " + xepLoai;
    }

}

public class TaoLopThiSinh {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> ts = new ArrayList<>();
        while (t-- > 0) {
            ts.add(new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), sc.nextLine()));
        }
        for (ThiSinh x : ts) {
            System.out.println(x);
        }
    }
}
