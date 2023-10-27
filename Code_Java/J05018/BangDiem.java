/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05018;

/**
 *
 * @author DELL
 */
public class BangDiem {
    private String name, id, xepLoai;
    private double toan, van, ta, li, hoa, sinh, su, dia, gdcd, congnghe, trungbinh;


    public BangDiem(int stt, String name, double toan, double van, double ta, double li, double hoa, double sinh, double su, double dia, double gdcd, double congnghe) {
        this.name = name;
        this.id = "HS" + String.format("%02d", stt);
        this.trungbinh = (toan * 2 + van * 2 + ta + li + hoa + sinh + su + dia + gdcd + congnghe) / 12;
        setXepLoai();

    }

    public double getDiem() {
        return trungbinh;
    }
    
    private void setXepLoai() {
        
        if (this.trungbinh >= 9)
            this.xepLoai = "XUAT SAC";
        else if (this.trungbinh >= 8){
            xepLoai = "GIOI";
        }
        else if(trungbinh >= 7) {
            xepLoai = "KHA";
        }
        else if (trungbinh >= 5) {
            xepLoai = "TB";
        }
        else xepLoai = "YEU";
        
    }
    
    @Override
    public String toString() {
        double tmp = Math.round(trungbinh * 10) / 10.0;
        return id + " " + name + " " + String.format("%.1f", tmp) + " " + xepLoai;
    }

    
    
    
}
