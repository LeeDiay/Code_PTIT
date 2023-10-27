/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07048;

/**
 *
 * @author DELL
 */
public class SanPham implements Comparable<SanPham>{
    private String id, name;
    private long price, time;

    public SanPham(String id, String name, long price, long time) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.time = time;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + price + " " + time;
    }

    @Override
    public int compareTo(SanPham o) {
        if (this.price == o.price) {
            return this.id.compareTo(o.id);
        }
        else {
            return (int) (o.price - this.price);
        }
    }
      
}
