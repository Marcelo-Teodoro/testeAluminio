package model;

import classe.Acessorio;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class AcessorioTableModel extends AbstractTableModel{

    Acessorio acessorio;
    List<Acessorio> listaAcessorio;

    public Acessorio getAcessorio() {
        return acessorio;
    }

    public void setAcessorio(Acessorio acessorio) {
        this.acessorio = acessorio;
    }

    public List<Acessorio> getListaAcessorio() {
        return listaAcessorio;
    }

    public void setListaAcessorio(List<Acessorio> listaAcessorio) {
        this.listaAcessorio = listaAcessorio;
    }

    protected Acessorio getObjetoAt(int rowIndex) {
        return listaAcessorio.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return listaAcessorio.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        String valor = "";

        if (columnIndex == 0) {
            valor = String.valueOf(listaAcessorio.get(rowIndex).getCodigo());
        }

        if (columnIndex == 1) {
            valor = String.valueOf(listaAcessorio.get(rowIndex).getFornecedor().getEmpresa());
        }

        if (columnIndex == 2) {
            valor = String.valueOf(listaAcessorio.get(rowIndex).getUnidade());
        }

        if (columnIndex == 3) {
            valor = String.valueOf(listaAcessorio.get(rowIndex).getPreco());
        }

        if (columnIndex == 4) {
            valor = String.valueOf(listaAcessorio.get(rowIndex).getQuantidade());
        }

        if (columnIndex == 5) {
            valor = String.valueOf(listaAcessorio.get(rowIndex).getDescricao());
        }

        return valor;

    }

    public String getColumnName(int column) {

        String valor = "";

        if (column == 0) {
            valor = "Código";
        }

        if (column == 1) {
            valor = "Fornecedor";
        }

        if (column == 2) {
            valor = "Unidade";
        }

        if (column == 3) {
            valor = "Preço";
        }

        if (column == 4) {
            valor = "Quantidade";
        }

        if (column == 5) {
            valor = "Descrição";
        }

        return valor;
    }

}
