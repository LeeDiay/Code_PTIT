/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05033;

/**
 *
 * @author DELL
 */
public class GioPhut implements Comparable<GioPhut>{
    public String gio, phut, giay;

    public GioPhut(String gio, String phut, String giay) {
        if (gio.length() == 1)
            gio = "0" + gio;
        if (phut.length() == 1)
            phut = "0" + phut;
        if (giay.length() == 1)
            giay = "0" + giay;
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }
    
    @Override
    public String toString() {
        return Integer.parseInt(this.gio) + " " + Integer.parseInt(this.phut) + " " + Integer.parseInt(this.giay);
    }
    
    @Override
    public int compareTo(GioPhut o) {
        if (this.gio.equals(o.gio)) {
            if (this.phut.equals(o.phut))
                return this.giay.compareTo(o.giay);
            return this.phut.compareTo(o.phut);
            
        }
        else {
            return this.gio.compareTo(o.gio);        
        }   
        
    }
}
