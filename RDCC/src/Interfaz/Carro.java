package Interfaz;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Carro extends javax.swing.JFrame {
    
    public Carro() {
        initComponents();
        
        try {
            Statement cmd = Conexion.link.createStatement();
            ResultSet rs = cmd.executeQuery("SELECT DISTINCT Marca FROM Auto");
            while (rs.next()){
                String marcaAux = rs.getString("Marca");
                Marca.addItem(marcaAux);
            }
            Marca.addItem("Otro");
            Marca.addItem("--Seleccione--");
            Marca.setSelectedItem("--Seleccione--");
            Otro.setEditable(false);
            Otro.setText("");
            rs = cmd.executeQuery("SELECT DISTINCT IdSede FROM Sede");
            while (rs.next()){
                String sedeAux = rs.getString("IdSede");
                Ubicacion.addItem(sedeAux);
            }
            Ubicacion.addItem("--Seleccione--");
            Ubicacion.setSelectedItem("--Seleccione--");
        } catch (SQLException ex) {
            System.out.println("Error en query " + ex.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Modelo = new javax.swing.JComboBox();
        Placa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Desde = new javax.swing.JTextField();
        Hasta = new javax.swing.JTextField();
        Ubicacion = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        BtSalir = new javax.swing.JButton();
        BtBuscar = new javax.swing.JButton();
        BtAgregar = new javax.swing.JButton();
        Marca = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        Otro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        OtroM = new javax.swing.JTextField();

        setResizable(false);

        Modelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModeloActionPerformed(evt);
            }
        });

        Placa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlacaActionPerformed(evt);
            }
        });

        jLabel1.setText("Placa:");

        jLabel2.setText("Marca:");

        jLabel3.setText("Modelo:");

        jLabel4.setText("Año:");

        jLabel5.setText("Desde:");

        jLabel6.setText("Hasta:");

        Hasta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HastaActionPerformed(evt);
            }
        });

        jLabel7.setText("Ubicación:");

        jCheckBox1.setText("Sólo mostrar autos disponibles");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        BtSalir.setText("Salir");
        BtSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSalirActionPerformed(evt);
            }
        });

        BtBuscar.setText("Buscar");
        BtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtBuscarActionPerformed(evt);
            }
        });

        BtAgregar.setText("Agregar");
        BtAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAgregarActionPerformed(evt);
            }
        });

        Marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarcaActionPerformed(evt);
            }
        });

        jLabel8.setText("Cual");

        Otro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OtroActionPerformed(evt);
            }
        });

        jLabel9.setText("Cual");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtAgregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtBuscar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Placa, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Marca, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(143, 143, 143)
                                        .addComponent(jLabel2))
                                    .addComponent(jLabel1))
                                .addGap(85, 85, 85)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Otro, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(Ubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(BtSalir))
                            .addComponent(OtroM)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Desde, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Hasta, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3)
                        .addComponent(jLabel9)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Modelo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Otro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(OtroM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(Hasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Desde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtAgregar)
                    .addComponent(BtBuscar)
                    .addComponent(BtSalir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PlacaActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void BtSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSalirActionPerformed
        OpcionesAdmin opc = new OpcionesAdmin();
        opc.setVisible(true);
        opc.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BtSalirActionPerformed

    private void BtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtBuscarActionPerformed
        String query = "SELECT * FROM Auto WHERE";
        if(!"".equals(Placa.getText())){
            query += " Placa = \"" + Placa.getText() + "\" AND ";
        }
        if(!Marca.getSelectedItem().equals("--Seleccione--")){
            if(Marca.getSelectedItem().equals("Otro")){
                if(!Otro.getText().equals("")){
                    query += " Marca = \"" + Otro.getText() + "\" AND ";
                }
            }else{
                query += " Marca = \"" + Marca.getSelectedItem() + "\" AND ";
            }
        }
        try{
            if(!Modelo.getSelectedItem().equals("--Seleccione--")){
                if(Modelo.getSelectedItem().equals("Otro")){
                    if(!OtroM.getText().equals("")){
                        query += " Modelo = \"" + OtroM.getText() + "\" AND ";
                    }
                }else{
                    query += " Modelo = \"" + Modelo.getSelectedItem() + "\" AND ";
                }
            }
        }catch(java.lang.NullPointerException npe){
        }
        if(!Desde.getText().equals("")){
            query += " Año >= " + Desde.getText() + " AND ";
        }
        if(!Hasta.getText().equals("")){
            query += " Año <= " + Hasta.getText() + " AND ";
        }
        if(!Ubicacion.getSelectedItem().equals("--Seleccione--")){
            query += " IdSede = " + Ubicacion.getSelectedItem() + " AND ";
        }
        if (query.substring(query.length() - 2).equals("D ")){
            query = query.substring(0, query.length() - 5);
        }else{
            query = query.substring(0, query.length() - 6);
        }
        try{
            Statement cmd = Conexion.link.createStatement();
            ResultSet rs = cmd.executeQuery(query);
            DefaultTableModel table = Conexion.buildTableModel(rs);
            JTable tabla = new JTable(table);
            JOptionPane.showMessageDialog(null, new JScrollPane(tabla));
        }catch(Exception e){
            System.out.println(query);
            System.out.println(e.getMessage());
        }
        
        
    }//GEN-LAST:event_BtBuscarActionPerformed

    private void BtAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAgregarActionPerformed
        String PlacaS;
        String MarcaS;
        String ModeloS;
        String AnoS;
        String IdSede;
        try{
        if(!"".equals(Placa.getText())){
            throw new Exception();
        }
        PlacaS = "\"" + Placa.getText() + "\"";
        if(!Marca.getSelectedItem().equals("--Seleccione--")){
            if(Marca.getSelectedItem().equals("Otro")){
                if(!Otro.getText().equals("")){
                    MarcaS = "\"" + Otro.getText() + "\"";
                }else{
                    throw new Exception();
                }
            }else{
                MarcaS = "\"" + Otro.getText() + "\"";
            }
        }else{
            throw new Exception();
        }
        try{
            if(!Modelo.getSelectedItem().equals("--Seleccione--")){
                if(Modelo.getSelectedItem().equals("Otro")){
                    if(!OtroM.getText().equals("")){
                        ModeloS = "\"" + OtroM.getText()+ "\"";
                    }else{
                        throw new Exception();
                    }
                }else{
                    ModeloS ="\""+  OtroM.getText()+ "\"";
                }
            }else{
                throw new Exception();
            }
        }catch(java.lang.NullPointerException npe){
            throw new Exception();
        }
        if(!Desde.getText().equals(Hasta.getText().equals(""))){
            throw new Exception();
        }
        AnoS = Desde.getText().toString();
        if(!Ubicacion.getSelectedItem().equals("--Seleccione--")){
            IdSede = Ubicacion.getSelectedItem().toString();
        }else{
            throw new Exception();
        }
        String query = "Insert Into Auto (Placa, Marca, Modelo, Año, IdSede) Values (" + PlacaS + ", " + MarcaS + ", " + ModeloS + ", " + AnoS + ", " + IdSede;
        try{
            Statement cmd = Conexion.link.createStatement();
            ResultSet rs = cmd.executeQuery(query);
            DefaultTableModel table = Conexion.buildTableModel(rs);
            JTable tabla = new JTable(table);
            JOptionPane.showMessageDialog(null, new JScrollPane(tabla));
        }catch(Exception e){
            System.out.println(query);
            System.out.println(e.getMessage());
        }
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_BtAgregarActionPerformed

    private void MarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarcaActionPerformed
        String seleccion = Marca.getSelectedItem().toString();
        Modelo.removeAllItems();
        if(seleccion.equals("Otro")){
            Otro.setEditable(true);
            Modelo.addItem("Otro");
            Modelo.addItem("--Seleccione--");
            Modelo.setSelectedItem("--Seleccione--");
        }else if(seleccion.equals("--Seleccione--")){
            Modelo.removeAllItems();
            Otro.setText("");
        }else{
            try {
                Statement cmd = Conexion.link.createStatement();
                ResultSet rs = cmd.executeQuery("SELECT DISTINCT Modelo FROM Auto WHERE Marca = \"" + seleccion + "\"");
                while (rs.next()){
                    String marcaAux = rs.getString("Modelo");
                    Modelo.addItem(marcaAux);
                }
                Modelo.addItem("Otro");
                Modelo.addItem("--Seleccione--");
                Modelo.setSelectedItem("--Seleccione--");
                Otro.setEditable(false);
                Otro.setText("");
            } catch (SQLException ex) {
                System.out.println("Error en query " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_MarcaActionPerformed

    private void ModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModeloActionPerformed
        try{
            String seleccion = Modelo.getSelectedItem().toString();
            if(seleccion.equals("Otro")){
                OtroM.setEditable(true);
            }else{
                OtroM.setEditable(false);
                OtroM.setText("");
            }
        }catch(java.lang.NullPointerException npe){
            OtroM.setEditable(false);
            OtroM.setText("");
        }
    }//GEN-LAST:event_ModeloActionPerformed

    private void OtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OtroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OtroActionPerformed

    private void HastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HastaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HastaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtAgregar;
    private javax.swing.JButton BtBuscar;
    private javax.swing.JButton BtSalir;
    private javax.swing.JTextField Desde;
    private javax.swing.JTextField Hasta;
    private javax.swing.JComboBox Marca;
    private javax.swing.JComboBox Modelo;
    private javax.swing.JTextField Otro;
    private javax.swing.JTextField OtroM;
    private javax.swing.JTextField Placa;
    private javax.swing.JComboBox Ubicacion;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
