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
public class HangDT {
    private String idHang;
    private String hang;
    private Date created_at;
    public HangDT() {
    }
    public HangDT(String idHang, String hang, Date created_at) {
        this.idHang = idHang;
        this.hang = hang;
        this.created_at = created_at;
    }

    public String getIdHang() {
        return idHang;
    }

    public String getHang() {
        return hang;
    }

    public void setIdHang(String idHang) {
        this.idHang = idHang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }
    public Date getCreated_at() {
        return created_at;
    }


}
