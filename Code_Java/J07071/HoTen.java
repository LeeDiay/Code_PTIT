/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07071;

/**
 *
 * @author DELL
 */
public class HoTen implements Comparable<HoTen>{
    private String name, ten, ho, vietTat;

    public HoTen(String name) {
        this.name = name;
        String res = "";
        String[] a = name.split("\\s+");
        
        this.ho = a[0];
        this.ten = a[a.length - 1];
        for (int i = 0; i < a.length - 1; i++) {
            res = res + a[i].charAt(0) + ".";
        }
        res = res + ten.charAt(0);
        this.vietTat = res;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public String getVietTat() {
        return vietTat;
    }

    @Override
    public int compareTo(HoTen o) {
        if (this.ten.equals(o.ten))
            return this.ho.compareTo(o.ho);
        else 
            return this.ten.compareTo(o.ten);
    }
    
    
    
    
}
