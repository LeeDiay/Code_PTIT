/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05030;

/**
 *
 * @author DELL
 */
public class BangDiem implements Comparable<BangDiem>{
    private String id, name, clas;
    private double m1, m2, m3;

    public BangDiem(String id, String name, String clas, double m1, double m2, double m3) {
        this.name = name;
        this.clas = clas;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.id = id;
    }

    @Override
    public int compareTo(BangDiem o) {
        return this.id.compareTo(o.id);
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.clas + " " + String.format("%.1f", this.m1) + " " + String.format("%.1f", this.m2) + " " + String.format("%.1f", this.m3);
    }   
}
