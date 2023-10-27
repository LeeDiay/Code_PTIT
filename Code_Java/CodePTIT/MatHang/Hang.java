/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT.MatHang;

/**
 *
 * @author DELL
 */
public class Hang implements Comparable<Hang> {
    private String name, id, stt;
    private long donGia, cnt, giamGia, thanhTien;

    public Hang(String name, String id, long donGia, long cnt) {
        this.name = name;
        this.id = id;
        this.donGia = donGia;
        this.cnt = cnt;
        if (this.id.charAt(4) != '2')
            this.giamGia =  Math.round(0.5 * donGia * cnt);
        else this.giamGia =  Math.round(0.3 * donGia * cnt);
        this.thanhTien = donGia * cnt - giamGia;
        this.stt = this.id.substring(1, 4);
    }

    @Override
    public String toString() {
        return name + " " + id + " " + this.stt + " " + giamGia + " " + thanhTien;
    }

    @Override
    public int compareTo(Hang o) {
        return this.stt.compareTo(o.stt);
    }
    
}
