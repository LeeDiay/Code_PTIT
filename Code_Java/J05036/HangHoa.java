/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05036;

/**
 *
 * @author DELL
 */
public class HangHoa {

    private String id, name, unit;
    private int cnt;
    private double donGiaNhap;
    private long phiVC, thanhTien, giaBan;

    public HangHoa(int stt, String name, String unit, double donGiaNhap, int cnt) {
        this.id = "MH" + String.format("%02d", stt);
        this.name = name;
        this.unit = unit;
        this.donGiaNhap = donGiaNhap;
        this.cnt = cnt;
        this.phiVC = Math.round(donGiaNhap * cnt * 0.05);
        this.thanhTien = Math.round((donGiaNhap * cnt) + phiVC);
        this.giaBan = Math.round(this.thanhTien + this.thanhTien * 0.02);
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.unit + " " + this.phiVC + " " + this.thanhTien + " " + this.giaBan;
    }

}
