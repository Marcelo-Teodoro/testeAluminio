package view;

import classe.Fornecedor;
import classe.Perfil;
import model.OrcamentoTableModel;
import model.PerfilTableModel;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
import java.util.ArrayList;

public class CadastroOrcamento {
    private JPanel orcamentoFundoPanel;
    private JLabel tipoLabel;
    private JTextField textField2;
    private JTextField textField1;
    private JLabel fornecedorLabel;
    private JTextField textField4;
    private JTextField textField7;
    private JTable jtbTabelaOrcamento;
    private JButton cancelarButton;
    private JButton salvarButton;
    private JFormattedTextField formattedTextField1;
    ArrayList listaOrcamento;

    public CadastroOrcamento() {
        testePopulaTable();
    }

    public void testePopulaTable(){
        DefaultTableCellRenderer cellRender = new DefaultTableCellRenderer();
        DefaultTableCellRenderer cellRenderTitle = new DefaultTableCellRenderer();

        cellRender.setHorizontalAlignment(SwingConstants.CENTER);
        cellRenderTitle.setHorizontalAlignment(SwingConstants.CENTER);
        cellRenderTitle.setFont(cellRenderTitle.getFont().deriveFont(Font.BOLD)); // Não Funciona, Deveria deixar os Nomes das Colunas em Negrito;


        listaOrcamento = new ArrayList();


        OrcamentoTableModel model = new OrcamentoTableModel();
        model.setListaOrcamento(listaOrcamento);
        jtbTabelaOrcamento.setModel(model);
        //scrollPane = new JScrollPane(jtbTabelaOrcamento);

        this.jtbTabelaOrcamento.getColumnModel().getColumn(0).setHeaderRenderer(cellRenderTitle);
        this.jtbTabelaOrcamento.getColumnModel().getColumn(0).setCellRenderer(cellRender);
        this.jtbTabelaOrcamento.getColumnModel().getColumn(1).setHeaderRenderer(cellRenderTitle);
        this.jtbTabelaOrcamento.getColumnModel().getColumn(1).setCellRenderer(cellRender);
        this.jtbTabelaOrcamento.getColumnModel().getColumn(2).setHeaderRenderer(cellRenderTitle);
        this.jtbTabelaOrcamento.getColumnModel().getColumn(2).setCellRenderer(cellRender);
        this.jtbTabelaOrcamento.getColumnModel().getColumn(3).setHeaderRenderer(cellRenderTitle);
        this.jtbTabelaOrcamento.getColumnModel().getColumn(3).setCellRenderer(cellRender);
        this.jtbTabelaOrcamento.getColumnModel().getColumn(4).setHeaderRenderer(cellRenderTitle);
        this.jtbTabelaOrcamento.getColumnModel().getColumn(4).setCellRenderer(cellRender);
        this.jtbTabelaOrcamento.getColumnModel().getColumn(5).setHeaderRenderer(cellRenderTitle);
        this.jtbTabelaOrcamento.getColumnModel().getColumn(5).setCellRenderer(cellRender);
        this.jtbTabelaOrcamento.getColumnModel().getColumn(6).setHeaderRenderer(cellRenderTitle);
        this.jtbTabelaOrcamento.getColumnModel().getColumn(6).setCellRenderer(cellRender);

    }

    public JPanel getOrcamentoFundoPanel() {
        return orcamentoFundoPanel;
    }

    public void setOrcamentoFundoPanel(JPanel orcamentoFundoPanel) {
        this.orcamentoFundoPanel = orcamentoFundoPanel;
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

    public JLabel getFornecedorLabel() {
        return fornecedorLabel;
    }

    public void setFornecedorLabel(JLabel fornecedorLabel) {
        this.fornecedorLabel = fornecedorLabel;
    }

    public JTextField getTextField4() {
        return textField4;
    }

    public void setTextField4(JTextField textField4) {
        this.textField4 = textField4;
    }

    public JTextField getTextField7() {
        return textField7;
    }

    public void setTextField7(JTextField textField7) {
        this.textField7 = textField7;
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

    public JFormattedTextField getFormattedTextField1() {
        return formattedTextField1;
    }

    public void setFormattedTextField1(JFormattedTextField formattedTextField1) {
        this.formattedTextField1 = formattedTextField1;
    }

    public JTable getJtbTabelaOrcamento() {
        return jtbTabelaOrcamento;
    }

    public void setJtbTabelaOrcamento(JTable jtbTabelaOrcamento) {
        this.jtbTabelaOrcamento = jtbTabelaOrcamento;
    }
}
