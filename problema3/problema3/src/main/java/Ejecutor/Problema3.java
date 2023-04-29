/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Ejecutor;
import InstitucionEducativa.Institucion;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class Problema3 {

    public static void main(String[] args) {
        System.out.println("INSTITUCIONES");
        Scanner entrada = new Scanner(System.in);
        
        Institucion i1 = new Institucion();
        
        String ti;
        String ni;
        double na;
        double nd;
        double ns;
        
        System.out.println("Escriba el tipo institución: ");
        ti = entrada.nextLine();
        
        i1.setTipoInstitucion(ti);
        
        System.out.println("Escriba el nombre: ");
        ni = entrada.nextLine();
        
        i1.setNombre(ni);
        
        System.out.println("Número de alumnos: ");
        na = entrada.nextDouble();
        
        i1.setNumeroAlumnos(na);
        
        System.out.println("Número de docentes: ");
        nd = entrada.nextDouble();
        
        i1.setNumeroDocentes(nd);
        
        System.out.println("Número de sedes: ");
        ns = entrada.nextDouble();
        
        i1.setNumeroSedes(ns);
        
        i1.CalcularPresupuesto();
        
        System.out.println("Este es el presupuesto: " + i1.PresentarPresupuesto());
        
        
    }
}
