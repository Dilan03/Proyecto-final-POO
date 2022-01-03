/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author PC
 */
public class Usuario {
    private String nombre;
    private String email;
    private String password;
    private int saldo;

    public Usuario(String nombre, String email, String password, int saldo) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.saldo = saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getSaldo() {
        return saldo;
    }
    
    
    
}
