/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05048;

/**
 *
 * @author DELL
 */
public class NhapXuat {
    private String id;
    private long cntNhap, cntXuat, donGia, tien, thue;

    public NhapXuat(String id, long cntNhap) {
        this.id = id;
        this.cntNhap = cntNhap;
        
        // tinh so luong xuat hang
        if (id.charAt(0) == 'A') 
            cntXuat = Math.round(0.6 * cntNhap);
        else if ((id.charAt(0)) == 'B')
            cntXuat = Math.round(0.7 * cntNhap);
        
        // tinh don gia
        if (id.charAt(4) == 'Y')
            this.donGia = 110000;
        else if (id.charAt(4) == 'N')
            this.donGia = 135000;
        
        // tinh tien
        this.tien = this.cntXuat * this.donGia;
        
        //tinh thue
        if (id.charAt(0) == 'A' && id.charAt(4) == 'Y')
            this.thue = (long) (0.08 * this.tien);
        if (id.charAt(0) == 'A' && id.charAt(4) == 'N')
            this.thue = (long) (0.11 * this.tien);
        if (id.charAt(0) == 'B' && id.charAt(4) == 'Y')
            this.thue = (long) (0.17 * this.tien);
        if (id.charAt(0) == 'B' && id.charAt(4) == 'N')
            this.thue = (long) (0.22 * this.tien);
        
    }

    @Override
    public String toString() {
        return id + " " + cntNhap + " " + cntXuat + " " + donGia + " " + tien + " " + thue;
    }
    
    
}
