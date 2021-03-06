package Interfaz;

import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

public class ResRenta extends javax.swing.JFrame {

    public ResRenta(JTable table) {
        //Se colocan los resultados de la busqueda de renta
        initComponents();
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        Panel.setLayout(new BorderLayout());
        Panel.add( new JScrollPane(table),BorderLayout.CENTER);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        resizeColumnWidth(table);
        this.pack();
        this.setSize(table.getWidth()+20, 500);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    JTable table;
    private void resizeColumnWidth(JTable table) {
        //Se da el tamaño y el formato de la tabla
        this.table=table;
        final TableColumnModel columnModel = table.getColumnModel();
        for (int column = 0; column < table.getColumnCount(); column++) {
            int width = 50; // Min width
            for (int row = 0; row < table.getRowCount(); row++) {
                TableCellRenderer renderer = table.getCellRenderer(row, column);
                Component comp = table.prepareRenderer(renderer, row, column);
                width = Math.max(comp.getPreferredSize().width, width);
            }
            columnModel.getColumn(column).setPreferredWidth(width+5);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        Rentar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 256, Short.MAX_VALUE)
        );

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addComponent(Cancelar)
                .addGap(55, 55, 55)
                .addComponent(Rentar)
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Rentar)
                    .addComponent(Cancelar))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RentarActionPerformed
        //Se crea una nueva instancia de FormularioRenta para obtener informacion de la renta que se hará
        int seleccion = table.getSelectedRow();
        if(seleccion != -1){
            if(table.getValueAt(seleccion, 4).toString().equals("true")){
                FormularioRenta formulario = new FormularioRenta(table.getValueAt(seleccion, 0).toString());
                formulario.setVisible(true);
                formulario.setLocationRelativeTo(null);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Auto no disponible");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione un Auto");
        }
    }//GEN-LAST:event_RentarActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        //Se cierra la ventana
        this.dispose();
    }//GEN-LAST:event_CancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JPanel Panel;
    private javax.swing.JButton Rentar;
    // End of variables declaration//GEN-END:variables
}
