/*
Clase accesorio con sus metodos get y set
 */
package Clases;

import Clases.Producto;
public class Accesorio extends Producto{
    private String color;
    
    public Accesorio(String nombre, String marca, int precio, int stock, String color) {
        super(nombre, marca, precio, stock);
        this.color = color;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.stock = stock;
        
    }

    public String getColor() {
        return color;
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
    
    @Override // se sobreescribe porque tambien necesitamos mostrar el dato color
    public String MostrarCarateristicas(){
        return "Nombre: "+nombre+
                "\nMarca: "+marca+
                "\nPrecio: $"+precio+
                "\nColor: "+color;
    }
}
