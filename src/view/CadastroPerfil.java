package view;

import javax.swing.*;

public class CadastroPerfil {
    private JPanel perfilFundoPanel;
    private JLabel fornecedorLabel;
    private JTextField textField1;
    private JLabel tipoLabel;
    private JTextField textField2;

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
