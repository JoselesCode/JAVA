package cl.duoc.verduapp.Models;

public class Producto {
    private int codigo;
    private String subcategoria;
    private String descripcion;
    private double precio; 
    private String medida;
    private double cantidad;
    
    public Producto(int codigo, String subcategoria, String descripcion, double precio, String medida, double cantidad) {
        this.codigo = codigo;
        this.subcategoria = subcategoria;
        this.descripcion = descripcion;
        this.precio = precio;
        this.medida = medida;
        this.cantidad = cantidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getSubcategoria() {
        return subcategoria;
    }

    public void setSubcategoria(String subcategoria) {
        this.subcategoria = subcategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    
}

