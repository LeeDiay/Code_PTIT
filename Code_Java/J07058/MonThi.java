/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07058;

/**
 *
 * @author DELL
 */
public class MonThi implements Comparable<MonThi>{
    private String id, name, hinhthuc;

    public MonThi(String id, String name, String hinhthuc) {
        this.id = id;
        this.name = name;
        this.hinhthuc = hinhthuc;
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.hinhthuc;
    }

    @Override
    public int compareTo(MonThi o) {
        return this.id.compareTo(o.id);
    }
    
    
}
