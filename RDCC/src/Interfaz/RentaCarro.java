package Interfaz;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class RentaCarro extends javax.swing.JFrame {

    public RentaCarro() {
        initComponents();
        try {
            Statement cmd = Conexion.link.createStatement();
            ResultSet rs = cmd.executeQuery("SELECT DISTINCT Marca FROM Auto");
            while (rs.next()){
                String marcaAux = rs.getString("Marca");
                Marca.addItem(marcaAux);
            }
            Marca.addItem("Otro");
            Marca.setSelectedItem("Otro");
            Otro.setEditable(true);
            Otro.setText("");
            Modelo.addItem("Otro");
            Modelo.setSelectedItem("Otro");
            OtroM.setEditable(true);
            Costo.setEditable(true);
            rs = cmd.executeQuery("SELECT DISTINCT IdSede FROM Sede");
            while (rs.next()){
                String sedeAux = rs.getString("IdSede");
                Ubicacion.addItem(sedeAux);
            }
        } catch (SQLException ex) {
            System.out.println("Error en query " + ex.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Agregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Placa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Marca = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        Otro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Modelo = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        OtroM = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Ano = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Ubicacion = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        Costo = new javax.swing.JTextField();
        Cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        jLabel1.setText("Placa:");

        jLabel2.setText("Marca:");

        Marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarcaActionPerformed(evt);
            }
        });

        jLabel3.setText("Cual:");

        jLabel4.setText("Modelo:");

        Modelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModeloActionPerformed(evt);
            }
        });

        jLabel5.setText("Cual:");

        jLabel6.setText("Año:");

        jLabel7.setText("Sede:");

        jLabel8.setText("Costo:");

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(Placa, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Marca, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(Otro, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(OtroM, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(Ano, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addComponent(Ubicacion, 0, 40, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Costo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Cancelar)
                                .addGap(18, 18, 18)
                                .addComponent(Agregar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Otro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OtroM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Agregar)
                    .addComponent(Cancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        String PlacaS;
        String MarcaS;
        String ModeloS;
        String AnoS;
        String IdSede;
        Boolean insC = false;
        try{
        if(Placa.getText().equals("")){
            throw new Exception("Placa no ingresada");
        }
        PlacaS = "'" + Placa.getText() + "'";
        if(Marca.getSelectedItem().equals("Otro")){
            if(!Otro.getText().equals("")){
                MarcaS = "'" + Otro.getText() + "'";
            }else{
                throw new Exception("Marca no ingresada");
            }
        }else{
            MarcaS = "'" + Marca.getSelectedItem() + "'";
        }
        try{
            if(Modelo.getSelectedItem().equals("Otro")){
                if(!OtroM.getText().equals("")){
                    ModeloS = "'" + OtroM.getText()+ "'";
                }else{
                    throw new Exception("Modelo no ingresado");
                }
            }else{
                ModeloS ="'"+  Modelo.getSelectedItem()+ "'";
            }
        }catch(java.lang.NullPointerException npe){
            throw new Exception("Modelo no ingresado");
        }
        try{
            IdSede = Ubicacion.getSelectedItem().toString();
        }catch(Exception e){
            throw new Exception("Escoja una ubicacion");
        }
        if(!Ano.getText().equals("")){ 
            AnoS = Ano.getText();
        }else{
            throw new Exception("Ingrese un año");
        }
        try{
            if(!Costo.getText().equals("")){
                try{
                    Statement actCost = Conexion.link.createStatement();
                    String query ="Insert Into Costo (Marca, Modelo, Año, CostoPorDia) Values (" + MarcaS + ", " + ModeloS + ", " + AnoS + ", " + Costo.getText() + ")";
                    actCost.executeUpdate(query);
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Ya se tiene un costo a esta referencia. Se continuara con el precio de la base de datos");
                }
            }
        }catch(java.lang.NullPointerException npe){
        }
        String query = "Insert Into Auto (Placa, Marca, Modelo, Año, IdSede, Disponibilidad) Values (" + PlacaS + ", " + MarcaS + ", " + ModeloS + ", " + AnoS + ", " + IdSede + ", " + "\"true\"" + ")";
        try{
            Statement cmd = Conexion.link.createStatement();
            cmd.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Operacion realizada con exito");
            RentaCarro carro = new RentaCarro();
            carro.setVisible(true);
            carro.setLocationRelativeTo(null);
            this.dispose();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en los datos suministrados, imposible realizar la operacion");
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en los datos dados");
        }
    }//GEN-LAST:event_AgregarActionPerformed

    private void MarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarcaActionPerformed
        String seleccion = Marca.getSelectedItem().toString();
        Modelo.removeAllItems();
        if(seleccion.equals("Otro")){
            Otro.setEditable(true);
            Modelo.addItem("Otro");
            Modelo.setSelectedItem("Otro");
        }else{
            try {
                Modelo.removeAllItems();
                Statement cmd = Conexion.link.createStatement();
                ResultSet rs = cmd.executeQuery("SELECT DISTINCT Modelo FROM Auto WHERE Marca = \"" + seleccion + "\"");
                while (rs.next()){
                    String marcaAux = rs.getString("Modelo");
                    Modelo.addItem(marcaAux);
                }
                Modelo.addItem("Otro");
                Modelo.setSelectedItem("Otro");
                OtroM.setEditable(true);
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

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        MenuCarro carro = new MenuCarro();
        carro.setVisible(true);
        carro.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_CancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JTextField Ano;
    private javax.swing.JButton Cancelar;
    private javax.swing.JTextField Costo;
    private javax.swing.JComboBox Marca;
    private javax.swing.JComboBox Modelo;
    private javax.swing.JTextField Otro;
    private javax.swing.JTextField OtroM;
    private javax.swing.JTextField Placa;
    private javax.swing.JComboBox Ubicacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
