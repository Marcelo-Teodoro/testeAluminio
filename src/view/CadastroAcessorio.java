package view;

import classe.Acessorio;
import classe.Fornecedor;
import model.PerfilTableModel;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
import java.util.ArrayList;

public class CadastroAcessorio {
    private JPanel JPanel;
    private JPanel acessorioFundoPanel;
    private JLabel tipoLabel;
    private JTextField textField2;
    private JTextField textField1;
    private JLabel fornecedorLabel;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField7;
    private JTable jtbTabelaPerfil;
    private JTextField textField3;
    private JButton cancelarButton;
    private JButton salvarButton;
    private JTextField textField8;
    //..................................
    ArrayList fornecedoresLista;
    ArrayList acessorioLista;



    public void setJtbTabelaPerfil(JTable jtbTabelaPerfil) {
        this.jtbTabelaPerfil = jtbTabelaPerfil;
    }

    public CadastroAcessorio() {
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
        fornecedoresLista.add(new Fornecedor(1,"Alcoa","99995-8547","qwe1d1a@a.com", "Obs", 1.50));
        fornecedoresLista.add(new Fornecedor(2,"Inova","99888-9998","asda4a@hotmail.com", "Obs", 1.78));
        fornecedoresLista.add(new Fornecedor(3,"Soluta","98544-7777","asdaa@a5gg.com", "Obs", 22.50));
        fornecedoresLista.add(new Fornecedor(4,"Linha Master","98577-5999","aasa@com.gg", "Obs", 26.00));

        acessorioLista = new ArrayList();

        for (int i = 0; i < 10; i++) {
            acessorioLista.add(new Acessorio(1, (Fornecedor) fornecedoresLista.get(2), "MC67", "Descrição", "CX", 2.50, 5));
            acessorioLista.add(new Acessorio(2, (Fornecedor) fornecedoresLista.get(1), "MC34", "Descrição", "CX", 2.50, 5));
            acessorioLista.add(new Acessorio(4, (Fornecedor) fornecedoresLista.get(1), "MNJC67", "Descrição", "CX", 2.50, 5));
            acessorioLista.add(new Acessorio(5, (Fornecedor) fornecedoresLista.get(1), "MC6907", "Descrição", "CX", 2.50, 5));
            acessorioLista.add(new Acessorio(6, (Fornecedor) fornecedoresLista.get(4), "KLMC67", "Descrição", "CX", 2.50, 5));
            acessorioLista.add(new Acessorio(7, (Fornecedor) fornecedoresLista.get(3), "MCJ67", "Descrição", "CX", 2.50, 5));
            acessorioLista.add(new Acessorio(8, (Fornecedor) fornecedoresLista.get(2), "MCC867", "Descrição", "CX", 2.50, 5));
            acessorioLista.add(new Acessorio(9, (Fornecedor) fornecedoresLista.get(3), "LMC67", "Descrição", "CX", 2.50, 5));
            acessorioLista.add(new Acessorio(10, (Fornecedor) fornecedoresLista.get(2), "NKMC67", "Descrição", "CX", 2.50, 5));
        }

        PerfilTableModel model = new PerfilTableModel();
        model.setListaPerfil(acessorioLista);
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

    public JPanel getAcessorioFundoPanel() {
        return acessorioFundoPanel;
    }

    public void setPerfilFundoPanel(JPanel perfilFundoPanel) {
        this.acessorioFundoPanel = perfilFundoPanel;
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
