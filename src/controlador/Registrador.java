
package controlador;

import BaseDatos.conexion;
import modelo.Cliente;

public class Registrador {

    public void registrarCliente(Cliente p) throws Exception {
        System.out.println("Empieza operación registrar");  
        conexion.conectar();
        String sql = "INSERT INTO cliente(dni, apellidos, nombres,estado) "
                + "VALUES('" + p.getDni() + "',"
                + "'" + p.getApellidos() + "',"
                + "'" + p.getNombres() + "',1)";
        System.out.println("Intentando registrar entidad de tipo "+p.getClass().getName());
        try {
            
            conexion.ejecutar(sql);
            System.out.println("Cliente registrado");
        } catch (Exception e) {
            throw e;
        } finally {
            try {
                conexion.desconectar();
            } catch (Exception e) {
            }
        }
        System.out.println("Finaliza operación registrar");
    }
}
