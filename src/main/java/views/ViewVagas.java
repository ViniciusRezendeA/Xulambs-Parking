package views;

import javax.swing.*;

public class ViewVagas extends javax.swing.JFrame  {
    private JTable tbVagas;
    private JScrollPane scrollPane;
    private JPanel panel1;
    private JButton btnGetVagas;

    public ViewVagas() {
        initComponents();
    }

    public JTable getTbVagas() {
        return tbVagas;
    }

    public JButton getBtnGetVagas() {
        return btnGetVagas;
    }


    private void initComponents() {
        tbVagas.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null}
                },
                new String [] {
                        "Title 1", "Title 2",
                }
        ));
        JFrame frame = new JFrame("Vagas");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(panel1.getPreferredSize());
        frame.add(panel1);
        frame.pack();
        frame.setVisible(true);
    }

}


