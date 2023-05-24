/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.dao;

import controlador.dao.Conexion.Conexion;
import controlador.listas.ListaEnlazada;
import controlador.lista.exception.PosicionException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.jboss.logging.Logger;

/**
 *
 * @author santiago
 */
public class AdaptadorDao <E>  {
   
    private Conexion conexion;
    private Class clazz;
    private String url;

    public AdaptadorDao(Class clazz) {
        this.conexion = new Conexion();
        this.clazz = clazz;
        this.url = Conexion.URL+clazz.getSimpleName().toLowerCase()+".json";
    }

    public void guardar(E obj) throws IOException {
        ListaEnlazada<E> lista = listar();
        lista.insertar(obj);
        conexion.getXstream().alias(lista.getClass().getName(), ListaEnlazada.class);   
        conexion.getXstream().toXML(lista, new FileWriter(url));
    }

    public void modificar(E obj, Integer pos) {
        ListaEnlazada<E> lista = listar();
        try {
            lista.insertarPosicion(obj, pos);
            conexion.getXstream().alias(lista.getClass().getName(), ListaEnlazada.class);   
            conexion.getXstream().toXML(lista, new FileWriter(url));
        } catch (PosicionException | IOException ex) {
            Logger.getLogger(ex.getMessage());
        } 
    }

    public ListaEnlazada listar() {
        ListaEnlazada<E> lista = new ListaEnlazada<>();
        try {
            lista = (ListaEnlazada<E>)conexion.getXstream().fromXML(new File(url));
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return lista;
    }

    public E obtener(Integer id) {
        ListaEnlazada<E> lista = listar();
        return (E) lista;
    }
    
}
