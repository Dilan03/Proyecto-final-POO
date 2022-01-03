/*

clase para guardar las variables y arrays relacionadas con la informacion del usuarios y poder usarlos en todos los Jframes
por medio de metodos set y get.

*/
package proyecto_sistema_tiendaelect;

import Clases.*;
public class VarTemporales {
    private static Usuario arrUsuario[] = new Usuario[20];
    private static String nombre = "";
    private static String email = "";
    private static char[] password = {};
    private static int indexUser = 0;


    public static int getIndexUser() {
        return indexUser;
    }

    public static void setIndexUser(int aIndexUser) {
        indexUser = aIndexUser;
    }        

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String aNombre) {
        nombre = aNombre;
    }

    public static String getEmail() {
        return email;
    }


    public static void setEmail(String aEmail) {
        email = aEmail;
    }

    public static char[] getPassword() {
        return password;
    }

    public static void setPassword(char[] aPassword) {
        password = aPassword;
    }    
    
    public static Usuario[] getArrUsuario() {
        return arrUsuario;
    }

    public static void setArrUsuario(Usuario[] aArrUsuario) {
        arrUsuario = aArrUsuario;
    }
    
}
