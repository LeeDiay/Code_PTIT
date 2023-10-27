/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05054;

/**
 *
 * @author DELL
 */
public class HocSinh implements Comparable<HocSinh>{

    private String name, id, xepLoai;
    private double diemTB;
    public int rank;

    public HocSinh(int stt, String name, double diemTB) {
        this.id = "HS" + String.format("%02d", stt);
        this.name = name;
        this.diemTB = diemTB;
        //xep loai
        if (diemTB >= 9) {
            this.xepLoai = "Gioi";
        } else if (diemTB >= 7) {
            this.xepLoai = "Kha";
        } else if (diemTB >= 5) {
            this.xepLoai = "Trung Binh";
        } else {
            this.xepLoai = "Yeu";
        }
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + diemTB + " " + xepLoai + " " + rank;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public int compareTo(HocSinh o) {
        return Double.compare(o.diemTB, this.diemTB);
    }

    public double getDiemTB() {
        return diemTB;
    }

}
