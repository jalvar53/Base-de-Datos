package Interfaz;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Sede extends javax.swing.JFrame {

    Statement stmt = null;
    String query = "";
    ResultSet rs = null;
    
    public Sede() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    
    public String getQuery(){
        query = "SELECT * FROM Sede WHERE";
        if(!IdSedeTxtField.getText().isEmpty()){
            query = query + "IdSede = " + "'" + IdSedeTxtField.getText() + "'" + " AND";
        }
        if(!DireccionTxtField.getText().isEmpty()){
            query = query + "Direccion = " + "'" + DireccionTxtField.getText() + "'" + " AND";
        }
        if(!TelefonoTxtField.getText().isEmpty()){
            query = query + "Telefono = " + "'" + TelefonoTxtField.getText() + "'" + " AND";
        }
        if(!IdSedeTxtField.getText().isEmpty() || !DireccionTxtField.getText().isEmpty() || !TelefonoTxtField.getText().isEmpty()){
            query = query.substring(0, query.length()-3);
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

    private void BtSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSalirActionPerformed
        OpcionesAdmin opc = new OpcionesAdmin();
        opc.setVisible(true);
        opc.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BtSalirActionPerformed

    private void BtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtBuscarActionPerformed
        try{
            stmt = Conexion.link.createStatement();
            rs = stmt.executeQuery(getQuery());
            JTable table = new JTable(buildTableModel(rs));
            JOptionPane.showMessageDialog(null, new JScrollPane(table));
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }       
      
    }//GEN-LAST:event_BtBuscarActionPerformed

    private void BtCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCrearActionPerformed
        try{            
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

    private TableModel buildTableModel(ResultSet rs) throws SQLException {

    ResultSetMetaData metaData = rs.getMetaData();

    // names of columns
    Vector<String> columnNames = new Vector<String>();
    int columnCount = metaData.getColumnCount();
    for (int column = 1; column <= columnCount; column++) {
        columnNames.add(metaData.getColumnName(column));
    }

    // data of the table
    Vector<Vector<Object>> data = new Vector<Vector<Object>>();
    while (rs.next()) {
        Vector<Object> vector = new Vector<Object>();
        for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
            vector.add(rs.getObject(columnIndex));
        }
        data.add(vector);
    }

    return new DefaultTableModel(data, columnNames);}
}
