/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.ArrayList;

/**
 *
 * @author pc57
 */
public class SujetoExterna extends Persona{
    private ArrayList<String> alias;
    
    public SujetoExterna(String tipoDocumento, int numeroIdentificacion, String nombres, String apellidos,ArrayList<String> alias){
        super(null,0, nombres, apellidos);
        this.alias=alias;
    }

    /**
     * @return the alias
     */
    public ArrayList<String> getAlias() {
        return alias;
    }

    /**
     * @param alias the alias to set
     */
    public void setAlias(ArrayList<String> alias) {
        this.alias = alias;
    }
    
}
