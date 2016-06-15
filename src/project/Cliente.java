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
public class Cliente extends Persona{
    private int telefono;
    private Contacto[] contactos = new Contacto[2];

    public Cliente(String tipoDocumento, int numeroIdentificacion, String nombres, String apellidos,int telefono,Contacto[] contactos) {
        super(tipoDocumento, numeroIdentificacion, nombres, apellidos);
        this.telefono=telefono;
        this.contactos=contactos;
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the contactos
     */
    public Contacto[] getContactos() {
        return contactos;
    }

    /**
     * @param contactos the contactos to set
     */
    public void setContactos(Contacto[] contactos) {
        this.contactos = contactos;
    }

}
