/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Ejecutor;

import java.util.Scanner;
import EquivalenteHora.EquivalenteHora;

/**
 *
 * @author PC
 */
public class Problema2 {

    public static void main(String[] args) {
        System.out.println("Convertidor de minutos");
        Scanner entrada = new Scanner(System.in);
        
        EquivalenteHora eh1 = new EquivalenteHora();
        
        double cm;
        
        System.out.println("Ingrese la cantidad en minutos: ");
        cm = entrada.nextDouble();
        
        eh1.setMinutos(cm);
        
        eh1.CalcularDias();
        eh1.CalcularHoras();
        eh1.CalcularSegundos();
        
        System.out.println(eh1.getMinutos()+ " minutos, es igual a: " + eh1.PresentarSegundos() +" segundos.");
        System.out.println(eh1.getMinutos()+ " minutos, es igual a: " + eh1.PresentarHoras() +" horas.");
        System.out.println(eh1.getMinutos()+ " minutos, es igual a: " + eh1.PresentarDias() +" días.");
        
        
    }
}
