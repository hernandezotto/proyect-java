/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author APRENDIZ
 */
public class operaciones {
    
    public int suma(int num1,int num2) 
    {
        int suma = num1+num2;
        return suma;
    }
    public int resta(int num1,int num2)
    {
        int resta = num1-num2;
        return resta;
    }
    public int multiplicacion(int num1,int num2)
    {
        int multiplicacion = num1 * num2;
        return multiplicacion;
    }
    public int division(int num1,int num2)
    {
        int division = num1 / num2;
        return division;
    }
    public void resultado(int num1,int num2,int su,int re,int mu,int di)
    {
        System.out.println("LA SUMA DE "+ num1 +" + "+ num2 +" ES: "+ su);
        System.out.println("LA RESTA DE "+ num1 +" - "+ num2 +" ES: "+ re);
        System.out.println("LA MULTIPLICACION DE "+ num1 +" * "+ num2 +" ES: "+ mu);
        System.out.println("LA DIVISION DE "+ num1 +" / "+ num2 +" ES: "+ di);
        
    }
}
