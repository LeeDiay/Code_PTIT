/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07033;

/**
 *
 * @author DELL
 */
public class SinhVien implements Comparable<SinhVien>{
    private String id, name, clas, email;

    public SinhVien(String id, String name, String clas, String email) {
        this.id = id;
        name = name.trim().toLowerCase();
        String res = "";
        String[] a = name.split("\\s+");
        for (String a1 : a) {
            res = res + a1.toUpperCase().charAt(0) + a1.substring(1) + " ";
        }
        this.name = res;
        this.clas = clas;
        this.email = email;
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.clas + " " + this.email;
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.id.compareTo(o.id);
    }
  
    
    
}
