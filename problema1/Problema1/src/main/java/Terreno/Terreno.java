package Terreno;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author UTPL
 */
public class Terreno {
    private double costoTerreno;
     private double ancho;
     private double largo;
     private double area;
     private double valorMetroCuadrado;

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getValorMetroCuadrado() {
        return valorMetroCuadrado;
    }

    public void setValorMetroCuadrado(double valorMetroCuadrado) {
        this.valorMetroCuadrado = valorMetroCuadrado;
    }
    
    public void calcularArea(){
        area = largo * ancho;
    }
    public double obtenerArea(){
        return area;
    }
    public void costoDelTerreno(){
        costoTerreno = valorMetroCuadrado * area;
    }
   public double ObtenerCostoTerreno(){
       return costoTerreno;
   }
    
}
