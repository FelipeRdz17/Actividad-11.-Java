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
public class Triangle {
    //DECLARACIÓN DE VARIABLES
    double area, a, perimeter,b,l;
    
    //INTERFAZ AREA
    public void getArea(){
        Scanner inputUsuario = new Scanner(System.in);
        System.out.println("Opcion selecciona: Triangulo.");
        System.out.println("Ingrese la base del Triangulo");
        b = inputUsuario.nextDouble();
        System.out.println("Ingresa la altura del Triangulo");
        a = inputUsuario.nextDouble();
        area = ((b*a)/2);
        System.out.println(area);
        System.exit(0);
    }
    
    //INTERFAZ PERIMETRO
    public void getPerimeter(){
        Scanner inputUsuario = new Scanner(System.in);
        System.out.println("Opcion selecciona: Triangulo.");
        System.out.println("Ingrese el lado de Triangulo");
        l = inputUsuario.nextDouble();
        perimeter = l+l+l;
        System.out.println(perimeter);
        System.exit(0);
    }
    
}
