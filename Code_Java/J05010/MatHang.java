/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05010;

/**
 *
 * @author DELL
 */
public class MatHang implements Comparable<MatHang> {

    private String name, group;
    private int id;
    private double giamua, giaban, loinhuan;

    public MatHang(int stt, String name, String group, double giamua, double giaban) {
        this.name = name;
        this.group = group;
        this.giamua = giamua;
        this.giaban = giaban;
        this.loinhuan = giaban - giamua;
        this.id = stt;
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.group + " " + String.format("%.2f", this.loinhuan);
    }

    @Override
    public int compareTo(MatHang o) {
        if (this.loinhuan > o.loinhuan) {
            return -1;
        } else {
            return 1;
        }
    }

}
