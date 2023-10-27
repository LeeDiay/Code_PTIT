/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05011;

/**
 *
 * @author DELL
 */
public class TinhGio implements Comparable<TinhGio> {

    private String id, name, in, out;
    private int time;

    public TinhGio(String id, String name, String in, String out) {
        this.id = id;
        this.name = name;
        this.time = (Integer.parseInt(out.substring(0, 2)) - Integer.parseInt(in.substring(0, 2))) * 60 + Integer.parseInt(out.substring(3)) - Integer.parseInt(in.substring(3));
    }

    public String getTime() {
        int gio = this.time / 60;
        int phut = this.time % 60;
        return String.format("%d gio % d phut", gio, phut);
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + getTime();
    }

    @Override
    public int compareTo(TinhGio o) {
        if (this.time > o.time) {
            return -1;
        } else {
            return 1;
        }
    }
}
