package view;

import javax.swing.*;

public class PrimeiroPanel extends JFrame{
    private JPanel panel1;
    private JTabbedPane tbdPane;
    private JButton btnPerfil;
    private JButton btnAcessorio;
    private JButton btnEsquadria;
    private JPanel jpTabArquivo;
    private JButton btnContato;

    public PrimeiroPanel() {

    }

    public static void main(String[] args) {

        try {

            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                } else {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                }
            }
        } catch (Exception e) {
            System.out.println("Sem nimbus");
        }

        JFrame jf = new JFrame();
        jf.setContentPane(new PrimeiroPanel().panel1);
        jf.setVisible(true);
        jf.setSize(800,600);
        jf.setLocationRelativeTo(null);
    }
}
