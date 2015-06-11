/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Juan
 */
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

}
