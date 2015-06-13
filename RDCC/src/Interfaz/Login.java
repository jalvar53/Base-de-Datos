package Interfaz;

import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;

//Clase para la verificación de usuario para la entrada a la Base de datos.
public class Login extends javax.swing.JFrame {

    public Login() {
       initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Username = new javax.swing.JTextField();
        LabelNombre = new javax.swing.JLabel();
        LabelPassword = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Password = new javax.swing.JPasswordField();
        Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RDCC");
        setResizable(false);

        LabelNombre.setText("Nombre de Usuario:");

        LabelPassword.setText("Contraseña:");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/logordcc.png"))); // NOI18N

        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Password, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Username, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Salir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LabelNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelPassword, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(LabelNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(Salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Botón que usa los parámetros pasados de contraseña y nombre de usuario al host.
    //Indica también si los datos no son aceptados.
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(Username.getText().isEmpty()){
            LabelNombre.setText("Nombre de Usuario:*");
            LabelNombre.setForeground(Color.RED);
        } else if(Password.getText().isEmpty()){
            LabelPassword.setText("Contraseña:*");
            LabelPassword.setForeground(Color.RED);
        }
        else{
            try{
                //Crea una nueva conexion y le pasa como parametros nombre de usuario y contraseña.
                Conexion mysql = new Conexion();
                mysql.setUser(Username.getText());
                mysql.setPass(Password.getText());
                java.sql.Connection cn= mysql.Conectar();
                OpcionesAdmin opc = new OpcionesAdmin();
                opc.setVisible(true);
                opc.setLocationRelativeTo(null);
                opc.ActualizarCarros();
                this.dispose();
            }catch(Exception e){
                LabelNombre.setText("Nombre de usuario o contraseña incorrectas");
                LabelNombre.setForeground(Color.RED);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    //Botón que cierra la conexión y el programa.
    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        if(Conexion.link != null){
            try {
                Conexion.link.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al desconectar");
            }
        }
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelNombre;
    private javax.swing.JLabel LabelPassword;
    private javax.swing.JPasswordField Password;
    private javax.swing.JButton Salir;
    private javax.swing.JTextField Username;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
