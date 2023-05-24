/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author santiago
 */
public class Venta {
    
    private Integer id;
    private Double valor;
    private EnumMes mes;
    
    @Override
    public String toString(){
        return getMes().toString()+" "+getValor();
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the valor
     */
    public Double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(Double valor) {
        this.valor = valor;
    }

    /**
     * @return the mes
     */
    public EnumMes getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(EnumMes mes) {
        this.mes = mes;
    }


}
