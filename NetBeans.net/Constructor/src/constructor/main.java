/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

import java.util.*;

/**
 *
 * @author APRENDIZ
 */
public class main {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        figura a[] = new figura [3];
        for(int i = 0;i<a.length;i++){
        System.out.print("ingrese la base: ");
        int n1 = leer.nextInt();
        System.out.print("ingrese la altura: ");
        int n2 = leer.nextInt();
        int area=n2*n1; 
            a[i] = new figura (n1, n2,area);
            if (n1==n2){
            System.out.println("Eso es un cuadrado y su area es: "+area+"\n");
            }else{
                System.out.println("la area del rectangulo es: "+area+"\n");
            }    
        }
        for(int i = 0;i<a.length;i++){
            System.out.println("elemento "+(i+1)+"\n");
            a[i].consulta();
    }
    }
}    
