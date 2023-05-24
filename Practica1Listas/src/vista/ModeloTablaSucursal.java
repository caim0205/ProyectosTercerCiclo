/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.listas.ListaEnlazada;

import controlador.lista.exception.PosicionException;
import controlador.lista.exception.VacioException;
import controlador.util.Utilidades;

import javax.swing.table.AbstractTableModel;
import modelo.Sucursal;

/**
 *
 * @author santiago
 */
public class ModeloTablaSucursal extends AbstractTableModel{
    
    
    private ListaEnlazada<Sucursal> datos = new ListaEnlazada<>();
    private int columnas =3;

    
   
    public ListaEnlazada<Sucursal> getDatos() {
        return datos;
    }

    /**
     * @param datos the datos to set
     */
    public void setDatos(ListaEnlazada<Sucursal> datos) {
        this.datos = datos;
    }

    @Override
    public int getColumnCount() {
        return 3;
    }
    @Override
    public int getRowCount(){
        return getDatos().size();
    }
   
  
    @Override
    public Object getValueAt(int i, int i1) {
       
        try {
            Sucursal s = datos.getDatos(i);
            s = datos.getDatos(i);
            switch(i1){
            case 0: return (s != null) ? s.getNombre() : "NO DEFINIDO" ; //Operador ternario
            case 1: return (s != null) ? Utilidades.sumarVentas(s) : 0.0;
            case 2: return (s != null) ? Utilidades.mediaVentas(s) : 0.0;
            default:return null;
        }
        } catch (PosicionException | VacioException e) {
            System.out.println(e.getMessage());
        }
        return null;
       
        
        
    }

    @Override
    public String getColumnName(int column) {
        
         switch(column){
            case 0: return "SUCURSAL";
            case 1: return "VENTA ANUAL";
            case 2: return "VENTA PROMEDIO";
            default:return null;
    
            // Ver el nombre de las columnas
         }
    }

   
    
}
