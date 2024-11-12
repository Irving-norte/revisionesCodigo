package com.generation;

import java.util.Scanner;

//La clase Codigo4 no es valida se cambió

public class Ejercicio4 {
	//Faltaba el main
	 public static void main(String[] args) {
	//faltaba importar el scanner y el close scanner y el argumento indicando que va a ser una entrada
    Scanner s = new Scanner(System.in);
    System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = s.nextLine();
    
   /*Se cambió el número de jugador*/
    System.out.println("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
    String j2 = s.nextLine();
    //Scanner s2 = new Scanner(); este scan es inecesario
    
    //cerrar el scan
    s.close();
    
    
    
    
   //llevaba un parentesis de más se cambian == por el metodo equal que es capaz de comparar strings
    if (j1.equals(j2)) {
      System.out.println("Empate");
    //Se añaden breaks
    } else {
      int g = 2;
      switch(j1) {
        case "piedra":
          if (j2.equals("tijeras")) {
            g = 1;}
          break;
        case "papel":
          if (j2.equals("piedra")) {
            g = 1;}
          break;
        case "tijera":
          if (j2.equals("papel")) {
            g = 1;}
          break;
        default:
        	//se añade un default para los casos no validos y el return
        	System.out.println("Entrada no válida");
        	return;
        	
      }
      System.out.println("Gana el jugador " + g);
    }
    }
  
  
	 }
