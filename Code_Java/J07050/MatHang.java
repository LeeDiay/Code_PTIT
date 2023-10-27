/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07050;

/**
 *
 * @author DELL
 */
public class MatHang implements Comparable<MatHang>{
    private String id, name, group;
    private double giaMua, giaBan, loiNhuan;

    public MatHang(int stt, String name, String group, double giaMua, double giaBan) {
        this.id = "MH" + String.format("%02d", stt);
        this.name = name;
        this.group = group;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        this.loiNhuan = giaBan - giaMua;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + group + " " + String.format("%.2f", loiNhuan);
    }

    @Override
    public int compareTo(MatHang o) {
        return (int) (o.loiNhuan - this.loiNhuan);
    }
    
    
    
}
