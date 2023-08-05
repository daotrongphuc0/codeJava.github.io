/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


/**
 *
 * @author daotr
 */
public class SachDuocDat {
    private int id;
    private NguoiDung nguoiDung;
    private Sach sach;
    private int sl;

    public SachDuocDat() {
    }

    public SachDuocDat(int id, NguoiDung nguoiDung, Sach sach, int sl) {
        this.id = id;
        this.nguoiDung = nguoiDung;
        this.sach = sach;
        this.sl = sl;
    }

    

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public NguoiDung getNguoiDung() {
        return nguoiDung;
    }

    public void setNguoiDung(NguoiDung khachHang) {
        this.nguoiDung = khachHang;
    }

    public Sach getSach() {
        return sach;
    }

    public void setSach(Sach sach) {
        this.sach = sach;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    @Override
    public String toString() {
        return "SachDuocDat{" + "id=" + id + ", nguoiDung=" + nguoiDung + ", sach=" + sach + ", sl=" + sl + '}';
    }

   

  
    
}
