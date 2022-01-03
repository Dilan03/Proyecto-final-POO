/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Clases.Producto;
public class Componente extends Producto{
    private String memoria;
    private String frecuencia;

    public Componente(String nombre, String marca, int precio, int stock, String memoria, String frecuencia) {
        super(nombre, marca, precio, stock);
        this.frecuencia = frecuencia;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.stock = stock;
        this.memoria = memoria;
    }

    public String getMemoria() {
        return memoria;
    }

    public String getFrecuencia() {
        return frecuencia;
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
    
    @Override // se sobreescribe porque tambien necesitamos mostrar los datos memoria y frecuencia
    public String MostrarCarateristicas(){
        return "Nombre: "+nombre+
                "\nMarca: "+marca+
                "\nPrecio: $"+precio+
                "\nMemoria: "+memoria+
                "\nFrecuencia: "+frecuencia;
    }
    
}
