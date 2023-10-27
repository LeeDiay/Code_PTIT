/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07045;

/**
 *
 * @author DELL
 */
public class LoaiPhong implements  Comparable<LoaiPhong>{
    private String id, name;
    private double donGia, phiPV;

    public LoaiPhong(String data) {
        String[] tmp = data.trim().split("\\s+");
        this.id = tmp[0];
        this.name = tmp[1];
        this.donGia = Integer.parseInt(tmp[2]);
        this.phiPV = Double.parseDouble(tmp[3]);
    }

    @Override
    public int compareTo(LoaiPhong o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + donGia + " " + String.format("%.2f", phiPV);
    }  
    
}
