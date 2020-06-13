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
public class Usuario {

    private int cod;
    private String name;
    private String cargo;

    public Usuario(int cod, String name, String cargo) {
        this.cod = cod;
        this.name = name;
        this.cargo = cargo;
    }

    public Usuario() {
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}
