/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fechastrabajo;


import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Jose Luis GIl
 */
public class GestionPersona {

    private ArrayList<Persona> personas = new ArrayList<>();
    private ArrayList<String> nombres = new ArrayList<>();
    LecturaArchivo archivo = new LecturaArchivo("src/main/java/fechas/personas_eventos_con_nacimiento.csv");
    OperacionesFechas gFecha = new OperacionesFechas();

    public GestionPersona() {
        setPersonas();
        setNombres();
    }

    public final void setPersonas() {
        int index=0;
        ArrayList<String[]> personasString = archivo.getLineas();
        for (String[] persona : personasString) {
            if(index==0){
                index++;
                continue;
            }
            String nombre = archivo.getNombre(persona);
            LocalDate fechaGrado = gFecha.formatoFechas(archivo.getFechaGrado(persona));
            LocalDate fechaMatrimonio = gFecha.formatoFechas(archivo.getFechaMatrimonio(persona));
            LocalDate fechaLoteria = gFecha.formatoFechas(archivo.getFechaLoteria(persona));
            LocalDate fechaMuerte = gFecha.formatoFechas(archivo.getFechaMuerte(persona));
            boolean estado = archivo.isAlive(persona);
            LocalDate fechaNacimiento = gFecha.formatoFechas(archivo.getFechaNacimiento(persona));
            personas.add(new Persona(nombre, fechaGrado, fechaMatrimonio, fechaLoteria, fechaMuerte, estado, fechaNacimiento));
            index++;
        }
    }

    public final void setNombres() {
        ArrayList<Persona> personass = getPersonas();
        for (Persona persona : personass) {
            String nombre = persona.getNombre();
            nombres.add(nombre);
        }
    }

    public Persona seleccionarPersona(Integer personaIndex) {

        Persona persona = personas.get(personaIndex);
        return persona;
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public ArrayList<String> getNombres() {
        return nombres;
    }

    public int personasNacidasAñoBisiesto() {
        int i = 0;

        for (Persona persona : personas) {

            LocalDate fechaNacimientoj = persona.getFechaNacimiento();
            if (gFecha.esBisiesto(fechaNacimientoj) && gFecha.isBetween(fechaNacimientoj, gFecha.añoInicioSinFormato, gFecha.añoFinSinFormato)) {
                if (gFecha.estaEntreMesDia(fechaNacimientoj)) {
                    i++;
                }
            }
        }
        return i;
    }
}
