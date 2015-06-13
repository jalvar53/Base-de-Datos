package Interfaz;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;

public class Historial extends javax.swing.JFrame {

    Statement stmt = null; //El estatemente desde donde se ejecutaran Queries
    ResultSet rs = null; //Donde se almacenara el resultado de dichos Queries
        
    public Historial() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtBuscar = new javax.swing.JButton();
        BtSalir = new javax.swing.JButton();
        jlabel1 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        jlabel2 = new javax.swing.JLabel();
        Placa = new javax.swing.JTextField();
        jlabel3 = new javax.swing.JLabel();
        AñoInicio = new javax.swing.JTextField();
        MesInicio = new javax.swing.JTextField();
        DiaInicio = new javax.swing.JTextField();
        jlabel4 = new javax.swing.JLabel();
        AñoFin = new javax.swing.JTextField();
        MesFin = new javax.swing.JTextField();
        DiaFin = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

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

        jlabel1.setText("Identificacion:");

        jlabel2.setText("Placa:");

        jlabel3.setText("Fecha Inicio:");

        jlabel4.setText("Fecha Fin:");

        jLabel1.setText("Dia:");

        jLabel2.setText("Mes:");

        jLabel3.setText("Año:");

        jLabel4.setText("Dia:");

        jLabel5.setText("Mes:");

        jLabel6.setText("Año:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ID))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Placa))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlabel4)
                            .addComponent(jlabel3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DiaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MesFin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AñoFin, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DiaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MesInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AñoInicio)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel1)
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(DiaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(MesInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(AñoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jlabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(DiaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MesFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AñoFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtBuscar)
                    .addComponent(BtSalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSalirActionPerformed
        OpcionesAdmin opc = new OpcionesAdmin(); //Crea el interfaz menu
        opc.setVisible(true); //lo hace visible
        opc.setLocationRelativeTo(null); //Lo ubica en el centro de la pantalla
        this.dispose(); //Cierra esta ventana
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AñoFin;
    private javax.swing.JTextField AñoInicio;
    private javax.swing.JButton BtBuscar;
    private javax.swing.JButton BtSalir;
    private javax.swing.JTextField DiaFin;
    private javax.swing.JTextField DiaInicio;
    private javax.swing.JTextField ID;
    private javax.swing.JTextField MesFin;
    private javax.swing.JTextField MesInicio;
    private javax.swing.JTextField Placa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jlabel1;
    private javax.swing.JLabel jlabel2;
    private javax.swing.JLabel jlabel3;
    private javax.swing.JLabel jlabel4;
    // End of variables declaration//GEN-END:variables
    public String getQuery(){ //Metodo que revisa cada campo y edita el Query para incluir la restriccion
        String query = "SELECT * FROM Renta WHERE ";
        if(!ID.getText().isEmpty()){
            //Si ingreso una Identificacion:
            query = query + "`Identificacion` = " + "'" + ID.getText() + "'" + " AND ";
        }
        if(!Placa.getText().isEmpty()){
            //Si ingreso una Placa:
            query = query + "`Placa` = " + "'" + Placa.getText() + "'" + " AND ";
        }
        if(!AñoInicio.getText().isEmpty() && !MesInicio.getText().isEmpty() && !DiaInicio.getText().isEmpty()){
            //Si ingreso una Fecha de inicio:
            query = query + "`Fecha Ini` = " + "'" + AñoInicio.getText() + "-" + MesInicio.getText() + "-" + DiaInicio.getText() + "'" + " AND ";
        }
        if(!AñoFin.getText().isEmpty() && !MesFin.getText().isEmpty() && !DiaFin.getText().isEmpty()){
            //Si ingreso una Fecha de finalizacion:
            query = query + "`Fecha Fin` = " + "'" + AñoFin.getText() + "-" + MesFin.getText() + "-" + DiaFin.getText() + "'" + " AND ";
        }
        if(!ID.getText().isEmpty() || !Placa.getText().isEmpty() || !AñoInicio.getText().isEmpty() || !AñoFin.getText().isEmpty()){
            //Revisa si por lo menos se hizo una operacion:
            query = query.substring(0, query.length()-4); //Borra el ultimo "AND" del Query
        }
        else{ //En caso de que no se halla llenado ni un solo campo
            query = query.substring(0, query.length()-5); //Elimina el "WHERE" del Query
        }
        return query;
    }    
}
