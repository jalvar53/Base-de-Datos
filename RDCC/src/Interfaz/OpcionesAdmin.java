package Interfaz;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OpcionesAdmin extends javax.swing.JFrame {

    public OpcionesAdmin() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    
    public void ActualizarCarros(){
        try{
            String update = "UPDATE Auto SET Disponibilidad = 'true'";
            String actualizar = "UPDATE Auto, (SELECT Auto.Placa FROM Auto, Renta WHERE Renta.`Fecha Fin` > CURRENT_DATE() AND Renta.Placa = Auto.Placa) AS A SET Auto.Disponibilidad = 'false' WHERE Auto.Placa = A.Placa;";
            Statement stmt = Conexion.link.createStatement();
            stmt.executeUpdate(update);
            stmt.executeUpdate(actualizar);
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtCarros = new javax.swing.JButton();
        BtSedes = new javax.swing.JButton();
        BtClientes = new javax.swing.JButton();
        BtSalir = new javax.swing.JButton();
        BtRenta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        BtCarros.setText("Carros");
        BtCarros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCarrosActionPerformed(evt);
            }
        });

        BtSedes.setText("Sedes");
        BtSedes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSedesActionPerformed(evt);
            }
        });

        BtClientes.setText("Clientes");
        BtClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtClientesActionPerformed(evt);
            }
        });

        BtSalir.setText("Salir");
        BtSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSalirActionPerformed(evt);
            }
        });

        BtRenta.setText("Historial");
        BtRenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtRentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(BtSedes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtCarros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtRenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtCarros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtSedes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtClientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtRenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtCarrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCarrosActionPerformed
        MenuCarro carro = new MenuCarro();
        carro.setVisible(true);
        carro.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BtCarrosActionPerformed

    private void BtSedesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSedesActionPerformed
        Sede sede = new Sede();
        sede.setVisible(true);
        sede.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BtSedesActionPerformed

    private void BtClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtClientesActionPerformed
        Cliente cliente = new Cliente();
        cliente.setVisible(true);
        cliente.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BtClientesActionPerformed

    private void BtSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSalirActionPerformed
        Login login = new Login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BtSalirActionPerformed

    private void BtRentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtRentaActionPerformed
        Historial renta = new Historial();
        renta.setVisible(true);
        renta.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BtRentaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtCarros;
    private javax.swing.JButton BtClientes;
    private javax.swing.JButton BtRenta;
    private javax.swing.JButton BtSalir;
    private javax.swing.JButton BtSedes;
    // End of variables declaration//GEN-END:variables
}
