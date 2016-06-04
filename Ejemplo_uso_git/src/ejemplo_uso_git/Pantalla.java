/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_uso_git;

import java.util.Scanner;

/**
 *
 * @author INF306
 */
public class Pantalla {
    
    public int pideEntero(String cadena){
        
        int num;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Dime un numero");
        num=teclado.nextInt();
        return num;    
    }
    
    public int menu(){
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("*********************");
        System.out.println("********ACME*********");
        System.out.println("*********************");
        System.out.println("1.Suma");
        System.out.println("2.Multiplicacion");
        System.out.println("3.Division");
        System.out.println("4.Resto");
        System.out.println("Otro. Fin");
        return teclado.nextInt();
        
       
    }
}
