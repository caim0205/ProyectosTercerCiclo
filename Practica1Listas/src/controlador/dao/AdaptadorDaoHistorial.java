/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.dao;

import controlador.dao.Conexion.Conexion;
import controlador.lista.cola.Cola;
import controlador.lista.exception.PosicionException;
import controlador.lista.exception.TopeException;
import controlador.lista.exception.VacioException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author santiago
 */
public class AdaptadorDaoHistorial <E>{
    
    private Conexion conexion;
    private Class clazz;
    private String url;

    public AdaptadorDaoHistorial(Class clazz) {
        this.conexion = new Conexion();
        this.clazz = clazz;
        this.url = conexion.URL+clazz.getSimpleName().toLowerCase()+".json";
    }
    
    public void guardarCola(Cola<E> cola) throws IOException{
        conexion.getXstream().alias(cola.getClass().getName(), Cola.class);
        conexion.getXstream().toXML(cola, new FileWriter(url));
        
    }
    
   public void guardar(E obj) throws IOException, TopeException{
       Cola<E> cola = listar();
       cola.queue(obj);
       conexion.getXstream().alias(cola.getClass().getName(), Cola.class);
       conexion.getXstream().toXML(cola, new FileWriter(url));
       
   }
    
   public Cola listar(){
       Cola<E> cola = new Cola<>(20);
       try {
           cola = (Cola<E>)conexion.getXstream().fromXML(new File(url));
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }
        return cola;
   }
    
   public void borrar(E obj) throws IOException,TopeException, VacioException, PosicionException{
       Cola<E> cola = listar();
       cola.dequeue();
       conexion.getXstream().alias(cola.getClass().getName(), Cola.class);
       conexion.getXstream().toXML(cola, new FileWriter(url));
   }
}
