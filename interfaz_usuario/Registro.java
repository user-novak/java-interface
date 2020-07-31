/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz_usuario;

import java.util.ArrayList;

/**
 *
 * @author NOVAK
 */
public class Registro {

    private Usuario usuario;
    private ArrayList<Producto> lista_productos;
    private int total;
    private int cod_registro;

    public Registro() {
        usuario = new Usuario();
        lista_productos = new ArrayList<>();
    }

    public Registro(int total, int cod_registro) {
        this.total = total;
        this.cod_registro = cod_registro;
    }

    public Registro(int total) {
        this.total = total;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public ArrayList<Producto> getLista_productos() {
        return lista_productos;
    }

    public void setLista_productos(ArrayList<Producto> lista_productos) {
        this.lista_productos = lista_productos;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getCod_registro() {
        return cod_registro;
    }

    public void setCod_registro(int cod_registro) {
        this.cod_registro = cod_registro;
    }

    public String boleta() {
        String boleta = "";
        boleta += "registro: " + getCod_registro() + "\n" + usuario.toString() + "\n";
        boleta += "Productos:\n ";
        for (Producto e : lista_productos) {
            boleta += e.toString() + "\n";
        }
        boleta += "total: " + total;
        return boleta;
    }

}
