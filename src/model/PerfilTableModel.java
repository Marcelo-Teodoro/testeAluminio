package model;

import javax.swing.table.AbstractTableModel;
import classe.Perfil;
import java.util.List;

public class PerfilTableModel extends AbstractTableModel {

        Perfil perfil;
        List<Perfil> listaPerfil;

        public Perfil getPerfil() {
            return perfil;
        }

        public void setPerfil(Perfil perfil) {
            this.perfil = perfil;
        }

        public List<Perfil> getListaPerfil() {
            return listaPerfil;
        }

        public void setListaPerfil(List<Perfil> listaPerfil) {
            this.listaPerfil = listaPerfil;
        }

        protected Perfil getObjetoAt(int rowIndex) {
            return listaPerfil.get(rowIndex);
        }

        @Override
        public int getRowCount() {
            return listaPerfil.size();
        }

        @Override
        public int getColumnCount() {
            return 7;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {

            String valor = "";

            if (columnIndex == 0) {
                valor = String.valueOf(listaPerfil.get(rowIndex).getCodigo());
            }

            if (columnIndex == 1) {
                valor = String.valueOf(listaPerfil.get(rowIndex).getFornecedor().getEmpresa());
            }

            if (columnIndex == 2) {
                valor = String.valueOf(listaPerfil.get(rowIndex).getTipo());
            }

            if (columnIndex == 3) {
                valor = String.valueOf(listaPerfil.get(rowIndex).getPeso());
            }

            if (columnIndex == 4) {
                valor = String.valueOf(listaPerfil.get(rowIndex).getTamanho());
            }

            if (columnIndex == 5) {
                valor = String.valueOf(listaPerfil.get(rowIndex).getDescricao());
            }

            if (columnIndex == 6) {
                valor = String.valueOf(listaPerfil.get(rowIndex).getFornecedor().getValorPesoAluminio());
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
                valor = "Tipo";
            }

            if (column == 3) {
                valor = "Peso";
            }

            if (column == 4) {
                valor = "Tamanho";
            }

            if (column == 5) {
                valor = "Descrição";
            }

            if (column == 6) {
                valor = "Valor Alumínio";
            }

            return valor;
        }

}
