package BaseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Moises
 */
public class conexion {

    static Connection con;
    
    public static void conectar() throws Exception{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost/colegio", "root", "");
        } catch (Exception e) {
            throw new Exception("Imposible realizar conexion con la BD"+e.getMessage());            
        }
    }
    
    public static ResultSet consultar(String sql) throws Exception{
        try{
            Statement st = con.createStatement();
            ResultSet resultado = st.executeQuery(sql);
            return resultado;
        }
        catch (Exception e) {
            throw new Exception("Error al consultar la BD"+e.getMessage());            
        }
    }
    
    public static int ejecutar(String sql) throws Exception{
        try{
            Statement st = con.createStatement();
            int resultado = st.executeUpdate(sql);
            return resultado;
        }
        catch (Exception e) {
            throw new Exception("Error al actualizar la BD"+e.getMessage());            
        }
    }
    
    public static void desconectar() throws Exception{
        try{
            con.close();
        }
        catch(Exception e){
            throw new Exception("Error al desconectar con la BD"+e.getMessage());
        }
    }
}
