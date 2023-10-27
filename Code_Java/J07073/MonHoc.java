/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07073;

/**
 *
 * @author DELL
 */
public class MonHoc implements Comparable<MonHoc>{
    private String id, name, liThuyet, thucHanh;
    private int soTC;

    public MonHoc(String id, String name, int soTC, String liThuyet, String thucHanh) {
        this.id = id;
        this.name = name;
        this.soTC = soTC;
        this.liThuyet = liThuyet;
        this.thucHanh = thucHanh;
    }

    public String getThucHanh() {
        return thucHanh;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + soTC + " " + liThuyet + " " + thucHanh;
    }

    @Override
    public int compareTo(MonHoc o) {
        return this.id.compareTo(o.id);
    }
     
}
