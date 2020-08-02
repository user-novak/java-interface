/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz_usuario;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author NOVAK
 */
public class Archivos {

    public void imprimirBoletas(Registro r) {
        try {
            File f = new File("registroBoletas.txt");
            FileWriter fw;
            BufferedWriter bw;
            if (f.exists()) {
                fw = new FileWriter(f, true);
                bw = new BufferedWriter(fw);
                bw.newLine();
                bw.write(r.boleta());
            } else {
                fw = new FileWriter(f);
                bw = new BufferedWriter(fw);
                bw.write(r.boleta());
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No ha sido archivada la boleta");
        }
    }

    public void imprimirUsuarios(Usuario u) {
        try {
            File f = new File("registroUsuarios.txt");
            FileWriter fw;
            BufferedWriter bw;
            if (f.exists()) {
                fw = new FileWriter(f, true);
                bw = new BufferedWriter(fw);
                bw.newLine();
                bw.write(u.getCod() + "," + u.getName() + "," + u.getCargo());
            } else {
                fw = new FileWriter(f, true);
                bw = new BufferedWriter(fw);
                bw.write(u.getCod() + "," + u.getName() + "," + u.getCargo());
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No ha sido archivado el usuario");
        }
    }

    public void imprimirProductos(Producto p) {
        try {
            File f = new File("registroProductos.txt");
            FileWriter fw;
            BufferedWriter bw;
            if (f.exists()) {
                fw = new FileWriter(f, true);
                bw = new BufferedWriter(fw);
                bw.newLine();
                bw.write(p.getCod() + "," + p.getCod() + "," + p.getCantidad() + "," + p.getNombre());
            } else {
                fw = new FileWriter(f, true);
                bw = new BufferedWriter(fw);
                bw.write(p.getCod() + "," + p.getNombre() + "," + p.getCosto() + "," + p.getCantidad());
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No ha sido archivado el producto");
        }
    }

    public void imprimirRegistros(Registro registro) {
        try {
            File f = new File("registroRegistros.txt");
            FileWriter fw;
            BufferedWriter bw;
            if (f.exists()) {
                fw = new FileWriter(f, true);
                bw = new BufferedWriter(fw);
                bw.newLine();
                bw.write(registro.getCod_registro() + "," + registro.getTotal());
            } else {
                fw = new FileWriter(f, true);
                bw = new BufferedWriter(fw);
                bw.write(registro.getCod_registro() + "," + registro.getTotal());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No ha sido archivado el registro");
        }
    }

    public void leerUsuario() {
        try {
            File f = new File("registroUsuarios.txt");
            if (f.exists()) {
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String split;
                while ((split = br.readLine()) != null) {
                    String[] pos = split.split(",");
                    Usuario u = new Usuario(Integer.parseInt(pos[0]), pos[1], pos[2]);
                    Interfaz.lista_usuarios.add(u);
                }
            }
        } catch (Exception e) {

        }
    }

    public void leerProducto() {
        try {
            File f = new File("registroProductos.txt");
            if (f.exists()) {
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String split;
                while ((split = br.readLine()) != null) {
                    String[] pos = split.split(",");
                    Producto p = new Producto(Integer.parseInt(pos[0]), Integer.parseInt(pos[1]), Integer.parseInt(pos[2]), pos[3]);
                    Interfaz.lista_productos.add(p);
                }
            }
        } catch (Exception e) {
        }
    }

    public void leerRegistros() {
        try {
            File f = new File("registroRegistros.txt");
            if (f.exists()) {
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String split;
                while ((split = br.readLine()) != null) {
                    String[] pos = split.split(",");
                    Registro r = new Registro(Integer.parseInt(pos[1]), Integer.parseInt(pos[0]));
                    Interfaz.lista_registros.add(r);
                }
            } else {

            }
        } catch (Exception e) {
        }
    }
}
