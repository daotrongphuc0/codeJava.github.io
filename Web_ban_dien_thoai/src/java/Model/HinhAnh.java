/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Date;

/**
 *
 * @author daotr
 */
public class HinhAnh {
    private String idHinhAnh;
    private String slug;
    private String alt;
    private Date created_at;

    public HinhAnh() {
    }

    public HinhAnh(String idHinhAnh, String slug, String alt, Date created_at) {
        this.idHinhAnh = idHinhAnh;
        this.slug = slug;
        this.alt = alt;
        this.created_at = created_at;
    }

    public String getIdHinhAnh() {
        return idHinhAnh;
    }

    public void setIdHinhAnh(String idHinhAnh) {
        this.idHinhAnh = idHinhAnh;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public Date getCreated_at() {
        return created_at;
    }

    

}
