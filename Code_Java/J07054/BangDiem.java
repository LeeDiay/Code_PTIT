/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07054;

/**
 *
 * @author DELL
 */
public class BangDiem implements Comparable<BangDiem> {

    private String name, id;
    private double mon1, mon2, mon3, trungBinh;

    public BangDiem(int stt, String name, double mon1, double mon2, double mon3) {
        String res = "";
        name = name.trim().toLowerCase();
        String[] a = name.split("\\s+");
        for (String it : a) {
            res = res + it.toUpperCase().charAt(0) + it.substring(1) + " ";
        }
        this.name = res;

        this.mon1 = mon1;
        this.mon2 = mon2;
        this.mon3 = mon3;
        this.id = "SV" + String.format("%02d", stt);
        this.trungBinh = (mon1 * 3 + mon2 * 3 + mon3 * 2) / 8;
    }

    public double getTrungBinh() {
        return trungBinh;
    }

    @Override
    public String toString() {
        return id + " " + name + String.format("%.2f", trungBinh);
    }

    @Override
    public int compareTo(BangDiem o) {
        if (this.trungBinh == o.trungBinh) {
            return this.name.compareTo(o.name);
        } else {
            return Double.compare(o.trungBinh, this.trungBinh);
        }
    }
}
