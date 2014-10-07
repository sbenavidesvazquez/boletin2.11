//calcula la ganancia de una persona
package boletin2.pkg11;

import java.util.Scanner;


public class Boletin211 {

    
    public static void main(String[] args) {
    float sueldo,km,dia;
    
    System.out.print("sueldo= ");
    Scanner dato= new Scanner(System.in);
    sueldo=dato.nextFloat();
    
    System.out.print("kilometros recorridos= ");
    Scanner dato2= new Scanner(System.in);
    km=dato2.nextFloat();
    
    System.out.print("dias de desplazamiento= ");
    Scanner dato3= new Scanner(System.in);
    dia=dato3.nextFloat();
    
    System.out.println("sueldo total="+ sueldo +"*5%+"+ km +"*2+"+ dia +"*30+"+ sueldo +"=");
    System.out.println("sueldo total= "+ (sueldo*5/100+km*2+dia*30+sueldo));
    
    float sueldoTotal=(sueldo*5/100+km*2+dia*30+sueldo),irpf=18/100;
    System.out.println("sueldo liquido= "+ (sueldoTotal-36-sueldoTotal*irpf));
    
    }
    
}
