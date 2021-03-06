package Interfaz;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JTable;

//Clase para la interfaz gráfica y el manejo de las Sedes en la base de datos.
public class Sede extends javax.swing.JFrame {

    Statement stmt = null;
    String query = "";
    ResultSet rs = null;
    
    public Sede() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    
    //Método que hace la búsqueda de la Sede específicada en los campos.
    public String getQuery(){
        //Se va concatenando al String la sintaxis SQL para pasar los parametros especificados.
        query = "SELECT * FROM Sede WHERE ";
        if(!IdSedeTxtField.getText().isEmpty()){
            query = query + "`IdSede` = " + "'" + IdSedeTxtField.getText() + "'" + " AND ";
        }
        if(!DireccionTxtField.getText().isEmpty()){
            query = query + "`Direccion` = " + "'" + DireccionTxtField.getText() + "'" + " AND ";
        }
        if(!TelefonoTxtField.getText().isEmpty()){
            query = query + "`Telefono` = " + "'" + TelefonoTxtField.getText() + "'" + " AND ";
        }
        //Se eliminan el "AND" o el "WHERE" sobrante al final, dependiendo de los campos llenados.
        if(!IdSedeTxtField.getText().isEmpty() || !DireccionTxtField.getText().isEmpty() || !TelefonoTxtField.getText().isEmpty()){
            query = query.substring(0, query.length()-4);
        }
        else{
            query = query.substring(0, query.length()-5);
        }
        return query;
    }      
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        IdSedeTxtField = new javax.swing.JTextField();
        DireccionTxtField = new javax.swing.JTextField();
        TelefonoTxtField = new javax.swing.JTextField();
        BtBuscar = new javax.swing.JButton();
        BtSalir = new javax.swing.JButton();
        BtCrear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID Sede:");

        jLabel2.setText("Dirección:");

        jLabel3.setText("Teléfono:");

        BtBuscar.setText("Buscar");
        BtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtBuscarActionPerformed(evt);
            }
        });

        BtSalir.setText("Salir");
        BtSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSalirActionPerformed(evt);
            }
        });

        BtCrear.setText("Crear");
        BtCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCrearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DireccionTxtField)
                            .addComponent(IdSedeTxtField)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TelefonoTxtField))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtCrear)
                        .addGap(18, 18, 18)
                        .addComponent(BtBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(BtSalir)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(IdSedeTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(DireccionTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TelefonoTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtBuscar)
                    .addComponent(BtSalir)
                    .addComponent(BtCrear))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Botón usado para salir del menú de Sedes y volver al menú de opciones.
    private void BtSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSalirActionPerformed
        OpcionesAdmin opc = new OpcionesAdmin();
        opc.setVisible(true);
        opc.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BtSalirActionPerformed

    //Botón para efectuar la búsqueda con los datos especificados,
    //Genera la tabla resultado de la búsqueda y la muestra en una ventana.
    private void BtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtBuscarActionPerformed
        try{
            stmt = Conexion.link.createStatement(); //Crea un Statement SQL
            rs = stmt.executeQuery(getQuery()); //Ejecuta el Statement con la consulta respectiva
            JTable table = new JTable(Conexion.buildTableModel(rs)); //Crea una tabla y le pasa como parametro el resultado de la búsqueda
            Resultados resultado;
            resultado = new Resultados(table);
            resultado.setLocationRelativeTo(null);
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }       
      
    }//GEN-LAST:event_BtBuscarActionPerformed

    //Botón para crear un nuevo registro de una nueva Sede en la base de datos.
    private void BtCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCrearActionPerformed
        try{            
            //Solo se crea el nuevo registro si el IdSede esta vacío y Telefono y Direccion estan llenos.
            if(IdSedeTxtField.getText().isEmpty() && !DireccionTxtField.getText().isEmpty() && !TelefonoTxtField.getText().isEmpty()){
            stmt = Conexion.link.createStatement();
            rs = stmt.executeQuery("SELECT * FROM Sede WHERE Direccion = "+ "'" + DireccionTxtField.getText() + "'" + " AND "+ "Telefono = " + "'" + TelefonoTxtField.getText() + "'");
                if(!rs.next()){
                    stmt.executeUpdate("INSERT INTO Sede (Direccion, Telefono) VALUES (" + "'" + DireccionTxtField.getText() + "'" + ", " + "'" + TelefonoTxtField.getText() + "'" + ")");
                    showMessageDialog(null, "Creación de registro exitosa");
                }
                else{
                    showMessageDialog(null, "Esta sede ya existe");
                }
            }
            else{
                showMessageDialog(null, "Datos incorrectos para crear un nuevo registro");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_BtCrearActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtBuscar;
    private javax.swing.JButton BtCrear;
    private javax.swing.JButton BtSalir;
    private javax.swing.JTextField DireccionTxtField;
    private javax.swing.JTextField IdSedeTxtField;
    private javax.swing.JTextField TelefonoTxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

}
