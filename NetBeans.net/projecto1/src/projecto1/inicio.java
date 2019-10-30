/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecto1;

import javax.swing.JOptionPane;

/**
 *
 * @author APRENDIZ
 */
public class inicio {

   
    public static void main(String[] args) {
        int n1 = Integer.parseInt (JOptionPane.showInputDialog("ingrese un numero"));
        int n2 = Integer.parseInt (JOptionPane.showInputDialog("ingrese un numero"));
        
        Calculadora op = new Calculadora ();
        //op.sumar(n1, n2);
        //op.restar(n1, n2);
        int d =op.dividir(n1, n2);
        //op.dividir(n1, n2);
        int m=op.multiplicar(n1, n2);
        //op.multiplicar(n1, n2);
        int s=op.sumar(n1, n2);
        int r=op.restar(n1, n2);
        
        op.resultados(d, m, s, r);
  
        
        //System.out.println("la suma es "+op.sumar(n1, n2));
        //op.sumar(n1, n2);
        //System.out.println("la resta es "+op.restar(n1, n2));
        //op.restar(n1, n2);
       
    }
    
}
