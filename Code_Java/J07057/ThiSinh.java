/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07057;

/**
 *
 * @author DELL
 */
public class ThiSinh implements Comparable<ThiSinh>{
    private String name, danToc, xepLoai, id;
    private double khuVuc, diemThi, diemKhuVuc, diemDanToc;

    public ThiSinh(int stt, String name, double diemThi, String danToc, double khuVuc ) {
        this.id = "TS" + String.format("%02d", stt);
        
        //xu li ho ten
        String res = "";
        name = name.trim().toLowerCase();
        String[] a = name.split("\\s+");
        for (String it : a) {
            res = res + it.toUpperCase().charAt(0) + it.substring(1) + " ";
        }
        this.name = res;
        
        //cong diem dan toc
        this.danToc = danToc;
        if (danToc.equals("Kinh"))
            this.diemDanToc = 0;
        else this.diemDanToc = 1.5;
        
        //cong diem khu vuc
        this.khuVuc = khuVuc;
        if (khuVuc == 1)
            this.diemKhuVuc = 1.5;
        else if (khuVuc == 2)
            this.diemKhuVuc = 1;
        else this.diemKhuVuc = 0;
        
        //diem chinh thuc va xep loai
        this.diemThi = diemThi + this.diemDanToc + this.diemKhuVuc;
        if (this.diemThi >= 20.5)
            this.xepLoai = "Do";
        else this.xepLoai = "Truot";
    }

    @Override
    public String toString() {
        return id + " " + name + String.format("%.1f", diemThi) + " " + xepLoai;
    }

    @Override
    public int compareTo(ThiSinh o) {
        if (this.diemThi == o.diemThi)
            return this.id.compareTo(o.id);
        else return Double.compare(o.diemThi, this.diemThi);
    }
    
    
}
