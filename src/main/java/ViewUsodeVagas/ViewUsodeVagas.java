package ViewUsodeVagas;
import javax.swing.*;

public class ViewUsodeVagas extends javax.swing.JFrame {

    private JLabel Entrada;
    private JLabel Saida;
    private JLabel Valor;
    private JPanel TelaUsoVagas;

    public ViewUsodeVagas() {

   setTitle("sem titulo");
   setDefaultCloseOperation(EXIT_ON_CLOSE);
   setLocationRelativeTo(null);
   setVisible(true);
        int width = 800;
        int height = 500;
        setSize( width,height);
    }


    public static void main(String[] args) {
        new ViewUsodeVagas();
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
