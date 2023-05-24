/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.util;

import controlador.listas.ListaEnlazada;
import controlador.listas.NodoLista;
import modelo.Sucursal;
import modelo.Venta;

/**
 *
 * @author santiago
 */
public class Utilidades {
    
    public static void imprimir (ListaEnlazada<Object> lista){
        System.out.println("Lista de: " + lista.getClass().getSimpleName());
        NodoLista<Object> nodo = lista.getCabecera();
        while (nodo != null){
            System.out.println(nodo.getInfo().toString());
            nodo = nodo.getSiguiente();
        }
    }
    
    
    public static Double sumarVentas(Sucursal s){
        ListaEnlazada<Venta> ventas = s.getVentas();
        if(ventas != null){
            Double suma = 0.0;
            NodoLista<Venta> nodo = ventas.getCabecera();
            while (nodo != null){
                Venta venta = nodo.getInfo();
                suma += venta.getValor();
                nodo = nodo.getSiguiente();
            }
            return suma;
        }
        return 0.0;
    }
    
    public static Double mediaVentas(Sucursal s){
        Double suma = sumarVentas(s);
        if(suma == 0){
            return suma;
        }else{
            ListaEnlazada<Venta> ventas = s.getVentas();
            int count = ventas.size();
            return suma /count;
        }
    }
}


