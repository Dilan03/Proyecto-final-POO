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
public class Producto {
    public String nombre;
    public String marca;
    public int precio;
    public int stock;

    public Producto(String nombre, String marca, int precio, int stock) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.stock = stock;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
       

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }
    
    //Metodos para mostrar datos que sobreescribiremos en las clases hijas 
    public String MostrarCarateristicas(){
        return "Nombre: "+nombre+
                "\nMarca: "+marca+
                "\nPrecio: $"+precio;
    }
    
    
}
