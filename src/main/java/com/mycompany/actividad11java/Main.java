/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.actividad11java;
import java.util.*;
/**
 *
 * @author felip
 */
public class Main {
    public static void main (String args []){
     //DECLARACIÓN DE VARIABLES
     int operacion, figura;
     
      //DECLARACIÓN DE CLASES
      Circle circle = new Circle();
      Square square = new Square();
      Triangle triangle = new Triangle();
          
      //MENSJAE INICIAL
      System.out.println("Bienvenido. Selecciona la operación a realizar");
      System.out.println("1 para Area");
      System.out.println("2 para Perimetro");
      Scanner inputUsuario = new Scanner(System.in);
      
      //OPCION SELECCIONADA AREA
      operacion = inputUsuario.nextInt();
      if (operacion == 1)
      {
                //SELECCION DE FIGURA
                System.out.println("Opción seleccionada: Area (1)");
                System.out.println("Selecciona una figura");
                System.out.println("1 para Cuadrado");
                System.out.println("2 para Circulo");
                System.out.println("3 para Triangulo");
                                
                Scanner inputFigura = new Scanner (System.in);
                figura = inputFigura.nextInt();
                if (figura == 1)
                {
                    //AREA CUADRADO
                    square.getArea();
                }
                else if (figura == 2)
                {
                    //AREA CIRCULO
                    circle.getArea();
                }
                else if (figura == 3);
                {
                    //AREA TRIANGULO
                    triangle.getArea();
                }
      }
      //OPCION SELECCIONADA PERIMETRO
      else if (operacion == 2)
      {
          //SELECCION DE FIGURA
          System.out.println("Opción seleccionada: Perimetro (2)");
          System.out.println("Selecciona una figura");
          System.out.println("1 para Cuadrado");
          System.out.println("2 para Circulo");
          System.out.println("3 para Triangulo");
                Scanner inputFigura = new Scanner (System.in);
                figura = inputFigura.nextInt();
                if (figura == 1)
                {
                    //PERIMETRO CUADRADO
                    square.getPerimeter();
                }
                else if (figura == 2)
                {
                    //PERIMETRO CIRCULO
                    circle.getPerimeter();
                }
                else if (figura == 3);
                {
                    //PERIMETRO TRIANGULO
                    triangle.getPerimeter();
                }
      }
    }  
}

