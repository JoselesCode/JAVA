package cl.duoc.verduapp.Models;

public class Persona {
    private int run;
    private String dv;
    private String nombre;
    private String mail; 
    private String direccion;
    private int telefono;
    
    public Persona( int run,String dv,String nombre,String mail,String direccion,int telefono){
        this.run = run;
        this.dv = dv;
        this.nombre = nombre;
        this.mail = mail;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public String getDv() {
        return dv;
    }

    public void setDv(String dv) {
        this.dv = dv;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    
    
    
    
    
}
