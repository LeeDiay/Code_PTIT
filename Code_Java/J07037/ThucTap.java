/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07037;

/**
 *
 * @author DELL
 */
public class ThucTap implements Comparable<ThucTap>{
    private String id, name, cnt;
   // private int cnt;

    public ThucTap(String id, String name, String cnt) {
        this.id = id;
        this.name = name;
        this.cnt = cnt;
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.cnt;
    }

    @Override
    public int compareTo(ThucTap o) {
      return this.id.compareTo(o.id);
    }
    
    
    
    
}

