/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Jhordy
 */
public class Programa {
    
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        System.out.println(Algoritmo.algoritmoFonetico("chino"));
        
        /*boolean seguir=true;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(seguir){
            //Pedir datos obligatorios
            String[] datosCliente = new String[15];

            System.out.println("\nIngrese los datos personales\n");

            System.out.print("Tipo de documento: ");datosCliente[0]=br.readLine();
            System.out.print("Número de identificación: ");datosCliente[1]=br.readLine();
            System.out.print("Nombres: ");datosCliente[2]=br.readLine();
            System.out.print("Apellidos: ");datosCliente[3]=br.readLine();
            System.out.print("Telefono: ");datosCliente[4]=br.readLine();

            System.out.println("\nIngrese los datos del primer contacto\n");

            System.out.print("Nombres: ");datosCliente[5]=br.readLine();
            System.out.print("Apellidos: ");datosCliente[6]=br.readLine();
            System.out.print("Tipo de relación (familiar/personal): ");datosCliente[7]=br.readLine();
            System.out.print("Tipo de documento: ");datosCliente[8]=br.readLine();
            System.out.print("Número de identificación: ");datosCliente[9]=br.readLine();

            System.out.println("\nIngrese los datos del segundo contacto\n");

            System.out.print("Nombres: ");datosCliente[10]=br.readLine();
            System.out.print("Apellidos: ");datosCliente[11]=br.readLine();
            System.out.print("Tipo de relación (familiar/personal): ");datosCliente[12]=br.readLine();
            System.out.print("Tipo de documento: ");datosCliente[13]=br.readLine();
            System.out.print("Número de identificación: ");datosCliente[14]=br.readLine();

            //Crear cliente,contactos de este y solicitud de validacion
            Contacto cont1 = new Contacto(datosCliente[8],Integer.parseInt(datosCliente[9]),datosCliente[5],datosCliente[6],datosCliente[7]);
            Contacto cont2 = new Contacto(datosCliente[13],Integer.parseInt(datosCliente[14]),datosCliente[10],datosCliente[11],datosCliente[12]);
            Contacto[] contactos = {cont1,cont2};
            Solicitud solicitud = new Solicitud(new Cliente(datosCliente[0],Integer.parseInt(datosCliente[1]),datosCliente[2],datosCliente[3], Integer.parseInt(datosCliente[4]),contactos));
            solicitud.validar();
            if (solicitud.getMensajeNegacion()==null)System.out.println("Numero de autorización: , "+solicitud.getNumeroAutorizacion());
            else System.out.println("Se rechaza!!!, "+solicitud.getMensajeNegacion());
            System.out.print("Deseas continuar validando ingreso de nuevos?(si/no): ");seguir=br.readLine().equals("si");
        }*/
    }
}
