/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaconexion;

/**
 *
 * @author josue
 */
public class Usuario {
    int num_usuario;
    String nombre;
    String apellido;
    String password;
    String correo;
    String fecha_nac;
    
    public Usuario(){
        num_usuario = 0;
        nombre = "";
        apellido = "";
        password = "";
        correo = "";
        fecha_nac = "";
    }

    public Usuario(int num_usuario, String nombre, String apellido, String password, String correo, String fecha_nac) {
        this.num_usuario = num_usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.password = password;
        this.correo = correo;
        this.fecha_nac = fecha_nac;
    }

    public int getNum_usuario() {
        return num_usuario;
    }

    public void setNum_usuario(int num_usuario) {
        this.num_usuario = num_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }
    
    
}
