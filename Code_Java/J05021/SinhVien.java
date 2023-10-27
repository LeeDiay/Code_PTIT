/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05021;

/**
 *
 * @author DELL
 */
public class SinhVien implements  Comparable<SinhVien>{
    private String msv, name, clas, email;

    public SinhVien(String msv, String name, String clas, String email) {
        this.msv = msv;
        this.name = name;
        this.clas = clas;
        this.email = email;
    }

    @Override
    public String toString() {
        return this.msv + " " + this.name + " " + this.clas + " " + this.email;
    }

    @Override
    public int compareTo(SinhVien o) {
            return this.msv.compareTo(o.msv);   
    }
    

}

