/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.pruebaa.modelo;

/**
 *
 * @author PERSONAL
 */
public class GestionarPersona {
    int tamanoVector = 5;
    Persona[] persona = new Persona[tamanoVector];
    int cont = 0;
    
}

 public String agregarPersona(Persona lista) {
        String msg = "Persona Agregado";
        if (persona.length != cont) {
            for (int i = 0; i < persona.length; i++) {
                if (persona[i] == null) {
                    persona[i] = new Persona();
                    persona[i].seteEdad(i);
                    persona[i].setNombre(tarea.getNombre());
                    persona[i].setApellido(tarea.getApellido());
                   cont++;
                     
                    return msg;
                }
            }
        } else {
                msg = "Ingreso no permitido";
        }
        return msg;
    }

 public Persona[] listaPersona(){

 Persona[] auxLista = new Persona[tamanoVector];
        for (int i = 0; i < cont; i++) {
            auxLista[i] = new Persona();
            auxLista[i].setId(persona[i].getEdad());
            auxLista[i].setNombre(persona[i].getNombre());
            auxLista[i].setApelldio(persona[i].getApellido());
          
            System.out.println("Modelo-listapersona" + auxLista[i].getEstado());
        }
        return auxLista;

}

}