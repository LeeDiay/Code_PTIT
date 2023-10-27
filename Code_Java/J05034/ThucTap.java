/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05034;

/**
 *
 * @author DELL
 */
public class ThucTap implements Comparable<ThucTap>{
    private String id, name, clas, email, doanhNghiep;
    private int stt;

    public ThucTap(int stt, String id, String name, String clas, String email, String doanhNghiep) {
        this.id = id;
        this.name = name;
        this.clas = clas;
        this.email = email;
        this.doanhNghiep = doanhNghiep;
        this.stt = stt;
    }

    public String getDoanhNghiep() {
        return doanhNghiep;
    }
    
    

    @Override
    public int compareTo(ThucTap o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return this.stt + " " + this.id + " " + this.name + " " + this.clas +  " " + this.email + " " + this.doanhNghiep;
    }
     
    
}
