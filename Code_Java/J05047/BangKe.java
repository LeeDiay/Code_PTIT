/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05047;

import java.util.HashMap;

/**
 *
 * @author DELL
 */
public class BangKe implements  Comparable<BangKe>{
    private String name, id;
    private int cnt, donGia, tienChietKhau, thanhTien;
    private double phanTramChietKhau;
    public static HashMap<String, Integer> map = new HashMap<>();

    public BangKe(String name, int cnt, int donGia) {
        // tinh ma hang
        String res = "";
        String[] a = name.split("\\s+");
        res = res + a[0].toUpperCase().charAt(0) + a[1].toUpperCase().charAt(0);
            if (map.containsKey(res))
                map.put(res, map.get(res) + 1);
            else map.put(res, 1);
        this.id = String.format("%s%02d", res, map.get(res));

        this.name = name;
        this.cnt = cnt;
        this.donGia = donGia;

        //tinh phan tram chiet khau
        if (cnt >= 10) {
            this.phanTramChietKhau = 0.05;
        } else if (cnt >= 8) {
            this.phanTramChietKhau = 0.02;
        } else if (cnt >= 5) {
            this.phanTramChietKhau = 0.01;
        } else {
            this.phanTramChietKhau = 0;
        }

        //tinh tien chiet khau
        this.tienChietKhau = (int) (this.donGia * this.cnt * this.phanTramChietKhau);

        //tinh thanh tien
        this.thanhTien = this.donGia * this.cnt - this.tienChietKhau;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + tienChietKhau + " " + thanhTien;
    }

    @Override
    public int compareTo(BangKe o) {
        return o.tienChietKhau - this.tienChietKhau;
    }
}
