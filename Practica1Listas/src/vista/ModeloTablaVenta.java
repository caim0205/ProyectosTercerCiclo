/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.listas.ListaEnlazada;
import controlador.lista.exception.PosicionException;
import controlador.lista.exception.VacioException;
import javax.swing.table.AbstractTableModel;
import modelo.Venta;

/**
 *
 * @author santiago
 */
public class ModeloTablaVenta extends AbstractTableModel{
    private ListaEnlazada<Venta> listaVentas = new ListaEnlazada<>();
    

    @Override
    public int getRowCount() {
        return 12;
    }

    @Override
    public int getColumnCount() {
        return 2;
    }
    

    @Override
    public Object getValueAt(int i, int i1) {
        try {
            Venta s = listaVentas.getDatos(i); 
            switch(i1){
            case 0: return (s != null) ? s.getMes() : "No definido";
            case 1: return (s != null) ? s.getValor() : 0.0;
            default: return null;
        }
        } catch (PosicionException | VacioException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }
    
     public String getColumnName(int column) {
        switch(column){
            case 0: return "Mes"; 
            case 1: return "Venta Anual";
            default: return null;
        }
    } 

    /**
     * @return the listaVentas
     */
    public ListaEnlazada<Venta> getListaVentas() {
        return listaVentas;
    }

    /**
     * @param listaVentas the listaVentas to set
     */
    public void setListaVentas(ListaEnlazada<Venta> listaVentas) {
        this.listaVentas = listaVentas;
    }
    
    
}
