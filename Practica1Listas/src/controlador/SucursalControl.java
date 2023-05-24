/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

//import controlador.exception.EspacioException;

import controlador.listas.ListaEnlazada;
import controlador.listas.NodoLista;
import controlador.lista.exception.EspacioException;
import modelo.EnumMes;
import modelo.Sucursal;
import modelo.Venta;

/**
 *
 * @author santiago
 */
public class SucursalControl {
    
    private ListaEnlazada <Sucursal> sucursales;
    private Venta venta;
    private Sucursal sucursal;

    public SucursalControl() {
        sucursales = new ListaEnlazada<>();
        this.sucursal = new Sucursal();
        inicializarVentas();
        
    }
    
    /**
     * @return the sucursales
     */
    public ListaEnlazada <Sucursal> getSucursales() {
        return sucursales;
    }

    /**
     * @param sucursales the sucursales to set
     */
    public void setSucursales(ListaEnlazada <Sucursal> sucursales) {
        this.sucursales = sucursales;
    }

    /**
     * @return the venta
     */
    public Venta getVenta() {
        return venta;
    }

    /**
     * @param venta the venta to set
     */
    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    /**
     * @return the sucursal
     */
    public Sucursal getSucursal() {
         if(sucursal == null){
            sucursal = new Sucursal();
        }return sucursal;
    }

    /**
     * @param sucursal the sucursal to set
     */
    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }
    
    public void inicializarVentas (){
        ListaEnlazada <Venta> listaVentas = new ListaEnlazada<>();
        this.sucursal.setVentas(listaVentas);
    }
}