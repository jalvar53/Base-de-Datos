package Interfaz;

import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FormularioRenta extends javax.swing.JFrame {
    private String placa;
    public FormularioRenta(String placa) {
        //Se inicializan los calendarios con una fecha especifica
        initComponents();
        this.placa = placa;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String Fecha = "2015-06-16";
        Date fecha;
        try {
            fecha = sdf.parse(Fecha);
            FRenta.setDate(fecha);
            FRetorno.setDate(fecha);
        } catch (ParseException ex) {
            Logger.getLogger(FormularioRenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        FRenta = new com.toedter.calendar.JDateChooser();
        FRetorno = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Identificacion = new javax.swing.JTextField();
        Nombre = new javax.swing.JTextField();
        Apellido = new javax.swing.JTextField();
        Telefono = new javax.swing.JTextField();
        Correo = new javax.swing.JTextField();
        Direccion = new javax.swing.JTextField();
        Buscar = new javax.swing.JButton();
        Rentar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        TipoId = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Formulario de Renta");

        jLabel2.setText("Fecha Renta:");

        jLabel3.setText("Fecha Retorno:");

        jLabel4.setText("Identificacion");

        jLabel5.setText("Tipo Identificacion");

        jLabel6.setText("Nombre");

        jLabel7.setText("Apellido");

        jLabel8.setText("Telefono");

        jLabel9.setText("Correo");

        jLabel10.setText("Direccion");

        Buscar.setText("Buscar cliente");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        Rentar.setText("Rentar");
        Rentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RentarActionPerformed(evt);
            }
        });

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        TipoId.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cedula", "Pasaporte", "T.I." }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Identificacion)
                                    .addComponent(Nombre)
                                    .addComponent(Apellido)
                                    .addComponent(Telefono)
                                    .addComponent(Correo)
                                    .addComponent(Direccion)
                                    .addComponent(TipoId, 0, 202, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(FRenta, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FRetorno, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Buscar))
                            .addComponent(Rentar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FRetorno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(FRenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TipoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(Correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Rentar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        //Se busca en la base de datos un usuario con identificacion y tipo de identificacion iguales a los dados
        //Se actualiza la informacion de los campos respecto al resultado
        if(!Identificacion.getText().equals("")){
            try{
                Statement stmt = Conexion.link.createStatement();
                String query = "SELECT Nombre, Apellido, Telefono, Correo, Direccion FROM `Cliente` WHERE `Tipo de Identificacion` = '" + String.valueOf(TipoId.getSelectedItem()) + "' " + "AND `ID` = '" + Identificacion.getText() + "' ";
                ResultSet rs = stmt.executeQuery(query);
                rs.next();
                Nombre.setText(rs.getString("Nombre"));
                Apellido.setText(rs.getString("Apellido"));
                Telefono.setText(rs.getString("Telefono"));
                Correo.setText(rs.getString("Correo"));
                Direccion.setText(rs.getString("Direccion"));
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Busqueda sin resultados");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese una identificacion para buscar");
        }
    }//GEN-LAST:event_BuscarActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        //Se cierra la ventana
        this.dispose();
    }//GEN-LAST:event_CancelarActionPerformed

    private void RentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RentarActionPerformed
        //Verifica que todos los datos esten dados
        //Verifica si es necesario crear un nuevo cliente en la base de datos o si este ya existe
        //Se crea un nuevo registro en la tabla renta, como historial
        //Se cambia el estado del auto 
        if(!Identificacion.getText().equals("") && !Nombre.getText().equals("") && !Apellido.getText().equals("") && !Telefono.getText().equals("") && !Correo.getText().equals("") && !Direccion.getText().equals("")){
            try{
                boolean a = true;
                Statement stmt = Conexion.link.createStatement();
                String query = "SELECT Nombre, Apellido, Telefono, Correo, Direccion FROM `Cliente` WHERE `Tipo de Identificacion` = '" + String.valueOf(TipoId.getSelectedItem()) + "' " + "AND `ID` = '" + Identificacion.getText() + "' ";
                ResultSet rs = stmt.executeQuery(query);
                if(!rs.next()){
                    String update = "Insert Into Cliente (ID, `Tipo de Identificacion`, Nombre, Apellido, Telefono, Correo, Direccion) Values ('" + Identificacion.getText() + "', '" + String.valueOf(TipoId.getSelectedItem()) + "', '" + Nombre.getText() + "', '" + Apellido.getText() + "', '" + Telefono.getText() + "', '" + Correo.getText() + "', '"+ Direccion.getText() + "')";
                    stmt.executeUpdate(update);
                }else{
                    if(!(Nombre.getText().equals(rs.getString("Nombre")) && Apellido.getText().equals(rs.getString("Apellido")) && Telefono.getText().equals(rs.getString("Telefono")) && Correo.getText().equals(rs.getString("Correo")) && Direccion.getText().equals(rs.getString("Direccion")))){
                        JOptionPane.showMessageDialog(null, "Datos diferentes a la base de datos");
                        a = false;
                    }
                }
                if(a){
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    String update = "INSERT INTO Renta (Placa, Identificacion, `Fecha Ini`, `Fecha Fin`)  VALUES ('" + this.placa + "', '" + Identificacion.getText() + "', '" + sdf.format(FRenta.getDate()) + "', '" + sdf.format(FRetorno.getDate())+ "')";
                    stmt.executeUpdate(update);
                    update = "UPDATE Auto SET Disponibilidad = 'false' WHERE Placa = '" + this.placa + "'";
                    stmt.executeUpdate(update);
                    JOptionPane.showMessageDialog(null, "Renta Correcta");
                    this.dispose();
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Datos no validos ");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese todos los datos");
        }
    }//GEN-LAST:event_RentarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apellido;
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Cancelar;
    private javax.swing.JTextField Correo;
    private javax.swing.JTextField Direccion;
    private com.toedter.calendar.JDateChooser FRenta;
    private com.toedter.calendar.JDateChooser FRetorno;
    private javax.swing.JTextField Identificacion;
    private javax.swing.JTextField Nombre;
    private javax.swing.JButton Rentar;
    private javax.swing.JTextField Telefono;
    private javax.swing.JComboBox TipoId;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
