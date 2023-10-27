/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05045;

/**
 *
 * @author DELL
 */
public class Luong implements Comparable<Luong> {

    private String name, id;
    private int phuCap, tamUng, luongChinh, luongConLai, thuNhap;

    public Luong(int stt, String name, String chucVu, int luongCoBan, int ngayCong) {
        this.id = "NV" + String.format("%02d", stt);
        this.name = name;
        this.luongChinh = luongCoBan * ngayCong;
        // tinh phu cap
        if (chucVu.equals("GD")) {
            this.phuCap = 500;
        } else if (chucVu.equals("PGD")) {
            this.phuCap = 400;
        } else if (chucVu.equals("TP")) {
            this.phuCap = 300;
        } else if (chucVu.equals("KT")) {
            this.phuCap = 250;
        } else {
            this.phuCap = 100;
        }

        //tinh tam ung
        int tmp = (int) (this.phuCap + this.luongChinh) * 2 / 3;
        if (tmp < 25000) {
            this.tamUng = (int) Math.round(tmp / 1000.0) * 1000;
        } else {
            this.tamUng = 25000;
        }

        this.luongConLai = this.luongChinh + this.phuCap - this.tamUng;
        this.thuNhap = this.luongChinh + this.phuCap;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + phuCap + " " + luongChinh + " " + tamUng + " " + luongConLai;
    }

    @Override
    public int compareTo(Luong o) {
        if (this.thuNhap == o.thuNhap) {
            return this.id.compareTo(o.id);
        } else {
            return o.thuNhap - this.thuNhap;
        }
    }

}
