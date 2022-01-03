/*

Este archivo se utiliza para guardar los arrays y las varibles relacionadas con la compra de los productos 
para poder usarlos en todos los Jframes, por medio de metodos set y get 

*/
package proyecto_sistema_tiendaelect;

import Clases.*;
public class ProdTemporal {

    private static String arrProductos[] = new String[300];
    private static int prodCont = 0;
    private static int arrPrecios[] = new int[300];    
    
    public static int[] getArrPrecios() {
        return arrPrecios;
    }


    public static void setArrPrecios(int[] aArrPrecios) {
        arrPrecios = aArrPrecios;
    }

    public static int getProdCont() {
        return prodCont;
    }

    public static void setProdCont(int aProdCont) {
        prodCont = aProdCont;
    }
  
    
    public static String[] getArrProductos() {
        return arrProductos;
    }

    public static void setArrProductos(String[] aArrProductos) {
        arrProductos = aArrProductos;
    }
    

    
}
