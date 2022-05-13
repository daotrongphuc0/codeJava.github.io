/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author daotr
 */
public class User {
    private String name;
    private String pass;

    public User() {
    }

    public User(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }

    
    public String getName() {
        return name;
    }

    public String getPass() {
        return pass;
    }

    public void setUser(String name) {
        this.name = name;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    
}
