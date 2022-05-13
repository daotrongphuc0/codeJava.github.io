/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.User;

/**
 *
 * @author daotr
 */
public class DangnhapCtr {
    public static void main(String[] args) {
        System.out.println("sasas");
        dangnhapDAO a = new dangnhapDAO();
        User user = new User("nhv","123");
        a.addUser(user);
        System.out.println("add thanh cong");
    }
}
