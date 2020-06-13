/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz_usuario;

import java.util.*;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author NOVAK
 */
public class Interfaz extends javax.swing.JFrame {

    fondoPanel fondo = new fondoPanel();
    public static ArrayList<Usuario> lista_usuarios = new ArrayList<>();

    public Interfaz() {
        this.setContentPane(fondo);
        initComponents();
        this.setTitle("Interfaz de usuario");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(btn_agre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(btn_mos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_salida, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(185, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_agre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_mos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agre;
    private javax.swing.JButton btn_mos;
    private javax.swing.JButton btn_salida;
    // End of variables declaration//GEN-END:variables
}
