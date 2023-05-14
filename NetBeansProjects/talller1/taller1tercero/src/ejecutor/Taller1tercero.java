/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejecutor;

import controlador.SucursalControl;
import controlador.ed.lista.ListaEnlazada;
import controlador.ed.lista.exception.PosicionException;
import controlador.ed.lista.exception.VacioException;
import controlador.util.Utilidades;
import modelo.Sucursal;

/**
 *
 * @author caim
 */
public class Taller1tercero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ListaEnlazada<Sucursal> lista = new  ListaEnlazada<>();
        try {
            Sucursal s1 = new Sucursal();
            s1.setId(lista.size()+1);
            s1.setNombre("Alice");
            lista.insertar(s1);
            lista.imprimir();
            s1 = new Sucursal();
            s1.setId(lista.size()+1);
            s1.setNombre("Santiago");
            
            lista.insertarPosicion(s1, 0);
            lista.imprimir();
            lista.deleteAll();
            
            /*
            lista.insertar("Marilyn");
            lista.insertar("Luis");
            lista.insertarInicio("Juan");
            lista.insertarPosicion("Alice", 2);
            lista.imprimir();
            System.out.println("Eliminar");
            System.out.println(lista.delete(0));
          */  
            
        } catch (VacioException ex) {
            System.out.println(ex.getMessage());
            
        }catch(PosicionException ex){
            System.out.println(ex.getMessage());
        }
        
        
    }

}
        /*
        SucursalControl sc = new SucursalControl();

        try {

            sc.getSucursal().setId(1);
            sc.getSucursal().setNombre("Marylin");
            sc.registrar();

            sc.guardarVentas(0, 10.7);
            sc.guardarVentas(1, 10.7);
            sc.guardarVentas(2, 10.7);
            sc.guardarVentas(3, 10.7);
            sc.guardarVentas(4, 10.7);
            sc.guardarVentas(5, 10.7);
            sc.guardarVentas(6, 10.7);
            sc.guardarVentas(7, 10.7);
            sc.guardarVentas(8, 10.7);
            sc.guardarVentas(9, 10.7);
            sc.guardarVentas(10, 10.7);
            sc.guardarVentas(11, 10.7);
            
            Utilidades.imprimir(sc.getSucursal().getVentas());
                 
            sc.setSucursal(null);

            
            sc.getSucursal().setId(2);
            sc.getSucursal().setNombre("Sandra");
            sc.registrar();
            
            sc.guardarVentas(0, 12.5);
            sc.guardarVentas(1, 12.5);
            sc.guardarVentas(2, 12.5);
            sc.guardarVentas(3, 12.5);
            sc.guardarVentas(4, 12.5);
            sc.guardarVentas(5, 12.5);
            sc.guardarVentas(6, 12.5);
            sc.guardarVentas(7, 12.5);
            sc.guardarVentas(8, 12.5);
            sc.guardarVentas(9, 12.5);
            sc.guardarVentas(10, 12.5);
            sc.guardarVentas(11, 12.5);
            
            Utilidades.imprimir(sc.getSucursal().getVentas());
            
            sc.setSucursal(null);
           
            sc.getSucursal().setId(3);
            sc.getSucursal().setNombre("Alicia");
            sc.registrar();
            
            sc.guardarVentas(0, 10.3);
            sc.guardarVentas(1, 10.3);
            sc.guardarVentas(2, 10.3);
            sc.guardarVentas(3, 10.3);
            sc.guardarVentas(4, 10.3);
            sc.guardarVentas(5, 10.3);
            sc.guardarVentas(6, 10.3);
            sc.guardarVentas(7, 10.3);
            sc.guardarVentas(8, 10.3);
            sc.guardarVentas(9, 10.3);
            sc.guardarVentas(10, 10.3);
            sc.guardarVentas(11, 10.3);
            
            Utilidades.imprimir(sc.getSucursal().getVentas());
            
            sc.setSucursal(null);

            
            sc.getSucursal().setId(4);
            sc.getSucursal().setNombre("Juan");
            sc.registrar();
            sc.guardarVentas(0, 7.4);
            sc.guardarVentas(1, 7.4);
            sc.guardarVentas(2, 7.4);
            sc.guardarVentas(3, 7.4);
            sc.guardarVentas(4, 7.4);
            sc.guardarVentas(5, 7.4);
            sc.guardarVentas(6, 7.4);
            sc.guardarVentas(7, 7.4);
            sc.guardarVentas(8, 7.4);
            sc.guardarVentas(9, 7.4);
            sc.guardarVentas(10, 7.4);
            sc.guardarVentas(11, 7.4);

            Utilidades.imprimir(sc.getSucursal().getVentas());
            Utilidades.imprimir(sc.getSucursales());
            
            sc.setSucursal(null);
            
        } catch (Exception e) {

            System.out.println("Error " + e.getMessage());
            //Utilidades.imprimir(sc.getSucursales());
            
            // git clone para clonar el respositorio de 
            //git add .
            //git commit -am '  '
            
            
            // hacer los requerimientos en lenguaje natural "de que queremos hacer"
            
            //Psar a un TDA 
            //crear el git en grpo para ir subiendo todo
            //repositorios sin espacio, tildes, enie
            //manejar json y descargar
            //manejar xstream 
            
        }
*/
  
