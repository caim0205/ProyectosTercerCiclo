/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import controlador.listas.ListaEnlazada;

/**
 *
 * @author santiago
 */
public class Sucursal {
    
     
    private Integer id;
    private String nombre;
    private ListaEnlazada<Venta> ventas; 
   
    
    @Override
    public String toString(){
        return getNombre()+"  "+getId();
    }
    
    
    public Integer getId() {
        return id;
    }

    
    public void setId(Integer id) {
        this.id = id;
    }

    
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the ventas
     */
    public ListaEnlazada<Venta> getVentas() {
        return ventas;
    }

    /**
     * @param ventas the ventas to set
     */
    public void setVentas(ListaEnlazada<Venta> ventas) {
        this.ventas = ventas;
    }
    
}