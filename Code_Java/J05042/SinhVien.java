/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05042;

/**
 *
 * @author DELL
 */
public class SinhVien implements Comparable<SinhVien>{
    private String name;
    private int lamDung, submit;

    public SinhVien(String name, int lamDung, int submit) {
        this.name = name;
        this.lamDung = lamDung;
        this.submit = submit;
    }

    @Override
    public String toString() {
        return name + " " + lamDung + " " + submit;
    }

    @Override
    public int compareTo(SinhVien o) {
       if (this.lamDung == o.lamDung) {
           if (this.submit != o.submit)
               return this.submit - o.submit;
           else return this.name.compareTo(o.name);
       }
       else return o.lamDung - this.lamDung;
    }
     
    
}
