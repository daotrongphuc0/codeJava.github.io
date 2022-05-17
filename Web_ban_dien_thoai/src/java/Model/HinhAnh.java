/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author daotr
 */
public class HinhAnh {
    private String idHinhAnh;
    private String anh;

    public HinhAnh(String idHinhAnh, String anh) {
        this.idHinhAnh = idHinhAnh;
        this.anh = anh;
    }

    public HinhAnh() {
    }

    public String getIdHinhAnh() {
        return idHinhAnh;
    }

    public String getAnh() {
        return anh;
    }

    public void setIdHinhAnh(String idHinhAnh) {
        this.idHinhAnh = idHinhAnh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }
    
    
}
