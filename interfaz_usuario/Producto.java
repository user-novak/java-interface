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
    private String nombre;

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
    
}
