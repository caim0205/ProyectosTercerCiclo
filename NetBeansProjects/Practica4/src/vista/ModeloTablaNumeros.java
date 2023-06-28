/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import control.listas.ListaEnlazada;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author santiago
 */
public class ModeloTablaNumeros extends AbstractTableModel {

    private ListaEnlazada<Integer> lista = new ListaEnlazada<>();

    @Override
    public int getRowCount() {
        return getLista().size();
    }

    @Override
    public int getColumnCount() {
        return 1;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Integer a = null;
        try {
            a = lista.get(rowIndex);
            switch (columnIndex) {
                case 0:
                    return a;
                default:
                    return null;
            }

        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Numeros";
            default:
                return null;
        }
    }

    /**
     * @return the lista
     */
    public ListaEnlazada<Integer> getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(ListaEnlazada<Integer> lista) {
        this.lista = lista;
    }
}
