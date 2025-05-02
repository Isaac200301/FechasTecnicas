/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fechastrabajo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;



public class LecturaArchivo {

    private final String path;
    private ArrayList<String[]> lineas = new ArrayList<>();
    private ArrayList<String> nombres = new ArrayList<>();
    

    public LecturaArchivo(String path) {
        this.path = path;
        setLineas();
        setNombres();
    }

    public final void setLineas() {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] lineaj = linea.split(",");
                lineas.add(lineaj);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public ArrayList<String[]> getLineas() {
        return lineas;
    }

    public final void setNombres() {
        ArrayList<String[]> lineasLista = getLineas();
        for (String[] linea : lineasLista) {
            nombres.add(linea[0]); //linea[0] == Nombre
        }
    }

    public ArrayList<String> getNombres() {
        return nombres;
    }

    public String[] seleccionarPersona(Integer personaIndex) {

        ArrayList<String[]> personas = getLineas();
        String[] persona = personas.get(personaIndex);
        return persona;
    }

    public String getNombre(String[] persona) {
        System.out.println(persona[0]);
        return persona[0];
    }

    public String getFechaGrado(String[] persona) {
        System.out.println(persona[1]);
        return persona[1];
    }

    public String getFechaMatrimonio(String[] persona) {
        System.out.println(persona[2]);
        return persona[2];
    }

    public String getFechaLoteria(String[] persona) {
        System.out.println(persona[3]);
        return persona[3];
    }

    public String getFechaMuerte(String[] persona) {
        System.out.println(persona[4]);
        return persona[4];
    }

    public boolean isAlive(String[] persona) {
        return "Vivo".equals(persona[5]);
    }

    public String getFechaNacimiento(String[] persona) {
        System.out.println(persona[6]);
        return persona[6];
    }

    
}
