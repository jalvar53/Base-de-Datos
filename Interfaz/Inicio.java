import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Inicio implements ActionListener{

  private JButton renta;
  private JButton admin;
  private JPanel panel1;
  private JPanel panel2;
  public  OpcAdmin opcAdmin;
  private JFrame ventana;

  public Inicio(){

    ventana = new JFrame("Renta de Carros");
    opcAdmin = new OpcAdmin();
    ventana.setLayout(null);
    panel1 = new JPanel(new GridLayout());
    panel2 = new JPanel(new GridLayout());
    admin = new JButton("Opciones de Administrador");
    renta = new JButton("Rentar carro");
    admin.setBounds(75, 210, 250, 30);
    renta.setBounds(75, 170, 250, 30);
    ventana.add(renta);
    ventana.add(admin);
    ventana.add(panel1);
    ventana.add(panel2);
    panel1.setBounds(50, 100, 100, 300);
    panel2.setBounds(50, 200, 100, 300);
    renta.addActionListener(this);
    admin.addActionListener(this);
    ventana.setResizable(false);
    ventana.setSize(400,300);
    ventana.setVisible(true);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  }

  public void actionPerformed(ActionEvent e){

    if(e.getSource()==renta){

    }

    if(e.getSource()==admin){

      ventana.setVisible(false);
      opcAdmin.setVisible(true);

    }

  }

  public static void main(String[]args){

    Inicio inicio = new Inicio();

  }
}
