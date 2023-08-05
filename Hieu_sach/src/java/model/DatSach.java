/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author daotr
 */
public class DatSach {
    private int id;
    private NguoiDung nguoiDung;
    private Sach sach;
    private int sl;

    public DatSach() {
    }

    public DatSach(int id, NguoiDung nguoiDung, Sach sach, int sl) {
        this.id = id;
        this.nguoiDung = nguoiDung;
        this.sach = sach;
        this.sl = sl;
    }

    

    public NguoiDung getNguoiDung() {
        return nguoiDung;
    }

    public void setNguoiDung(NguoiDung nguoiDung) {
        this.nguoiDung = nguoiDung;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    public int tinhGia(){
        return sl*sach.getGia();
    }
    @Override
    public String toString() {
        return "DatSach{" + "id=" + id + ", nguoiDung=" + nguoiDung + ", sach=" + sach + ", sl=" + sl + '}';
    }

    
    
}
