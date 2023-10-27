/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05044;

/**
 *
 * @author DELL
 */
public class Luong {

    private String name, id, chucVu;
    private int phuCap, tamUng, luongChinh, luongConLai;

    public Luong(int stt, String name, String chucVu, int luongCoBan, int ngayCong) {
        this.id = "NV" + String.format("%02d", stt);
        this.name = name;
        this.luongChinh = luongCoBan * ngayCong;
        this.chucVu = chucVu;
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
    }

    @Override
    public String toString() {
        return id + " " + name + " " + phuCap + " " + luongChinh + " " + tamUng + " " + luongConLai;
    }

    public String getChucVu() {
        return chucVu;
    }

}
