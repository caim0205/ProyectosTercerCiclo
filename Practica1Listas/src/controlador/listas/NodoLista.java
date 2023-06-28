/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.listas;

/**
 *
 * @author santiago
 */
public class NodoLista <T>{
     private T info;
    private NodoLista siguiente;

    public NodoLista() {
        info = null;
        siguiente = null;
    }

    public NodoLista(T info, NodoLista siguiente) {
        this.info = info;
        this.siguiente = siguiente;
    }
    
    

    /**
     * @return the info
     */
    public T getInfo() {
        return info;
    }

    /**
     * @param info the info to set
     */
    public void setInfo(T info) {
        this.info = info;
    }

    /**
     * @return the siguiente
     */
    public NodoLista getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoLista siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
}
