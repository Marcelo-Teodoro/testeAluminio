package view;

import classe.Fornecedor;
import model.FornecedorTableModel;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
import java.util.ArrayList;

public class CadastroFornecedor {
    private JPanel fornecedorFundoPanel;
    private JLabel tipoLabel;
    private JTextField textField2;
    private JTextField textField1;
    private JLabel empresaLabel;
    private JTable jtbTabelaFornecedor;
    private JTextField textField3;
    private JButton cancelarButton;
    private JButton salvarButton;
    private JTextField textField8;
    private JTextField textField4;

    ArrayList fornecedoresLista;

    public CadastroFornecedor() {
        testePopulaTable();
    }
    //coments


    public void testePopulaTable(){
        DefaultTableCellRenderer cellRender = new DefaultTableCellRenderer();
        DefaultTableCellRenderer cellRenderTitle = new DefaultTableCellRenderer();

        cellRender.setHorizontalAlignment(SwingConstants.CENTER);
        cellRenderTitle.setHorizontalAlignment(SwingConstants.CENTER);
        cellRenderTitle.setFont(cellRenderTitle.getFont().deriveFont(Font.BOLD)); // Não Funciona, Deveria deixar os Nomes das Colunas em Negrito;

        System.out.println("Passei fornecedor" );
        fornecedoresLista = new ArrayList();
        fornecedoresLista.add(new Fornecedor(1,"Alcoa","99995-8547","qwe1d1a@a.com", "Obs", 1.50));
        fornecedoresLista.add(new Fornecedor(2,"Inova","99888-9998","asda4a@hotmail.com", "Obs", 1.78));
        fornecedoresLista.add(new Fornecedor(3,"Soluta","98544-7777","asdaa@a5gg.com", "Obs", 22.50));
        fornecedoresLista.add(new Fornecedor(4,"Linha Master","98577-5999","aasa@com.gg", "Obs", 26.00));

        FornecedorTableModel model = new FornecedorTableModel();
        model.setListaFornecedor(fornecedoresLista);
        jtbTabelaFornecedor.setModel(model);

        this.jtbTabelaFornecedor.getColumnModel().getColumn(0).setHeaderRenderer(cellRenderTitle);
        this.jtbTabelaFornecedor.getColumnModel().getColumn(0).setCellRenderer(cellRender);
        this.jtbTabelaFornecedor.getColumnModel().getColumn(1).setHeaderRenderer(cellRenderTitle);
        this.jtbTabelaFornecedor.getColumnModel().getColumn(1).setCellRenderer(cellRender);
        this.jtbTabelaFornecedor.getColumnModel().getColumn(2).setHeaderRenderer(cellRenderTitle);
        this.jtbTabelaFornecedor.getColumnModel().getColumn(2).setCellRenderer(cellRender);
        this.jtbTabelaFornecedor.getColumnModel().getColumn(3).setHeaderRenderer(cellRenderTitle);
        this.jtbTabelaFornecedor.getColumnModel().getColumn(3).setCellRenderer(cellRender);
        this.jtbTabelaFornecedor.getColumnModel().getColumn(4).setHeaderRenderer(cellRenderTitle);
        this.jtbTabelaFornecedor.getColumnModel().getColumn(4).setCellRenderer(cellRender);

    }


    public JPanel getFornecedorFundoPanel() {
        return fornecedorFundoPanel;
    }

    public void setFornecedorFundoPanel(JPanel fornecedorFundoPanel) {
        this.fornecedorFundoPanel = fornecedorFundoPanel;
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

    public JTextField getTextField1() {
        return textField1;
    }

    public void setTextField1(JTextField textField1) {
        this.textField1 = textField1;
    }

    public JLabel getEmpresaLabel() {
        return empresaLabel;
    }

    public void setEmpresaLabel(JLabel empresaLabel) {
        this.empresaLabel = empresaLabel;
    }

    public JTable getJtbTabelaFornecedor() {
        return jtbTabelaFornecedor;
    }

    public void setJtbTabelaFornecedor(JTable jtbTabelaFornecedor) {
        this.jtbTabelaFornecedor = jtbTabelaFornecedor;
    }

    public JTextField getTextField3() {
        return textField3;
    }

    public void setTextField3(JTextField textField3) {
        this.textField3 = textField3;
    }

    public JButton getCancelarButton() {
        return cancelarButton;
    }

    public void setCancelarButton(JButton cancelarButton) {
        this.cancelarButton = cancelarButton;
    }

    public JButton getSalvarButton() {
        return salvarButton;
    }

    public void setSalvarButton(JButton salvarButton) {
        this.salvarButton = salvarButton;
    }

    public JTextField getTextField8() {
        return textField8;
    }

    public void setTextField8(JTextField textField8) {
        this.textField8 = textField8;
    }

    public JTextField getTextField4() {
        return textField4;
    }

    public void setTextField4(JTextField textField4) {
        this.textField4 = textField4;
    }
}
