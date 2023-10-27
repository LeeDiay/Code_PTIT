/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07034;

/**
 *
 * @author DELL
 */
public class MonHoc implements Comparable<MonHoc>{
    private String id, name;
    private final int stc;

    public MonHoc(String id, String name, int stc) {
        this.id = id;
        this.name = name;
        this.stc = stc;
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.stc;
    }

    @Override
    public int compareTo(MonHoc o) {
        return this.name.compareTo(o.name);
    }
    
    
}

