/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05022;

/**
 *
 * @author DELL
 */
public class SinhVien {
    private String id, name, clas, email;

    public SinhVien(String id, String name, String clas, String email) {
        this.id = id;
        this.name = name;
        this.clas = clas;
        this.email = email;
    }

    public String getClas() {
        return clas;
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.clas + " " + this.email;
    }

}
