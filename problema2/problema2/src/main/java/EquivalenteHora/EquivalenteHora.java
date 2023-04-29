/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EquivalenteHora;

/**
 *
 * @author PC
 */
public class EquivalenteHora {
     private double horas;
     private double minutos;
     private double segundos;
     private double dias;

    public double PresentarSegundos() {
        return segundos;
    }

    public void CalcularSegundos() {
        segundos = minutos * 60;
    }

    public double PresentarHoras() {
        return horas;
    }

    public void CalcularHoras() {
        horas = minutos/60;
    }

    public double getMinutos() {
        return minutos;
    }

    public void setMinutos(double minutos) {
        this.minutos = minutos;
    }

    public double PresentarDias() {
        return dias;
    }

    public void CalcularDias() {
        double resultado = minutos * 0.000694444;
        double redondeado = Math.round(resultado * 100.0) / 100.0;
        dias = redondeado;
    }

}
