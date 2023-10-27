/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05027;

/**
 *
 * @author DELL
 */
public class GiangVien {
    private String id, name, major, ten;

    public GiangVien(int stt, String name, String major) {
        this.id = "GV" + String.format("%02d", stt);
        this.name = name;
        String[] a1 = major.split("\\s+");
        this.major = "";
        for (String a11 : a1) {
            this.major = this.major + a11.toUpperCase().charAt(0);
        }
    }

    @Override
    public String toString() {
        return id + " " + name + " " + major;
    }

    public String getName() {
        return name;
    }

    
}
