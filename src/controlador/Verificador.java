package controlador;

import BaseDatos.conexion;
import java.sql.ResultSet;
import modelo.Cliente;
import util.Validador;

public class Verificador {

    public void verificarCliente(Cliente p) throws Exception {
        try {
            Validador.validarDni(p.getDni());
            conexion.conectar();
            String sql = "SELECT dni FROM CLIENTE WHERE dni LIKE '" + p.getDni() + "'";
            ResultSet resultado = conexion.consultar(sql);
            if (resultado.next()) {
                throw new Exception("El Cliente ya se encuentra registrado, corregir dni!");
            }
        } catch (Exception e) {
            throw e;
        } finally {
            try {
                conexion.desconectar();
            } catch (Exception e) {
            }
        }
    }
}