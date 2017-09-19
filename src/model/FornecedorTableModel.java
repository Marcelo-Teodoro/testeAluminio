package model;

import classe.Fornecedor;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class FornecedorTableModel extends AbstractTableModel {

        Fornecedor fornecedor;
        List<Fornecedor> listaFornecedor;

        public Fornecedor getFornecedor() {
            return fornecedor;
        }

        public void setFornecedor(Fornecedor fornecedor) {
            this.fornecedor = fornecedor;
        }

        public List<Fornecedor> getListaFornecedor() {
            return listaFornecedor;
        }

        public void setListaFornecedor(List<Fornecedor> listaFornecedor) {
            this.listaFornecedor = listaFornecedor;
        }

        protected Fornecedor getObjetoAt(int rowIndex) {
            return listaFornecedor.get(rowIndex);
        }

        @Override
        public int getRowCount() {
            return listaFornecedor.size();
        }

        @Override
        public int getColumnCount() {
            return 4;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {

            String valor = "";

            if (columnIndex == 0) {
                valor = String.valueOf(listaFornecedor.get(rowIndex).getEmpresa());
            }

            if (columnIndex == 1) {
                valor = String.valueOf(listaFornecedor.get(rowIndex).getTelefone());
            }

            if (columnIndex == 2) {
                valor = String.valueOf(listaFornecedor.get(rowIndex).getEmail());
            }

            if (columnIndex == 3) {
                valor = String.valueOf(listaFornecedor.get(rowIndex).getObservacao());
            }

            return valor;
        }

        public String getColumnName(int column) {

            String valor = "";

            if (column == 0) {
                valor = "Empresa / Fornecedor";
            }

            if (column == 1) {
                valor = "Telefone";
            }

            if (column == 2) {
                valor = "Email";
            }

            if (column == 3) {
                valor = "Observação";
            }

            return valor;
        }

}
