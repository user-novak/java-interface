/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz_usuario;

/**
 *
 * @author NOVAK
 */
public class Producto {
    private int cod;
    private int costo;
    private int cantidad;
    private String nombre;

    public Producto(int cod, int costo, int cantidad, String nombre) {
        this.cod = cod;
        this.costo = costo;
        this.cantidad = cantidad;
        this.nombre = nombre;
    }

     
    public Producto(int cod, int costo, String nombre) {
        this.cod = cod;
        this.costo = costo;
        this.nombre = nombre;
    }

    public Producto() {
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Producto{" + "cod=" + cod + ", costo=" + costo + ", cantidad=" + cantidad + ", nombre=" + nombre + '}';
    }
    
}
