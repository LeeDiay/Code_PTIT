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
public class J04003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long ts  = sc.nextLong();;
        long ms = sc.nextLong();
        PhanSo ps = new PhanSo(ts, ms);
        ps.hienthi();
    }
}
