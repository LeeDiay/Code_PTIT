/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05051;

/**
 *
 * @author DELL
 */
public class TienDien implements Comparable<TienDien>{

    private long heSo, thanhTien, phuTroi, tongTien, moi, cu;
    private String id, loaiKH;

    public TienDien(int stt, String loaiKH, long cu, long moi) {
        this.moi = moi;
        this.cu = cu;
        this.loaiKH = loaiKH;
        this.id = "KH" + String.format("%02d", stt);

        // tinh he so
        if (loaiKH.equals("KD")) {
            this.heSo = 3;
        } else if (loaiKH.equals("NN")) {
            this.heSo = 5;
        } else if (loaiKH.equals("TT")) {
            this.heSo = 4;
        } else if (loaiKH.equals("CN")) {
            this.heSo = 2;
        }

        //tinh thanh tien
        this.thanhTien = (moi - cu) * this.heSo * 550;

        //tinh phu troi
        if (moi - cu > 100) {
            this.phuTroi = this.thanhTien;
        } else if (moi - cu >= 50) {
            this.phuTroi = Math.round(this.thanhTien * 0.35f);
        } else {
            this.phuTroi = 0;
        }

        //tinh tong tien
        this.tongTien = this.thanhTien + this.phuTroi;
    }

    @Override
    public String toString() {
        return id + " " + heSo + " " + thanhTien + " " + phuTroi + " " + tongTien;
    }

    @Override
    public int compareTo(TienDien o) {
        return Long.compare(o.tongTien, this.tongTien);
    }

}
