package model;

import classe.Orcamento;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class OrcamentoTableModel extends AbstractTableModel{

    Orcamento orcamento;
    List<Orcamento> listaOrcamento;

    public Orcamento getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(Orcamento orcamento) {
        this.orcamento = orcamento;
    }

    public List<Orcamento> getListaOrcamento() {
        return listaOrcamento;
    }

    public void setListaOrcamento(List<Orcamento> listaOrcamento) {
        this.listaOrcamento = listaOrcamento;
    }

    protected Orcamento getObjetoAt(int rowIndex) {
        return listaOrcamento.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return listaOrcamento.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        String valor = "";

        if (columnIndex == 0) {
            valor = String.valueOf(listaOrcamento.get(rowIndex).getCliente().getNome());
        }

        if (columnIndex == 1) {
            valor = String.valueOf(listaOrcamento.get(rowIndex).getObra());
        }

        if (columnIndex == 2) {
            valor = String.valueOf(listaOrcamento.get(rowIndex).getData());
        }

        if (columnIndex == 3) {
            valor = String.valueOf(listaOrcamento.get(rowIndex).getValorTotal());
        }

        if (columnIndex == 4) {
            valor = String.valueOf(listaOrcamento.get(rowIndex).getCliente().getNome());
        }

        if (columnIndex == 5) {
            valor = String.valueOf(listaOrcamento.get(rowIndex).getCliente().getNome());
        }

        if (columnIndex == 6) {
            valor = String.valueOf(listaOrcamento.get(rowIndex).getCliente().getNome());
        }


        return valor;

    }

    public String getColumnName(int column) {

        String valor = "";

        if (column == 0) {
            valor = "Codigo";
        }

        if (column == 1) {
            valor = "Descricao";
        }

        if (column == 2) {
            valor = "QTD";
        }

        if (column == 3) {
            valor = "L";
        }

        if (column == 4) {
            valor = "H";
        }

        if (column == 5) {
            valor = "H1";
        }

        if (column == 6) {
            valor = "H2";
        }

        return valor;
    }

}
