
package Clases;


public class Usuario {
    
    private int id;
    private int rut;
    private char dv;
    private String nombre;
    private int telefono;
    private int contrasena;

    public Usuario() {
    }

    public Usuario(int id, int rut, char dv, String nombre, int telefono, int contrasena) {
        this.id = id;
        this.rut = rut;
        this.dv = dv;
        this.nombre = nombre;
        this.telefono = telefono;
        this.contrasena = contrasena;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public char getDv() {
        return dv;
    }

    public void setDv(char dv) {
        this.dv = dv;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getContrasena() {
        return contrasena;
    }

    public void setContrasena(int contrasena) {
        this.contrasena = contrasena;
    }
    
    
}
