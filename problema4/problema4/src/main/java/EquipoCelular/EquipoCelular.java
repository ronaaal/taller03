/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EquipoCelular;

/**
 *
 * @author PC
 */
public class EquipoCelular {
    private String SistemaOperativo;
    private double TamañoPantalla;
    private double CostoInicial;
    private double Iva;
    private double CostoFinal;
    private String DireccionMac;
    private String DireccionIMEI;

    public String getSistemaOperativo() {
        return SistemaOperativo;
    }

    public void setSistemaOperativo(String SistemaOperativo) {
        this.SistemaOperativo = SistemaOperativo;
    }

    public double getTamañoPantalla() {
        return TamañoPantalla;
    }

    public void setTamañoPantalla(double TamañoPantalla) {
        this.TamañoPantalla = TamañoPantalla;
    }

    public double getCostoInicial() {
        return CostoInicial;
    }

    public void setCostoInicial(double CostoInicial) {
        this.CostoInicial = CostoInicial;
    }

    public double getIva() {
        return Iva;
    }

    public void setIva(double Iva) {
        this.Iva = Iva;
    }

    public String getDireccionMac() {
        return DireccionMac;
    }

    public void setDireccionMac(String DireccionMac) {
        this.DireccionMac = DireccionMac;
    }

    public String getDireccionIMEI() {
        return DireccionIMEI;
    }

    public void setDireccionIMEI(String DireccionIMEI) {
        this.DireccionIMEI = DireccionIMEI;
    }
    
    public void CalcularCosto(){
        CostoFinal = CostoInicial + (CostoInicial * Iva / 100);
    }
    
    public double PresentarCosto(){
        return CostoFinal;
    }
}
