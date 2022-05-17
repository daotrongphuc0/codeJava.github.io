/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author daotr
 */
public class HangDT {
    private String idHang;
    private String hang;

    public HangDT() {
    }

    public HangDT(String idHang, String hang) {
        this.idHang = idHang;
        this.hang = hang;
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
    
}
