/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Clases.Producto;
public class Almacenamiento extends Producto{
    private int capacidad;

    public Almacenamiento(String nombre, String marca, int precio, int stock,int capacidad) {
        super(nombre, marca, precio, stock);
        this.capacidad = capacidad;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.stock = stock;
        
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }

    public int getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }
    
    @Override // se sobreescribe porque tambien necesitamos mostrar el dato capacidad 
    public String MostrarCarateristicas(){
        return "Nombre: "+nombre+
                "\nMarca: "+marca+
                "\nPrecio: $"+precio+
                "\nCapacidad: "+capacidad;
    }
    
    
}
