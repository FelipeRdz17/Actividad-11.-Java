/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.actividad11java;

import java.util.Scanner;

/**
 *
 * @author felip
 */
public class Circle {
    //DECLARACIÓN DE VARIABLES
    double area, r, perimeter,b,radio,pi;
    
    //INTERFAZ AREA
    public void getArea(){
        Scanner inputUsuario = new Scanner(System.in);
        System.out.println("Opcion selecciona: Circulo.");
        System.out.println("Ingrese el radio del Circulo");
        r = inputUsuario.nextDouble();
        area = (((3.1416)*(r*r)));        
        System.out.println(area);
        System.exit(0);
    }
    
    //INTERFAZ PERIMETRO
    public void getPerimeter(){
        Scanner inputUsuario = new Scanner(System.in);
        System.out.println("Opcion selecciona: Circulo.");
        System.out.println("Ingrese el radio del Circulo");
        r = inputUsuario.nextDouble();
        pi = ((3.1416)*(3.1416));
        perimeter = pi*r;
        System.out.println(perimeter);
        System.exit(0);
    }
}
