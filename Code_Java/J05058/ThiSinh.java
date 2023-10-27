/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05058;

/**
 *
 * @author DELL
 */
public class ThiSinh implements Comparable<ThiSinh>{

    private String name, id, xepLoai;
    private double toan, li, hoa, diemUuTien, tongDiem, diemChua;

    public ThiSinh(String id, String name, double toan, double li, double hoa) {
        this.name = name;
        this.id = id;
        this.toan = toan;
        this.li = li;
        this.hoa = hoa;

        char tmp = id.charAt(2);
        if (tmp == '1') {
            this.diemUuTien = 0.5;
        }
        if (tmp == '2') {
            this.diemUuTien = 1.0;
        }
        if (tmp == '3') {
            this.diemUuTien = 2.5;
        }

        this.diemChua = toan * 2 + li + hoa;
        this.tongDiem = toan * 2 + li + hoa + diemUuTien;
        if (this.tongDiem >= 24) {
            this.xepLoai = "TRUNG TUYEN";
        } else {
            this.xepLoai = "TRUOT";
        }
    }

    @Override
    public String toString() {
        String UuTien = "";
        String diemXetTuyen = "";
        
        if((int) this.diemUuTien == this.diemUuTien){
            UuTien = String.format("%.0f", diemUuTien);
        }
        else{
            UuTien = String.format("%.1f", diemUuTien);
        }
        
         if((int) this.tongDiem == this.tongDiem){
            diemXetTuyen = String.format("%.0f", this.tongDiem);
        }
        else{
            diemXetTuyen = String.format("%.1f", this.tongDiem);
        }
        
        return id + " " + name + " " + UuTien + " " + diemXetTuyen + " " + xepLoai;
    }

    @Override
    public int compareTo(ThiSinh o) {
        if (this.tongDiem == o.tongDiem) {
            return this.id.compareTo(o.id);
        }
        else return Double.compare(o.tongDiem, this.tongDiem);
    }

}

