package GUI;

import javax.swing.*;

public class Shop extends JFrame {

    private JButton jButton1;
    private JButton jButton2;
    private JComboBox<String> jComboBox1;
    private JLabel jLabel1;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JTable jTable1;
    private JTextArea jTextArea1;

    public Shop() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jLabel1 = new JLabel();
        jComboBox1 = new JComboBox<>();
        jButton1 = new JButton();
        jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();
        jScrollPane2 = new JScrollPane();
        jTextArea1 = new JTextArea();
        jButton2 = new JButton();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);


        jLabel1.setText("Select product category");
        jLabel1.setBounds(50, 10, 250, 30);

        jComboBox1.setModel(new DefaultComboBoxModel<>(new String[]{"All", "Electronics", "Clothing"}));
        jComboBox1.setBounds(300, 10, 150, 30);

        jButton1.setText("Shopping Cart");
        jButton1.setBounds(600, 5, 150, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{"Product Id", "Name", "Category", "Price", "Info"}
        ) {
            boolean[] canEdit = new boolean[]{false, false, false, false, false};

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jScrollPane1.setBounds(50, 50, 700, 200);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);
        jScrollPane2.setBounds(50, 260, 700, 150);

        jButton2.setText("Add to Shopping Cart");
        jButton2.setBounds(330, 420, 160, 30);

        add(jLabel1);
        add(jComboBox1);
        add(jButton1);
        add(jScrollPane1);
        add(jScrollPane2);
        add(jButton2);

        setSize(815, 500);
        setLocationRelativeTo(null);
    }



    public static void main(String args[]) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException |
                 UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }

        java.awt.EventQueue.invokeLater(() -> new Shop().setVisible(true));
    }
}

