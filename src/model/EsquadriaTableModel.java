package model;

import classe.Acessorio;
import classe.Esquadria;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class EsquadriaTableModel extends AbstractTableModel {

    Esquadria esquadria;
    List<Esquadria> listaEsquadria;

    public Esquadria getEsquadria() {
        return esquadria;
    }

    public void setEsquadria(Esquadria esquadria) {
        this.esquadria = esquadria;
    }

    public List<Esquadria> getListaAcessorio() {
        return listaEsquadria;
    }

    public void setListaEsquadria(List<Esquadria> listaEsquadria) {
        this.listaEsquadria = listaEsquadria;
    }

    protected Esquadria getObjetoAt(int rowIndex) {
        return listaEsquadria.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return listaEsquadria.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        String valor = "";

        if (columnIndex == 0) {
            valor = String.valueOf(listaEsquadria.get(rowIndex).getCodigo());
        }

        if (columnIndex == 1) {
            valor = String.valueOf(listaEsquadria.get(rowIndex).getDescricao());
        }

        if (columnIndex == 2) {
            valor = String.valueOf(listaEsquadria.get(rowIndex).getLinha());
        }

        if (columnIndex == 3) {
            valor = String.valueOf(listaEsquadria.get(rowIndex).getLinha());
        }

        if (columnIndex == 4) {
            valor = String.valueOf(listaEsquadria.get(rowIndex).getDesenho());
        }

        if (columnIndex == 5) {
            valor = String.valueOf(listaEsquadria.get(rowIndex).getDescricao());
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
