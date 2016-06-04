/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_uso_git;

/**
 *
 * @author INF306
 */
public class Calculadora {
   
    
    public void suma(int a,int b){
        int sum = a+b;
        System.out.println(sum);     
    }
    
    public void multiplicacion(int a, int b){
        int multip = a*b;
        System.out.println(multip);
       
    }
    
    public void division (int a, int b){
        
        float div;
        if (b==0){
            System.out.println("ERROR, B es un 0");
        }
        div=a/b;
        System.out.println(div);
       
    }
    
    public void resto (int a, int b){
        
        float resto=a%b;
        System.out.println(resto);
        
    }
}
