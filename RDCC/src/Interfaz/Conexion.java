package Interfaz;
import java.sql.*;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class Conexion {
    public String db = "sql379747";
    public String url = "jdbc:mysql://sql3.freesqldatabase.com:3306/"+db;
    public String user = "";
    public String pass = "";
    public static Connection link = null;

    public Connection Conectar() throws Exception{
        try{
            Class.forName("org.gjt.mm.mysql.Driver");

            link = DriverManager.getConnection(this.url, this.user, this.pass);

        }catch(Exception ex){
            throw new Exception("Usuario incorrecto " + ex.getMessage());
        }
        return link;
    }
    
    public void setUser(String user){
        this.user = user;
    }
    
    public void setPass(String pass){
        this.pass = pass;
    }
    
    public static DefaultTableModel buildTableModel(ResultSet rs)
        throws SQLException {

        ResultSetMetaData metaData = rs.getMetaData();

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
        return new DefaultTableModel(data, columnNames){
            @Override
            public boolean isCellEditable(int row, int col)
            {
                return false;
            }
        };
    }
}