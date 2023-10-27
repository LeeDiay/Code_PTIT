/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05006;

/**
 *
 * @author DELL
 */
public class NhanVien {
    private String id, name, sex, birth, address, tax, date_sign;

    public NhanVien(int stt, String name, String sex, String birth, String address, String tax, String date_sign) {
        this.name = name;
        this.sex = sex;
        this.birth = birth;
        this.address = address;
        this.tax = tax;
        this.date_sign = date_sign;
        this.id = String.format("%05d", stt);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getBirth() {
        return birth;
    }

    public String getAddress() {
        return address;
    }

    public String getTax() {
        return tax;
    }

    public String getDate_sign() {
        return date_sign;
    }
    
    @Override
    public String toString() {
       return this.id + " " + this.name + " " + this.sex + " " + this.birth + " " + this.address + " " +  this.tax + " " + this.date_sign;   
    }  
}
