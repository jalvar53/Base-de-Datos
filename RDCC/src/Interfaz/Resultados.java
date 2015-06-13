package Interfaz;

import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

//Clase para generar la tabla de SQL y mostrarla en una ventana.
public class Resultados extends javax.swing.JFrame {

    //Constructor que crea un JFrame y un JPanel con un JTable como parametro
    //Muestra la tabla resultante en el JFrame.
    public Resultados(JTable jTable) {
        initComponents();
        JFrame frame = new JFrame("Resultados de Búsqueda");
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        frame.add( new JScrollPane(jTable),BorderLayout.CENTER);
        jTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        resizeColumnWidth(jTable);
        frame.pack();
        frame.setSize(jTable.getWidth()+20, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 399, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 301, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    
    //Método que acomoda la ventana del tamaño de las columnas de la tabla.
    //Código original tomado de: "http://stackoverflow.com/questions/17627431/auto-resizing-the-jtable-column-widths"
    private void resizeColumnWidth(JTable table) {
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
}
