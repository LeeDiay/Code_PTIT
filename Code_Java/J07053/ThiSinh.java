/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07053;

/**
 *
 * @author DELL
 */
public class ThiSinh {

    private String name, birth, xepLoai, id;
    private double liThuyet, thucHanh, thuong, trungBinh;
    private int age;

    public ThiSinh(int stt, String name, String birth, double liThuyet, double thucHanh) {
        String res = "";
        name = name.trim().toLowerCase();
        String[] a = name.split("\\s+");
        for (String it : a) {
            res = res + it.toUpperCase().charAt(0) + it.substring(1) + " ";
        }
        this.name = res;

        if (birth.charAt(2) != '/') {
            birth = '0' + birth;
        }
        if (birth.charAt(5) != '/') {
            birth = birth.substring(0, 3) + "0" + birth.substring(3);
        }
        this.birth = birth;
        this.age = 2021 - Integer.parseInt(birth.substring(6));
        this.liThuyet = liThuyet;
        this.thucHanh = thucHanh;
        this.id = "PH" + String.format("%02d", stt);

        if (liThuyet >= 8 && thucHanh >= 8) {
            thuong = 1;
        } else if (liThuyet >= 7.5 && thucHanh >= 7.5) {
            thuong = 0.5;
        } else {
            thuong = 0;
        }

        this.trungBinh = Math.round((liThuyet + thucHanh) * 0.5 + thuong);
        if (this.trungBinh > 10) {
            this.trungBinh = 10;
        }

        if (this.trungBinh >= 9) {
            this.xepLoai = "Xuat sac";
        } else if (this.trungBinh >= 8) {
            this.xepLoai = "Gioi";
        } else if (this.trungBinh >= 7) {
            this.xepLoai = "Kha";
        } else if (this.trungBinh >= 5) {
            this.xepLoai = "Trung binh";
        } else {
            this.xepLoai = "Truot";
        }

    }

    @Override
    public String toString() {
        return id + " " + name + age + " " + String.format("%.0f", trungBinh) + " " + xepLoai;
    }

}
