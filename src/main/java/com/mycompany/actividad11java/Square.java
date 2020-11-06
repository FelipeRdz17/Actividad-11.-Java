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
public class Square {
    //DECLARACIÓN DE VARIABLES
    double area, a, perimeter;
    
    //INTERFAZ AREA
    public void getArea(){
        Scanner inputUsuario = new Scanner(System.in);
        System.out.println("Opcion selecciona: Cuadrado.");
        System.out.println("Ingrese el lado de Cuadrado");
        a = inputUsuario.nextDouble();
        area = a*a;
        System.out.println(area);
        System.exit(0);
    }
    
    //INTERFAZ PERIMETRO
    public void getPerimeter(){
        Scanner inputUsuario = new Scanner(System.in);
        System.out.println("Opcion selecciona: Cuadrado.");
        System.out.println("Ingrese el lado de Cuadrado");
        a = inputUsuario.nextDouble();
        perimeter = a*4;
        System.out.println(perimeter);
        System.exit(0);
    }
    
    
}
