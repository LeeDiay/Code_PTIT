/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04012;

/**
 *
 * @author DELL
 */
public class BangLuong {

    private String name, chucVu, id;
    private long luongNgay, cnt, thuong, phuCap, thucLinh, luongThang;

    public BangLuong(int stt, String name, long luongNgay, long cnt, String chucVu) {
        this.id = "NV" + String.format("%02d", stt);
        this.chucVu = chucVu;
        this.luongNgay = luongNgay;
        this.cnt = cnt;
        this.luongThang = luongNgay * cnt;
        if (cnt >= 25) {
            this.thuong = (long) (luongThang * 0.2);
        } else if (cnt >= 22) {
            this.thuong = (long) (luongThang * 0.1);
        } else {
            this.thuong = 0;
        }

        if (chucVu.equals("GD")) {
            this.phuCap = 250000;
        }
        if (chucVu.equals("PGD")) {
            this.phuCap = 200000;
        }
        if (chucVu.equals("TP")) {
            this.phuCap = 180000;
        }
        if (chucVu.equals("NV")) {
            this.phuCap = 150000;
        }
        this.name = name;
        this.thucLinh = luongThang + thuong + phuCap;
    }

    public long getThucLinh() {
        return thucLinh;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + luongThang + " " + thuong + " " + phuCap + " " + thucLinh;
    }

}
