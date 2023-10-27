/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07072;

/**
 *
 * @author DELL
 */
public class HoTen implements Comparable<HoTen>{
    private String name, ten, ho, dem;

    public HoTen(String name) {
        //xu li ho ten
        String res = "";
        name = name.trim().toLowerCase();
        String[] a = name.split("\\s+");
        for (String it : a) {
            res = res + it.toUpperCase().charAt(0) + it.substring(1) + " ";
        }
        this.name = res;
        
        String[] b = res.split("\\s+");
        this.ho = b[0];
        this.ten = b[b.length - 1];
        this.dem = "";
        for (int i = 1; i < b.length - 1; i++)
            this.dem = this.dem + b[i] + " ";
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(HoTen o) {
        if (this.ten.equals(o.ten)) {
            if (this.ho.equals(o.ho)) {
                return this.dem.compareTo(o.dem);
            }
            else return this.ho.compareTo(o.ho);
        }
        else return this.ten.compareTo(o.ten);
    }
    
    
    
    
    
}
