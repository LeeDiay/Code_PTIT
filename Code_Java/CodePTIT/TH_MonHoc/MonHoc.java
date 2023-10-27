/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT.TH_MonHoc;

/**
 *
 * @author DELL
 */
public class MonHoc implements Comparable<MonHoc>{
    private String id, name, hinhThuc;

    public MonHoc(String id, String name, String hinhThuc) {
        this.id = id;
        this.name = name;
        this.hinhThuc = hinhThuc;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + hinhThuc;
    }

    @Override

    public int compareTo(MonHoc o) {
        return this.id.compareTo(o.id);
    }
    
    
}
