/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fechastrabajo;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Jose Luis GIl
 */
public class OperacionesFechas {

    LocalDate fechaHoy = LocalDate.now();
    MonthDay inicio = MonthDay.of(8, 10);
    MonthDay fin = MonthDay.of(8, 20);
    LocalDate añoInicioSinFormato = LocalDate.of(1970, 1, 1);
    LocalDate añoFinSinFormato = LocalDate.of(1985, 8, 20);
    String añoInicio = "" + añoInicioSinFormato + "";
    String añoFin = "" + añoFinSinFormato + "";

    public OperacionesFechas() {

    }

    public LocalDate formatoFechas(String fecha) {
        if (fecha.equals(" ")) {
            return null;
        }else{
        DateTimeFormatter formatoParaParsear = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaParseada = LocalDate.parse(fecha, formatoParaParsear);
        return fechaParseada;
        }
    }

    public long daysBetween(LocalDate fecha, LocalDate fecha1) {

        long dias = ChronoUnit.DAYS.between(fecha1, fecha);
        System.out.println("Días entre las fechas: " + dias);
        return dias;
    }

    public long monthsBetween(LocalDate fecha, LocalDate fecha1) {

        long meses = ChronoUnit.MONTHS.between(fecha1, fecha);
        System.out.println("Meses entre las fechas: " + meses);
        return meses;
    }

    public long yearsBetween(LocalDate fecha, LocalDate fecha1) {
        long años = ChronoUnit.YEARS.between(fecha1, fecha);
        System.out.println("Años entre las fechas: " + años);
        return años;
    }

    public long secondsBetween(LocalDate fecha, LocalDate fecha1) {
        LocalDateTime dateTime1 = fecha1.atStartOfDay();
        LocalDateTime dateTime2 = fecha.atStartOfDay();

        long segundos = ChronoUnit.SECONDS.between(dateTime1, dateTime2);
        System.out.println("Segundos entre las fechas: " + segundos);
        return segundos;
    }


    public boolean esBisiesto(LocalDate fecha) {
        return fecha.isLeapYear();
    }

    public boolean isBetween(LocalDate fecha, LocalDate inicio, LocalDate fin) {
        return (fecha.isEqual(inicio) || fecha.isAfter(inicio))
                && (fecha.isEqual(fin) || fecha.isBefore(fin));
    }

    public boolean estaEntreMesDia(LocalDate fecha) {
        MonthDay actual = MonthDay.from(fecha);
        if (inicio.isBefore(fin) || inicio.equals(fin)) {
            return (actual.equals(inicio) || actual.isAfter(inicio))
                    && (actual.equals(fin) || actual.isBefore(fin));
        } else {
            // Rango cruza el cambio de año (ej. del 15/12 al 15/02)
            return actual.isAfter(inicio) || actual.isBefore(fin) || actual.equals(inicio) || actual.equals(fin);
        }
    }

}
