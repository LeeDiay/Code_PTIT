/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05037;

/**
 *
 * @author DELL
 */
public class HangHoa implements Comparable<HangHoa>{
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
        this.phiVC = Math.round((double)(donGiaNhap * cnt * 0.05));
        this.thanhTien = Math.round((donGiaNhap * cnt) + phiVC);
        this.giaBan = (long) Math.ceil(((double) ((thanhTien + Math.round((double) (thanhTien) * 2) / 100)) / cnt) / 100) * 100;
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.unit + " " + this.phiVC + " " + this.thanhTien + " " + this.giaBan;
    }

    @Override
    public int compareTo(HangHoa o) {
        if (this.giaBan > o.giaBan)
            return -1;
        else return 1;
    }
}
