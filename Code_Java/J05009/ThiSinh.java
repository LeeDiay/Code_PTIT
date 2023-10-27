/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05009;

/**
 *
 * @author DELL
 */
public class ThiSinh implements Comparable<ThiSinh> {

    private String name, birth;
    private int id;
    private double m1, m2, m3, sum;

    public ThiSinh(int stt, String name, String birth, double m1, double m2, double m3) {
        this.id = stt;
        this.name = name;
        this.birth = birth;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.sum = m1 + m2 + m3;
    }

    public double getSum() {
        return sum;
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " "+ this.birth + " " + this.sum;
    }

    @Override
    public int compareTo(ThiSinh o) {  
        if (this.sum == o.sum) {
            if (this.id < o.id) {
                return -1;   
            }
            else return 1;
//            return this.id - o.id;
        } else if (this.sum > o.sum) {
            return -1;
        } else {
            return 1;
        }
    }
}
