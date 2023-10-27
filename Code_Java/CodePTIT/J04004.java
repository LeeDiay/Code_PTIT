/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;

import java.util.Scanner;

class PhanSo {

    private long ts, ms;

    public PhanSo(long ts, long ms) {
        this.ts = ts;
        this.ms = ms;
    }
    
    public PhanSo Cong(PhanSo a, PhanSo b) {
        long r;
        long ms1 = a.ms;
        long ms2 = b.ms;
        while (ms2 != 0) {
            r = ms1 % ms2;
            ms1 = ms2;
            ms2 = r;
        }
        long bcnn = a.ms * b.ms / ms1;
        a.ts = a.ts * (bcnn / a.ms);
        a.ms = bcnn;
        b.ts = b.ts * (bcnn / b.ms);
        b.ms = bcnn;
        a.ts = a.ts + b.ts;
        return a;
        
    }
    public void hienthi() {
        long r;
        long ts1 = this.ts;
        long ms1 = this.ms;
        while (this.ms != 0) {
            r = this.ts % this.ms;
            this.ts = this.ms;
            this.ms = r;
        }
        System.out.printf("%d/%d", ts1 / this.ts, ms1 / this.ts);
        System.out.println("");
    }
}

/**
 *
 * @author DELL
 */
public class J04004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long ts = sc.nextLong();
        long ms = sc.nextLong();
        PhanSo a = new PhanSo(ts, ms);
        ts = sc.nextLong();
        ms = sc.nextLong();
        PhanSo b = new PhanSo(ts, ms);
        a.Cong(a, b).hienthi();
    }
}
