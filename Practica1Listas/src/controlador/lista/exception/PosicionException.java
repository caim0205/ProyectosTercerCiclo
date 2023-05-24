/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.lista.exception;

/**
 *
 * @author santiago
 */
public class PosicionException extends Exception {
    
    public PosicionException() {
        super ("No existe la posicion");
    }

    public PosicionException(String msg) {
        super(msg);
    }
}
