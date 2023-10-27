/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07052;

/**
 *
 * @author DELL
 */
class ThiSinh implements Comparable<ThiSinh>{

    private String id, name;
    private double toan, li, hoa, uuTien, xetTuyen;

    public ThiSinh(String id, String name, double toan, double li, double hoa) {
        this.id = id;
        String res = "";
        name = name.trim();
        String[] a = name.split("\\s+");
        for (String it : a) {
            res = res + it.toUpperCase().charAt(0) + it.toLowerCase().substring(1) + " ";
        }
        this.name = res;
        this.toan = toan;
        this.li = li;
        this.hoa = hoa;
        if (id.charAt(2) == '1') {
            this.uuTien = 0.5;
        }
        if (id.charAt(2) == '2') {
            this.uuTien = 1.0;
        }
        if (id.charAt(2) == '3') {
            this.uuTien = 2.5;
        }

        this.xetTuyen = toan * 2 + li + hoa + this.uuTien;
    }

    @Override
    public String toString() {
        String diemUuTien = "";
        String diemXetTuyen = "";
        
        if((int) this.uuTien == this.uuTien){
            diemUuTien = String.format("%.0f", uuTien);
        }
        else{
            diemUuTien = String.format("%.1f", uuTien);
        }
        
         if((int) this.xetTuyen == this.xetTuyen){
            diemXetTuyen = String.format("%.0f", this.xetTuyen);
        }
        else{
            diemXetTuyen = String.format("%.1f", this.xetTuyen);
        }
        
        return id + " " + name  + diemUuTien + " " + diemXetTuyen;
        
    }

    @Override
    public int compareTo(ThiSinh o) {
        if (this.xetTuyen == o.xetTuyen) {
            return this.id.compareTo(o.id);
        }
        else  return Double.compare(o.xetTuyen, this.xetTuyen);
    }

    public double getXetTuyen() {
        return xetTuyen;
    }

    
}