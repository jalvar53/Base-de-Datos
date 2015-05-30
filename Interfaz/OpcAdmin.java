import java.awt.*;
import javax.swing.JFrame;

public class OpcAdmin{

  JFrame ventana1;

  public OpcAdmin(){

    ventana1 = new JFrame("Opciones de Administrador");
    ventana1.setLayout(null);
    ventana1.setSize(800, 500);
    ventana1.setResizable(true);

  }

  public void setVisible(boolean a){

    ventana1.setVisible(a);

  }

  public static void main(String[]args){

    OpcAdmin opcAdmin = new OpcAdmin();

  }

}
