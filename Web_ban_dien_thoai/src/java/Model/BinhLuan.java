/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author daotr
 */
public class BinhLuan {
    private NguoiDung nguoiDung;
    private SanPham sanPham;
    private String noiDung;
    private Date created_at;

    public BinhLuan(NguoiDung nguoiDung, SanPham sanPham, String noiDung, Date created_at) {
        this.nguoiDung = nguoiDung;
        this.sanPham = sanPham;
        this.noiDung = noiDung;
        this.created_at = created_at;
    }

    public NguoiDung getNguoiDung() {
        return nguoiDung;
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setNguoiDung(NguoiDung nguoiDung) {
        this.nguoiDung = nguoiDung;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }


    
}
