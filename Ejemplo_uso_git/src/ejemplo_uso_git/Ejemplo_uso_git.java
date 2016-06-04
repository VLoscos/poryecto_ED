/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_uso_git;

/**
 *
 * @author Victor
 */
public class Ejemplo_uso_git {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Calculadora cal = new Calculadora();
        Pantalla pant = new Pantalla();
        
        switch (pant.menu()) {
            case 1:
                int a = pant.pideEntero("Dime un nmero");
                int b = pant.pideEntero("Dime otro numero");
                cal.suma(a, b);
                break;
            case 2:
                a = pant.pideEntero("Dime un nmero");
                b = pant.pideEntero("Dime otro numero");
                cal.multiplicacion(a, b);
                break;
            case 3:
                a = pant.pideEntero("Dime un nmero");
                b = pant.pideEntero("Dime otro numero");
                cal.division(a, b);
                break;
            case 4:
                a = pant.pideEntero("Dime un nmero");
                b = pant.pideEntero("Dime otro numero");
                cal.resto(a, b);
                break;
        }
    }
    
}
