/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.ArrayList;

/**
 *
 * @author Jhordy
 */
public class Solicitud {
    
    private Cliente cliente;
    private String mensajeNegacion;
    private static int numeroAutorizacion;
    
    public Solicitud(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void validar(){
        if(validarClienteListaExterna())mensajeNegacion="Pertenece a lista externa";
        else if(validarClienteListaInterna()) mensajeNegacion="Pertenece a lista interna";
        else if(validarContactosAmbasListas()) mensajeNegacion="Referido en listas negras";
        else numeroAutorizacion++;
    }
    
    public boolean validarClienteListaExterna(){
       return Algoritmo.filtroAlgoritmoFonetico(cliente.getNombres(), cliente.getApellidos(),0.8);
    }
    
    public boolean validarClienteListaInterna(){
        return false;
    }
    
    public boolean validarContactosAmbasListas(){
        return false;
    }
    
    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the mensajeNegacion
     */
    public String getMensajeNegacion() {
        return mensajeNegacion;
    }

    /**
     * @param mensajeNegacion the mensajeNegacion to set
     */
    public void setMensajeNegacion(String mensajeNegacion) {
        this.mensajeNegacion = mensajeNegacion;
    }

    /**
     * @return the numeroAutorizacion
     */
    public int getNumeroAutorizacion() {
        return numeroAutorizacion;
    }
}
