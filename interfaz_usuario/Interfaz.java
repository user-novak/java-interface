/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz_usuario;

import java.util.*;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.*;

/**
 *
 * @author NOVAK
 */
public class Interfaz extends javax.swing.JFrame {

    fondoPanel fondo = new fondoPanel();
    public static ArrayList<Usuario> lista_usuarios = new ArrayList<>();
    public static ArrayList<Producto>lista_productos = new ArrayList<>();
    public static String tipo_usuario;

    public Interfaz() {
        this.setContentPane(fondo);
        initComponents();
        this.setTitle("Interfaz de usuario");
        tipo_usuario=asignamiento_usario();
        comprobacion();
        btn_salida.setIcon(setIcono("/imagenes/btn_salida.png", btn_salida));
        btn_salida.setPressedIcon(setEfecto_presionado("/imagenes/btn_salida.png", btn_salida, 10, 10));
        setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_salida = new javax.swing.JButton();
        btn_agre = new javax.swing.JButton();
        btn_mos = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salidaActionPerformed(evt);
            }
        });

        btn_agre.setBackground(new java.awt.Color(102, 102, 255));
        btn_agre.setFont(new java.awt.Font("Impact", 1, 14)); // NOI18N
        btn_agre.setText("agregar");
        btn_agre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agreActionPerformed(evt);
            }
        });

        btn_mos.setBackground(new java.awt.Color(102, 102, 255));
        btn_mos.setFont(new java.awt.Font("Impact", 1, 14)); // NOI18N
        btn_mos.setText("mostrar");
        btn_mos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mosActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setFont(new java.awt.Font("Impact", 1, 14)); // NOI18N
        jButton1.setText("vender");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("registros");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_salida, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_mos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_agre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_agre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(btn_mos, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addComponent(btn_salida, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salidaActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_salidaActionPerformed

    private void btn_agreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agreActionPerformed
        dialog_usuario d1 = new dialog_usuario(this, true);
        d1.setLocationRelativeTo(null);
        d1.setVisible(true);
    }//GEN-LAST:event_btn_agreActionPerformed

    private void btn_mosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mosActionPerformed
        dialog_mostrar d1 = new dialog_mostrar(this, false);
        d1.setLocationRelativeTo(null);
        d1.setVisible(true);
    }//GEN-LAST:event_btn_mosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       dialog_vender d1 = new dialog_vender(this, false);
       d1.setLocationRelativeTo(null);
       d1.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    class fondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/imagenes/fondo_principal.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }

    public Icon setIcono(String url, JButton boton) {
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        int ancho = boton.getWidth();
        int alto = boton.getHeight();
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        return icono;
    }

    public Icon seticonlabel(String url, JLabel label) {
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        int ancho = label.getWidth();
        int alto = label.getHeight();
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        return icono;
    }

    public Icon setEfecto_presionado(String url, JButton boton, int ancho, int alto) {
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        int an = boton.getWidth() - ancho;
        int al = boton.getHeight() - alto;
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(an, al, Image.SCALE_DEFAULT));
        return icono;
    }

    public String asignamiento_usario() {
        do {
            String t = JOptionPane.showInputDialog("ingrese su tipo de usuario");
            if (t.equals("administrador")) {
                return t;
            } else if (t.equals("empleado")) {
                return t;
            } else {
                JOptionPane.showMessageDialog(null, "Error, ingrese de nuevo");
            }
        } while (true);
    }
    public void comprobacion(){
        if(tipo_usuario.equals("empleado")){
            btn_agre.setVisible(false);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agre;
    private javax.swing.JButton btn_mos;
    private javax.swing.JButton btn_salida;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}
