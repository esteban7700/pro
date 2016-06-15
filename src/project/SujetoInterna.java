/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author pc57
 */
public class SujetoInterna extends Persona{
    private String motivoDeBloqueo;
    
    public SujetoInterna(String tipoDocumento, int numeroIdentificacion, String nombres, String apellidos,String motivoDeBloqueo) {
        super(tipoDocumento, numeroIdentificacion, nombres, apellidos);
        this.motivoDeBloqueo=motivoDeBloqueo;
    }

    /**
     * @return the motivoDeBloqueo
     */
    public String getMotivoDeBloqueo() {
        return motivoDeBloqueo;
    }

    /**
     * @param motivoDeBloqueo the motivoDeBloqueo to set
     */
    public void setMotivoDeBloqueo(String motivoDeBloqueo) {
        this.motivoDeBloqueo = motivoDeBloqueo;
    }
}
