
package modelo;

public class Cliente {
    
    private String dni;
    private String apellidos;
    private String nombres;

    public Cliente(){
        this.dni="";
        this.apellidos="";
        this.nombres="";
    }
    
    public Cliente(String d, String a, String n){
        this.dni=d;
        this.apellidos=a;
        this.nombres=n;
    }
    
    public String getDni() {
        return dni;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
}
