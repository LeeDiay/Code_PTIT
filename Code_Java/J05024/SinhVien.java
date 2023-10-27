/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05024;

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

    public String getMsv() {
        String res = null;
        if (id.substring(3, 7).equals("DCKT"))
            res = "Ke toan";
        else if (id.substring(3, 7).equals("DCCN") && clas.charAt(0) != 'E')
            res = "Cong nghe thong tin";
        else if (id.substring(3, 7).equals("DCAT") && clas.charAt(0) != 'E')
            res = "An toan thong tin";
        else if (id.substring(3, 7).equals("DCVT"))
            res = "Vien thong";
        else if (id.substring(3, 7).equals("DCDT"))
            res = "Dien tu";
        return res;
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.clas + " " + this.email;
    }
}
