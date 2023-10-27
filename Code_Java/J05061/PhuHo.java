/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05061;

/**
 *
 * @author DELL
 */
public class PhuHo implements Comparable<PhuHo>{
    private String name, birth, xepLoai, id;
    private double liThuyet, thucHanh, diemTB, diemThuong;
    private int age;

    public PhuHo(int stt, String name, String birth, double liThuyet, double thucHanh) {
        this.id = "PH" + String.format("%02d", stt);
        this.name = name;
        this.birth = birth;
        this.liThuyet = liThuyet;
        this.thucHanh = thucHanh;
        this.age = 2021 - Integer.parseInt(this.birth.substring(6));
        //tinh diem thuong
        if (liThuyet >= 8 && thucHanh >= 8)
            this.diemThuong = 1;
        else if (liThuyet >= 7.5 && thucHanh >= 7.5)
            this.diemThuong = 0.5;
        else this.diemThuong = 0;
        // tinh tong diem
        this.diemTB = Math.round(((liThuyet + thucHanh) / 2) + this.diemThuong);
        // chuan hoa diem tb
        if (this.diemTB >= 10)
            this.diemTB = 10;
        
        // tinh xep loai
        if (this.diemTB >= 9)
            this.xepLoai = "Xuat sac";
        else if (this.diemTB >= 8)
            this.xepLoai = "Gioi";
        else if (this.diemTB >= 7)
            this.xepLoai = "Kha";
        else if (this.diemTB >= 5)
            this.xepLoai = "Trung binh";
        else this.xepLoai = "Truot";
                  
    }

    @Override
    public String toString() {
        return id + " " + name + " " + age + " " + String.format("%.0f", diemTB) + " " + xepLoai;
    }

    @Override
    public int compareTo(PhuHo o) {
        if (this.diemTB == o.diemTB)
            return this.id.compareTo(o.id);
        else return Double.compare(o.diemTB, this.diemTB);
    }
    
    
}
