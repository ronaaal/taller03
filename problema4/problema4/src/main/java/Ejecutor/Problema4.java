/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Ejecutor;
import EquipoCelular.EquipoCelular;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class Problema4 {

    public static void main(String[] args) {
        System.out.println("CELULARES");
        Scanner entrada = new Scanner(System.in);
        
        EquipoCelular ec1 = new EquipoCelular();
        
        String so;
        double tp;
        double ct;
        double piva;
        String dm;
        String dimei;
        System.out.println("Sistema operativo: ");
        so = entrada.nextLine();
        
        ec1.setSistemaOperativo(so);
        
        System.out.println("Tamaño de la Pantalla: ");
        tp = entrada.nextDouble();
        
        ec1.setTamañoPantalla(tp);
        
        System.out.println("Costo del telefono: ");
        ct = entrada.nextDouble();
        
        ec1.setCostoInicial(ct);
        
        System.out.println("¿Cuál será el porcentaje del IVA?(número entero): ");
        piva = entrada.nextDouble();
        
        ec1.setIva(piva);
        
        System.out.println("Su dirección Mac: ");
        dm = entrada.nextLine();
        
        ec1.setDireccionMac(dm);
        
        System.out.println("Su dirección IMEI: ");
        dimei = entrada.nextLine();
        
        ec1.setDireccionIMEI(dimei);
       
        System.out.println("El costo inicial es de: "+ ec1.getCostoInicial()+ "$");
        
        ec1.CalcularCosto();
        
        System.out.println("Y más IVA, es de: "+ ec1.PresentarCosto()+ "$");
        
    }
}
