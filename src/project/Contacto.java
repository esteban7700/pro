/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Jhordy
 */
public class Contacto extends Persona{
    private String tipoRelacion;

    public Contacto(String tipoDocumento,int numeroIdentificacion,String nombres,String apellidos,String tipoRelacion) {
        super(tipoDocumento,numeroIdentificacion,nombres,apellidos);
        this.tipoRelacion = tipoRelacion;
    }

    /**
     * @return the tipoRelacion
     */
    public String getTipoRelacion() {
        return tipoRelacion;
    }

    /**
     * @param tipoRelacion the tipoRelacion to set
     */
    public void setTipoRelacion(String tipoRelacion) {
        this.tipoRelacion = tipoRelacion;
    }
    
}
