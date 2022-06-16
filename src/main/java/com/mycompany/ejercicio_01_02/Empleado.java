/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_01_02;

/**
 *
 * @author ASUS
 */
public class Empleado {
    String nombre;
    int horasTrabajadas;
    double costoHora;
    int anioIngreso;

    public double calcularIngresos(int anioActual){
        var retorno1 = 1000000d;
        var extra = (anioActual - anioIngreso)*costoHora*horasTrabajadas*0.02;
        retorno1 = (costoHora*horasTrabajadas)+extra;
        return retorno1;
    }
    
    public double calcularBonoHorasExtra(int maximoHorasTrabajadas){
        var retorno2 = 100000d;
        var bono = horasTrabajadas - maximoHorasTrabajadas;
        if(bono>0){
            retorno2 = 2*costoHora*bono;
        }else{
            retorno2 = 0;
        }
        return retorno2;
    }
    
    public double calcularImpuesto(int limite1, int limite2, int limite3){
        var retorno = 10000d;
        var impuesto = costoHora*horasTrabajadas;
        if(impuesto>=0 && impuesto<=limite1){
            retorno = 0;
        }
        if(impuesto>limite1 && impuesto<limite2){
            retorno = costoHora*horasTrabajadas*0.05;
        }
        if(impuesto>=limite2 && impuesto<=limite3){
            retorno = costoHora*horasTrabajadas*0.12;
        }
        if(impuesto>limite3){
            retorno = costoHora*horasTrabajadas*0.25;
        }
        return retorno;
    }
    
}
