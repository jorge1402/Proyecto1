
package util;

public class Validador {
    
    public static void validarDni(String dni) throws Exception{
        if(dni.trim().length()!=8){
            throw new Exception("Longitud errónea");
        }
    }
}
