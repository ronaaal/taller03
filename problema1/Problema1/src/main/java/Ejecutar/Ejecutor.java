package Ejecutar;


import java.util.Scanner;
import Terreno.Terreno;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author UTPL
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("COSTO DEL TERRENO");
        Scanner entrada = new Scanner(System.in);
        
        double at;
        double lt;
        double mc;
        
        Terreno t1 = new Terreno();
        
        System.out.println("Escriba el ancho del terreno: ");
        at = entrada.nextDouble();
        
        t1.setAncho(at);
        
        System.out.println("Escriba el largo del terreno: ");
        lt = entrada.nextDouble();
        
        t1.setLargo (lt);
        
        t1.calcularArea();
        
        System.out.println("Escriba el costo del Metro Cuadrado: ");
        mc = entrada.nextDouble();
        
        t1.setValorMetroCuadrado(mc);
        
        t1.costoDelTerreno();
        
        System.out.println("El ancho es: " + t1.getAncho());
        System.out.println("El largo es: "+ t1.getLargo());
        System.out.println("El costo de Metro cuadrado es: "+ t1.getValorMetroCuadrado());
        System.out.println("El costo del terreno es: "+ t1.ObtenerCostoTerreno());
        
        
        
        
    }
    
}
