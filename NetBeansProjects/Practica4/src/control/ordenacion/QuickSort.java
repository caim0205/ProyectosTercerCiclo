/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control.ordenacion;

import control.listas.ListaEnlazada;
import control.listas.exception.PosicionException;
import control.listas.exception.VacioException;

/**
 *
 * @author santiago
 */
public class QuickSort<E extends Comparable<E>> {

    public void quickSort(ListaEnlazada<E> lista, boolean ascendente) throws VacioException, PosicionException {
        int tamaño = lista.getSize();
        quickSortRec(lista, 0, tamaño - 1, ascendente);
    }

    private void quickSortRec(ListaEnlazada<E> lista, int bajo, int alto, boolean ascendente)
            throws VacioException, PosicionException {
        if (bajo < alto) {
            int indicePivote = particion(lista, bajo, alto, ascendente);
            quickSortRec(lista, bajo, indicePivote - 1, ascendente);
            quickSortRec(lista, indicePivote + 1, alto, ascendente);
        }
    }

    private int particion(ListaEnlazada<E> lista, int bajo, int alto, boolean ascendente)
            throws VacioException, PosicionException {
        E pivote = lista.get(alto);
        int i = bajo - 1;

        for (int j = bajo; j < alto; j++) {
            int resultadoComparacion = ascendente ? lista.get(j).compareTo(pivote) : pivote.compareTo(lista.get(j));
            if (resultadoComparacion >= 0) {
                i++;
                intercambiar(lista, i, j);
            }
        }

        intercambiar(lista, i + 1, alto);
        return i + 1;
    }

    private void intercambiar(ListaEnlazada<E> lista, int i, int j) throws VacioException, PosicionException {
        E temp = lista.get(i);
        lista.modificar(lista.get(j), i);
        lista.modificar(temp, j);
    }
}
