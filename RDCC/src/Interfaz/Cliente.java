package Interfaz;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class Cliente extends javax.swing.JFrame {
    //Clase para acceder a la informacion de la tabla Cliente, Permite consultar y agregar
    Statement stmt = null;
    ResultSet rs = null;
    
    public Cliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TipoId = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        Apellido = new javax.swing.JTextField();
        Telefono = new javax.swing.JTextField();
        Direccion = new javax.swing.JTextField();
        BtCrear = new javax.swing.JButton();
        BtBuscar = new javax.swing.JButton();
        BtSalir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Correo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Tipo de Identificacion:");

        TipoId.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cedula", "Pasaporte", "T.I." }));

        jLabel2.setText("Identificacion:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Apellido:");

        jLabel5.setText("Direccion:");

        jLabel6.setText("Telefono:");

        BtCrear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtCrear.setText("Crear");
        BtCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCrearActionPerformed(evt);
            }
        });

        BtBuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtBuscar.setText("Buscar");
        BtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtBuscarActionPerformed(evt);
            }
        });

        BtSalir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtSalir.setText("Volver");
        BtSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSalirActionPerformed(evt);
            }
        });

        jLabel7.setText("Correo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ID))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nombre))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Apellido))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Telefono))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TipoId, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Direccion))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Correo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtCrear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtSalir)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TipoId)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ID)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtCrear)
                    .addComponent(BtBuscar)
                    .addComponent(BtSalir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSalirActionPerformed
        OpcionesAdmin opc = new OpcionesAdmin(); //Crea el interfaz menu
        opc.setVisible(true); //lo hace visible
        opc.setLocationRelativeTo(null); //Lo ubica en el centro de la pantalla
        this.dispose(); //Cierra este interfaz
    }//GEN-LAST:event_BtSalirActionPerformed

    private void BtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtBuscarActionPerformed
        try{
            stmt = Conexion.link.createStatement(); //Crea un nuevo Statement 
            rs = stmt.executeQuery(getQuery()); //Recibe un Query el cual depende de los datos llenados
            JTable table = new JTable(Conexion.buildTableModel(rs)); //Crea una tabla con el resultado de la busqueda
            Resultados resultado = new Resultados(table); //Crea la interfaz de resultados
            resultado.setLocationRelativeTo(null); //La ubica en el centro de la pantalla
        }
        catch(SQLException e){
            System.out.println(e.getMessage()); //Atrapa y muestra cualquier error
        }  
    }//GEN-LAST:event_BtBuscarActionPerformed

    private void BtCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCrearActionPerformed
        if(!(ID.getText().isEmpty())&&!(Nombre.getText().isEmpty())&&!(Apellido.getText().isEmpty())&&!(Telefono.getText().isEmpty())&&!(Correo.getText().isEmpty())&&!(Direccion.getText().isEmpty())){
            //Revisa que se hallan llenado todos los parametros del formulario
            try{
            stmt = Conexion.link.createStatement();
            rs = stmt.executeQuery(getQuery());
            if(!rs.isBeforeFirst()){ //Revisa que no exista un registro con esos datos
                try{
                stmt = Conexion.link.createStatement();
                stmt.executeUpdate("INSERT INTO `"
                        + "Cliente` (`ID`, `Tipo de Identificacion`, `Nombre`, `Apellido`, `Telefono`, `Correo`, `Direccion`)"
                        + "VALUES ('"+ID.getText()+"','"+String.valueOf(TipoId.getSelectedItem())+"','"+Nombre.getText()+"','"
                        + Apellido.getText()+"','"+ Telefono.getText() +"','"+Correo.getText()+"','"+Direccion.getText()+"')");
                JOptionPane.showMessageDialog(null, "Creacion exitosa");
                //Crea una nueva entrada en la tabla Cliente
                }
                catch(SQLException e){
                    System.out.println(e.getMessage()); //Atrapa y muestra cualquier error
                }
            } else { //En caso de que ya exista la entrada
                JOptionPane.showMessageDialog(null, "Este registro ya existe");
            }
        }
        catch(SQLException e){
            System.out.println(e.getMessage()); //Atrapa y muestra cualquier error
        } 
        } else{
            JOptionPane.showMessageDialog(null, "Se deben llenar todos los parametros"); 
            //En caso de que algun campo este vacio
        }
    }//GEN-LAST:event_BtCrearActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apellido;
    private javax.swing.JButton BtBuscar;
    private javax.swing.JButton BtCrear;
    private javax.swing.JButton BtSalir;
    private javax.swing.JTextField Correo;
    private javax.swing.JTextField Direccion;
    private javax.swing.JTextField ID;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField Telefono;
    private javax.swing.JComboBox TipoId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables

    private String getQuery() { //Metodo que revisa cada campo y edita el Query para incluir la restriccion
       String query = "SELECT * FROM `Cliente` WHERE `Tipo de Identificacion` = '" + String.valueOf(TipoId.getSelectedItem()) + "' "; 
       if(ID.getText().isEmpty() == false){ //El tipo de Id es olbigatorio entonces siempre se tiene esta condicion
           query += "AND `ID` = '" + ID.getText() + "' ";
       }
       if(Nombre.getText().isEmpty() == false){ //Si escribio un nombre:
           query += "AND `Nombre` = '" + Nombre.getText() + "' ";
       }
       if(Apellido.getText().isEmpty() == false){ //Si escribio un apellido:
           query += "AND `Apellido` = '" + Apellido.getText() + "' ";
       }
       if(Telefono.getText().isEmpty() == false){ //Si escribio un telefono:
           query += "AND `Telefono` = '" + Telefono.getText() + "' ";
       }
       if(Correo.getText().isEmpty() == false){ //Si escribio un correo:
           query += "AND `Correo` = '" + Correo.getText() + "' ";
       }
       if(Direccion.getText().isEmpty() == false){ //Si escribio una direccion:
           query += "AND `Direccion` = '" + Direccion.getText() + "' ";
       }
        System.out.println(query);
       return query;
    }
}
