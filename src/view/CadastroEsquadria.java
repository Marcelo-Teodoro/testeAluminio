package view;

import classe.Acessorio;
import classe.Fornecedor;
import model.AcessorioTableModel;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
import java.util.ArrayList;

public class CadastroEsquadria {

    private JPanel esquadriaFundoPanel;
    private JLabel tipoLabel;
    private JTextField textField2;
    private JTextField textField4;
    private JTable jtbTabelaEsquadria;
    private JTextField textField8;
    private JTextField textField1;
    private JButton procurarButton;
    private JButton btnPerfil;
    private JButton btnAcessorio;
    //..................................
    ArrayList fornecedoresLista;
    ArrayList acessorioLista;
    ArrayList perfilLista;

    public void setJtbTabelaEsquadria(JTable jtbTabelaEsquadria) {
        this.jtbTabelaEsquadria = jtbTabelaEsquadria;
    }

    public CadastroEsquadria() {
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
//        fornecedoresLista.add(new Fornecedor(1,"Alcoa","99995-8547","qwe1d1a@a.com", "Obs", 1.50));
//        fornecedoresLista.add(new Fornecedor(2,"Inova","99888-9998","asda4a@hotmail.com", "Obs", 1.78));
//        fornecedoresLista.add(new Fornecedor(3,"Soluta","98544-7777","asdaa@a5gg.com", "Obs", 22.50));
//        fornecedoresLista.add(new Fornecedor(4,"Linha Master","98577-5999","aasa@com.gg", "Obs", 26.00));

        acessorioLista = new ArrayList();

//        for (int i = 0; i < 10; i++) {
//            acessorioLista.add(new Acessorio(1, (Fornecedor) fornecedoresLista.get(2), "MC67", "Descrição", "CX", 2.50, 5));
//            acessorioLista.add(new Acessorio(2, (Fornecedor) fornecedoresLista.get(1), "MC34", "Descrição", "CX", 2.50, 5));
//            acessorioLista.add(new Acessorio(4, (Fornecedor) fornecedoresLista.get(0), "MNJC67", "Descrição", "CX", 2.50, 5));
//            acessorioLista.add(new Acessorio(5, (Fornecedor) fornecedoresLista.get(1), "MC6907", "Descrição", "CX", 2.50, 5));
//            acessorioLista.add(new Acessorio(6, (Fornecedor) fornecedoresLista.get(0), "KLMC67", "Descrição", "CX", 2.50, 5));
//            acessorioLista.add(new Acessorio(7, (Fornecedor) fornecedoresLista.get(3), "MCJ67", "Descrição", "CX", 2.50, 5));
//            acessorioLista.add(new Acessorio(8, (Fornecedor) fornecedoresLista.get(2), "MCC867", "Descrição", "CX", 2.50, 5));
//            acessorioLista.add(new Acessorio(9, (Fornecedor) fornecedoresLista.get(3), "LMC67", "Descrição", "CX", 2.50, 5));
//            acessorioLista.add(new Acessorio(10, (Fornecedor) fornecedoresLista.get(2), "NKMC67", "Descrição", "CX", 2.50, 5));
//        }

        AcessorioTableModel model = new AcessorioTableModel();
        model.setListaAcessorio(acessorioLista);
        jtbTabelaEsquadria.setModel(model);
        //scrollPane = new JScrollPane(jtbTabelaPerfil);

        this.jtbTabelaEsquadria.getColumnModel().getColumn(0).setHeaderRenderer(cellRenderTitle);
        this.jtbTabelaEsquadria.getColumnModel().getColumn(0).setCellRenderer(cellRender);
        this.jtbTabelaEsquadria.getColumnModel().getColumn(1).setHeaderRenderer(cellRenderTitle);
        this.jtbTabelaEsquadria.getColumnModel().getColumn(1).setCellRenderer(cellRender);
        this.jtbTabelaEsquadria.getColumnModel().getColumn(2).setHeaderRenderer(cellRenderTitle);
        this.jtbTabelaEsquadria.getColumnModel().getColumn(2).setCellRenderer(cellRender);
        this.jtbTabelaEsquadria.getColumnModel().getColumn(3).setHeaderRenderer(cellRenderTitle);
        this.jtbTabelaEsquadria.getColumnModel().getColumn(3).setCellRenderer(cellRender);
        this.jtbTabelaEsquadria.getColumnModel().getColumn(4).setHeaderRenderer(cellRenderTitle);
        this.jtbTabelaEsquadria.getColumnModel().getColumn(4).setCellRenderer(cellRender);
        this.jtbTabelaEsquadria.getColumnModel().getColumn(5).setHeaderRenderer(cellRenderTitle);
        this.jtbTabelaEsquadria.getColumnModel().getColumn(5).setCellRenderer(cellRender);

    }

    public JPanel getEsquadriaFundoPanel() {
        return esquadriaFundoPanel;
    }

    public void setEsquadriaFundoPanel(JPanel esquadriaFundoPanel) {
        this.esquadriaFundoPanel = esquadriaFundoPanel;
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