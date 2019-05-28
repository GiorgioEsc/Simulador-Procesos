/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.awt.Canvas;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author estudiantes
 */
public class Vista extends javax.swing.JFrame {

    private Controlador control;
    private final Modelo modelo;
    
    public Vista(Modelo aThis) {
        modelo = aThis;
        initComponents();
        capturarEventos();
    }

    public Modelo getModelo() {
        return modelo;
    }

    public Controlador getControl() {
        if(control == null){
            control = new Controlador(this);
        }
        return control;
    }

    public JButton getBtnCerrar() {
        return btnComenzar;
    }

    public Canvas getLienzo() {
        return lienzo;
    }

    public JTextArea getjTextArea() {
        return jTextArea;
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lienzo = new java.awt.Canvas();
        btnComenzar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setForeground(java.awt.Color.black);
        getContentPane().setLayout(null);
        getContentPane().add(lienzo);
        lienzo.setBounds(280, 30, 530, 380);

        btnComenzar.setText("Comenzar");
        btnComenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComenzarActionPerformed(evt);
            }
        });
        getContentPane().add(btnComenzar);
        btnComenzar.setBounds(400, 420, 130, 30);

        jTextArea.setColumns(20);
        jTextArea.setRows(5);
        jScrollPane1.setViewportView(jTextArea);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 30, 240, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnComenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComenzarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnComenzarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComenzar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea;
    private java.awt.Canvas lienzo;
    // End of variables declaration//GEN-END:variables

    private void capturarEventos() {
        btnComenzar.addActionListener(getControl());
    }
}
