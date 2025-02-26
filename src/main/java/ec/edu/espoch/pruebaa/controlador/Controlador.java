/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.pruebaa.controlador;

import ec.edu.espoch.pruebaa.modelo.GestionarPersona;
import ec.edu.espoch.pruebaa.modelo.Persona;
import ec.edu.espoch.pruebaa.vista.Lista;
import ec.edu.espoch.pruebaa.vista.Vista;

/**
 *
 * @author PERSONAL
 */
public class Controlador {
    
    private Vista vista;
    private GestionarPersona gestionarPersona;
    private Lista lista;

    public Controlador(Vista vista, GestionarPersona gestionarPersona, Lista lista) {
        this.vista = vista;
        this.gestionarPersona = gestionarPersona;
        this.lista = lista;
    }
    
    
    public void agregarpersona (){
        
        try {
           if (this.vista != null){
               Persona objPersona = new Persona();
                objPersona.setNombre(this.vista.Nombre());
                objPersona.setApellido(this.vista.getApellido());
                objPersona.setEdad(this.vista.getEdad());
                String msm = gestionarPersona.agregarPersona(objPersona);
                vista.error(msm);
           }
        } catch (Exception e) {
        }
    }
    
     public void listapersona() {

        try {
            String msm = "";
            Persona[] Lista = new Persona[5];
            Lista = gestionarPersona.listapersona();
            if (Lista != null) {
                String lista = "";
                for (int i = 0; i < Lista.length; i++) {
                    if (Lista[i] != null) {
                        lista = lista + "edad:" + Lista[i].getEdad() + "\n"
                                + "Nombre:" + Lista[i].getNombre()+ "\n"
                                + "Apellido:" + Lista[i].getApellido()+ "\n";
                               
                    }
                }
                msm = lista;
            } else {
                msm = "No hay lista que mostrar";
            }
            lista.mostrarlista(msm);

        } catch (Exception e) {
            System.out.println("Error Controlador-listarTarea: " + e);
        }
    }
}
   
    
}
