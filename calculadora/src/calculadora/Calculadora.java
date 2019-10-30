/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author APRENDIZ
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n1= Integer.parseInt(JOptionPane.showInputDialog("INGRESE UN NUMERO"));
        int n2= Integer.parseInt(JOptionPane.showInputDialog("INGRESE OTRO NUMERO"));
        
        operaciones op = new operaciones ();
        
        int s = op.suma(n1, n2);
        int r = op.resta(n1, n2);
        int m = op.multiplicacion(n1, n2);
        int d = op.division(n1, n2);
        
        op.resultado(n1, n2, s, r,m,d);
        
    }
    
    
}
