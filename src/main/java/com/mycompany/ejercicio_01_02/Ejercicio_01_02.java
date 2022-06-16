/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio_01_02;

/**
 *
 * @author ASUS
 */
public class Ejercicio_01_02 {

    public static void main(String[] args) {
        var empleado1 = new Empleado();
        empleado1.nombre = "Juan";
        empleado1.horasTrabajadas = 100;
        empleado1.costoHora = 6;
        empleado1.anioIngreso = 2010;
        var ingresos1 = empleado1.calcularIngresos(2022);
        var bono1 = empleado1.calcularBonoHorasExtra(100);
        var impuestos1 = empleado1.calcularImpuesto(500, 1000, 2000);
        var valorTotal = ingresos1+bono1-impuestos1;
        
        System.out.println("El nombre del empleado1 es: "+empleado1.nombre);
        System.out.println("Las horas trabajadas del empleado1 son: "+empleado1.horasTrabajadas);
        System.out.println("El costo por hora del empleado1 es: "+empleado1.costoHora);
        System.out.println("El año de ingreso del empleado1 es: "+empleado1.anioIngreso);
        
        System.out.println("\nLos ingresos del empleado1 son: "+empleado1.calcularIngresos(2022));
        System.out.println("El bono para el empleado1 es: "+empleado1.calcularBonoHorasExtra(100));
        System.out.println("Los impuestos que debe pagar el empleado1 son: "+empleado1.calcularImpuesto(500,1000,2000));
        
        System.out.println("\nEl valor a pagar total del empleado1 es: "+valorTotal);
        
        var empleado2 = new Empleado();
        empleado2.nombre = "Mariana";
        empleado2.horasTrabajadas = 200;
        empleado2.costoHora = 5;
        empleado2.anioIngreso = 2020;
        var ingresos2 = empleado2.calcularIngresos(2022);
        var bono2 = empleado2.calcularBonoHorasExtra(100);
        var impuestos2 = empleado2.calcularImpuesto(500, 1000, 2000);
        var valorTota2 = ingresos2+bono2-impuestos2;
                
        System.out.println("\nEl nombre del empleado2 es: "+empleado2.nombre);
        System.out.println("Las horas trabajadas del empleado2 son: "+empleado2.horasTrabajadas);
        System.out.println("El costo por hora del empleado2 es: "+empleado2.costoHora);
        System.out.println("El año de ingreso del empleado2 es: "+empleado2.anioIngreso);
        
        System.out.println("\nLos ingresos del empleado2 son: "+empleado2.calcularIngresos(2022));
        System.out.println("El bono para el empleado2 es: "+empleado2.calcularBonoHorasExtra(100));
        System.out.println("Los impuestos que debe pagar el empleado2 son: "+empleado2.calcularImpuesto(500,1000,2000));
        
        System.out.println("\nEl valor a pagar total del empleado2 es: "+valorTota2);
        
        var empleado3 = new Empleado();
        empleado3.nombre = "Carlos";
        empleado3.horasTrabajadas = 150;
        empleado3.costoHora = 8;
        empleado3.anioIngreso = 2018;
        var ingresos3 = empleado3.calcularIngresos(2022);
        var bono3 = empleado3.calcularBonoHorasExtra(100);
        var impuestos3 = empleado3.calcularImpuesto(500, 1000, 2000);
        var valorTota3 = ingresos3+bono3-impuestos3;
               
        System.out.println("\nEl nombre del empleado3 es: "+empleado3.nombre);
        System.out.println("Las horas trabajadas del empleado3 son: "+empleado3.horasTrabajadas);
        System.out.println("El costo por hora del empleado3 es: "+empleado3.costoHora);
        System.out.println("El año de ingreso del empleado3 es: "+empleado3.anioIngreso);
        
        System.out.println("\nLos ingresos del empleado3 son: "+empleado3.calcularIngresos(2022));
        System.out.println("El bono para el empleado3 es: "+empleado3.calcularBonoHorasExtra(100));
        System.out.println("Los impuestos que debe pagar el empleado3 son: "+empleado3.calcularImpuesto(500,1000,2000));
        
        System.out.println("\nEl valor a pagar total del empleado3 es: "+valorTota3);
        
    }
}
