/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.listas;

import controlador.lista.exception.PosicionException;
import controlador.lista.exception.VacioException;

/**
 *
 * @author santiago
 */
public class ListaEnlazada <T>{
     private NodoLista<T> cabecera;
    private Integer size = 0;

    /**
     * @return the cabecera
     */
    public NodoLista<T> getCabecera() {
        return cabecera;
    }

    /**
     * @param cabecera the cabecera to set
     */
    public void setCabecera(NodoLista<T> cabecera) {
        this.cabecera = cabecera;
    }
    
     public boolean isEmpty() {
        return cabecera == null;
    }

    public void insertar(T info) {
        NodoLista<T> nuevo = new NodoLista<>(info, null);
        if (isEmpty()) {
            this.cabecera = nuevo;
            this.size++;
        } else {
            NodoLista<T> aux = cabecera;
            while (aux.getSiguiente()!= null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            this.size++;
        }
    }
    
     public void insertarInicio(T info) {
        if (isEmpty()) {
            insertar(info);
        } else {
            NodoLista<T> nuevo = new NodoLista<>(info, null);
            nuevo.setSiguiente(cabecera);
            cabecera = nuevo;
            size++;
        }
    }
     
     public void insertarPosicion(T info, Integer pos) throws PosicionException {
        if (isEmpty()) {
            insertar(info);
        } else if (pos >= 0 && pos == 0) {
            insertar(info);
        } else if (pos >= 0 && pos < size()) {
            NodoLista<T> nuevo = new NodoLista<>(info, null);
           NodoLista<T> aux = cabecera;
            for (int i = 0; i < (pos - 1); i++) {
                aux = aux.getSiguiente();
            }
            NodoLista<T> sig = aux.getSiguiente();
            aux.setSiguiente(nuevo);
            nuevo.setSiguiente(sig);
            size++;
        } else {
            throw new PosicionException();
        }
    }
   
    public T getDatos (Integer pos) throws VacioException, PosicionException{
        if (isEmpty()) {
            throw new VacioException();
        } else {
            T dato = null;
            if (pos >= 0 && pos < size()) {
                if (pos == 0) {
                    dato = cabecera.getInfo();
                } else {
                    NodoLista<T> aux = cabecera;
                    for (int i = 0; i < (pos); i++) {
                        aux = aux.getSiguiente();
                    }
                    dato = aux.getInfo();
                }
            } else {
                throw new PosicionException();
            }
            return dato;
        }
    }
    
    public void modificar(T info, Integer pos) throws PosicionException {
        NodoLista<T> aux = cabecera;
        int indice = 0;

        while (aux != null) {
            if (indice == pos) {
                aux.setInfo(info);
                break;
            }
            aux = aux.getSiguiente();
            indice++;
        }
    }
    
    
    
    public int size(){
        return size;
    }
    
    public void imprimir() throws VacioException {
        if (isEmpty()) {
            throw new VacioException();
        } else {
            NodoLista<T> aux = cabecera;
            System.out.println("-----LISTA-----");
            for (int i = 0; i < size(); i++) {
                System.out.println(aux.getInfo() + "   ");
                aux = aux.getSiguiente();
            }
            System.out.println("-----LISTA FIN-----");
        }
    }
    
    public T borrar(Integer pos) throws PosicionException, VacioException {
    if (isEmpty()) {
        throw new VacioException();
    } else {
        T dato = null;
        if (pos >= 0 && pos < size()) {
            if (pos == 0) {
                dato = cabecera.getInfo();
                cabecera = cabecera.getSiguiente();
                size--;
            } else {
                NodoLista<T> aux = cabecera;
                for (int i = 0; i < (pos - 1); i++) {
                    aux = aux.getSiguiente();
                }
                NodoLista<T> nodoEliminar = aux.getSiguiente();
                dato = nodoEliminar.getInfo();
                aux.setSiguiente(nodoEliminar.getSiguiente());
                size--;
            }
        } else {
            throw new PosicionException();
        }
        return dato;
        }
    }
    
    public void deleteAll(){
        this.cabecera = null;
    }
    
    
    
    
}
