package view;

import classe.Fornecedor;
import classe.Perfil;
import model.PerfilTableModel;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
import java.util.ArrayList;

public class CadastroPerfil {
    private JPanel perfilFundoPanel;
    private JLabel fornecedorLabel;
    private JTextField textField1;
    private JLabel tipoLabel;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JButton salvarButton;
    private JButton cancelarButton;
    private JTable jtbTabelaPerfil;
    //private JScrollPane scrollPane;
    ArrayList fornecedoresLista;
    ArrayList perfilLista;

    public JTable getJtbTabelaPerfil() {
        return jtbTabelaPerfil;
    }

    public void setJtbTabelaPerfil(JTable jtbTabelaPerfil) {
        this.jtbTabelaPerfil = jtbTabelaPerfil;
    }

    public CadastroPerfil() {
        testePopulaTable();
    }

    public void testePopulaTable(){
        DefaultTableCellRenderer cellRender = new DefaultTableCellRenderer();
        DefaultTableCellRenderer cellRenderTitle = new DefaultTableCellRenderer();

        cellRender.setHorizontalAlignment(SwingConstants.CENTER);
        cellRenderTitle.setHorizontalAlignment(SwingConstants.CENTER);
        cellRenderTitle.setFont(cellRenderTitle.getFont().deriveFont(Font.BOLD)); // Não Funciona, Deveria deixar os Nomes das Colunas em Negrito;

        System.out.println("Passei" );
        fornecedoresLista = new ArrayList();
        fornecedoresLista.add(new Fornecedor(1,"Alcoa","99995-8547","qwe1d1a@a.com", "Obs"));
        fornecedoresLista.add(new Fornecedor(2,"Inova","99888-9998","asda4a@hotmail.com", "Obs"));
        fornecedoresLista.add(new Fornecedor(3,"Soluta","98544-7777","asdaa@a5gg.com", "Obs"));
        fornecedoresLista.add(new Fornecedor(4,"Linha Master","98577-5999","aasa@com.gg", "Obs"));

        perfilLista = new ArrayList();

        for (int i = 0; i < 10; i++) {

            perfilLista.add(new Perfil(1, "W", 9.1, 1.500, "Aqui vai a descrição? iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", (Fornecedor) fornecedoresLista.get(1)));
            perfilLista.add(new Perfil(2, "T", 4.5, 7.100, "Sim!", (Fornecedor) fornecedoresLista.get(3)));
            perfilLista.add(new Perfil(3, "F", 7.2, 2.000, "Ah tá!", (Fornecedor) fornecedoresLista.get(0)));
            perfilLista.add(new Perfil(4, "M", 5.3, 4.600, "Humm", (Fornecedor) fornecedoresLista.get(2)));
            perfilLista.add(new Perfil(1, "W", 9.1, 1.500, "Aqui vai a descrição?", (Fornecedor) fornecedoresLista.get(1)));
            perfilLista.add(new Perfil(2, "T", 4.5, 7.100, "Sim!", (Fornecedor) fornecedoresLista.get(3)));
            perfilLista.add(new Perfil(3, "F", 7.2, 2.000, "Ah tá!", (Fornecedor) fornecedoresLista.get(0)));
            perfilLista.add(new Perfil(4, "M", 5.3, 4.600, "Humm", (Fornecedor) fornecedoresLista.get(2)));
            perfilLista.add(new Perfil(1, "W", 9.1, 1.500, "Aqui vai a descrição?", (Fornecedor) fornecedoresLista.get(1)));
            perfilLista.add(new Perfil(2, "T", 4.5, 7.100, "Sim!", (Fornecedor) fornecedoresLista.get(3)));
            perfilLista.add(new Perfil(3, "F", 7.2, 2.000, "Ah tá!", (Fornecedor) fornecedoresLista.get(0)));
            perfilLista.add(new Perfil(4, "M", 5.3, 4.600, "Humm", (Fornecedor) fornecedoresLista.get(2)));
            perfilLista.add(new Perfil(1, "W", 9.1, 1.500, "Aqui vai a descrição?", (Fornecedor) fornecedoresLista.get(1)));
            perfilLista.add(new Perfil(2, "T", 4.5, 7.100, "Sim!", (Fornecedor) fornecedoresLista.get(3)));
            perfilLista.add(new Perfil(3, "F", 7.2, 2.000, "Ah tá!", (Fornecedor) fornecedoresLista.get(0)));
            perfilLista.add(new Perfil(4, "M", 5.3, 4.600, "Humm", (Fornecedor) fornecedoresLista.get(2)));
            perfilLista.add(new Perfil(1, "W", 9.1, 1.500, "Aqui vai a descrição?", (Fornecedor) fornecedoresLista.get(1)));
            perfilLista.add(new Perfil(2, "T", 4.5, 7.100, "Sim!", (Fornecedor) fornecedoresLista.get(3)));
            perfilLista.add(new Perfil(3, "F", 7.2, 2.000, "Ah tá!", (Fornecedor) fornecedoresLista.get(0)));
            perfilLista.add(new Perfil(4, "M", 5.3, 4.600, "Humm", (Fornecedor) fornecedoresLista.get(2)));
        }

        PerfilTableModel model = new PerfilTableModel();
        model.setListaPerfil(perfilLista);
        jtbTabelaPerfil.setModel(model);
        //scrollPane = new JScrollPane(jtbTabelaPerfil);

        this.jtbTabelaPerfil.getColumnModel().getColumn(0).setHeaderRenderer(cellRenderTitle);
        this.jtbTabelaPerfil.getColumnModel().getColumn(0).setCellRenderer(cellRender);
        this.jtbTabelaPerfil.getColumnModel().getColumn(1).setHeaderRenderer(cellRenderTitle);
        this.jtbTabelaPerfil.getColumnModel().getColumn(1).setCellRenderer(cellRender);
        this.jtbTabelaPerfil.getColumnModel().getColumn(2).setHeaderRenderer(cellRenderTitle);
        this.jtbTabelaPerfil.getColumnModel().getColumn(2).setCellRenderer(cellRender);
        this.jtbTabelaPerfil.getColumnModel().getColumn(3).setHeaderRenderer(cellRenderTitle);
        this.jtbTabelaPerfil.getColumnModel().getColumn(3).setCellRenderer(cellRender);
        this.jtbTabelaPerfil.getColumnModel().getColumn(4).setHeaderRenderer(cellRenderTitle);
        this.jtbTabelaPerfil.getColumnModel().getColumn(4).setCellRenderer(cellRender);

    }

    public JPanel getPerfilFundoPanel() {
        return perfilFundoPanel;
    }

    public void setPerfilFundoPanel(JPanel perfilFundoPanel) {
        this.perfilFundoPanel = perfilFundoPanel;
    }

    public JLabel getFornecedorLabel() {
        return fornecedorLabel;
    }

    public void setFornecedorLabel(JLabel fornecedorLabel) {
        this.fornecedorLabel = fornecedorLabel;
    }

    public JTextField getTextField1() {
        return textField1;
    }

    public void setTextField1(JTextField textField1) {
        this.textField1 = textField1;
    }

    public JLabel getTipoLabel() {
        return tipoLabel;
    }

    public void setTipoLabel(JLabel tipoLabel) {
        this.tipoLabel = tipoLabel;
    }

    public JTextField getTextField2() {
        return textField2;
    }

    public void setTextField2(JTextField textField2) {
        this.textField2 = textField2;
    }





}
