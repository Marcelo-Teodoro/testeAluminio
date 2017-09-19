package view;

import classe.Fornecedor;
import classe.Perfil;
import model.PerfilTableModel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PrimeiroPanel extends JFrame{
    private JPanel panel1;
    private JTabbedPane tbdPane;
    private JButton btnPerfil;
    private JButton btnAcessorio;
    private JButton btnEsquadria;
    private JPanel jpTabArquivo;
    private JButton btnContato;
    private JButton btnFornecedor;
    CadastroPerfil cadastroPerfil;


    public PrimeiroPanel() {

        btnPerfil.addActionListener(new ActionListener( ) {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame jf = new JFrame();
                jf.setContentPane(new CadastroPerfil().getPerfilFundoPanel());
                jf.setVisible(true);
                jf.setSize(800,600);
                jf.setLocationRelativeTo(null);
            }
        });
        btnFornecedor.addActionListener(new ActionListener( ) {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame jf = new JFrame();
                jf.setContentPane(new CadastroFornecedor().getFornecedorFundoPanel());
                jf.setVisible(true);
                jf.setSize(800,600);
                jf.setLocationRelativeTo(null);
            }
        });

        // Ação do botão para cadastrar Acessório
        btnAcessorio.addActionListener(new ActionListener( ) {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame jf = new JFrame();
                jf.setContentPane(new CadastroAcessorio().getAcessorioFundoPanel());
                jf.setVisible(true);
                jf.setSize(800,600);
                jf.setLocationRelativeTo(null);
            }
        });

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
        jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jf.setContentPane(new PrimeiroPanel().panel1);
        jf.setVisible(true);
        jf.setSize(800,600);
        jf.setLocationRelativeTo(null);
    }


}
