/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecto1;

/**
 *
 * @author APRENDIZ
 */
public class Calculadora {
    //int suma;
    //int resta;
    //int division;
    //int multiplicacion;
    
    public int sumar (int Num1,int Num2){
        int suma = Num1+Num2;
          return suma;
    }
    
    public int restar (int Num1, int Num2){
        int resta = Num1-Num2;
          return resta;
    }
    
    public int dividir (int Num1, int Num2){
        int division = Num1/Num2;
         return division;
    }
    public int multiplicar (int Num1, int Num2){
        int multiplicar = Num1*Num2;
          return multiplicar;
    }
    public void resultados(int div, int mul, int sum, int res){
        System.out.println("La suma de :"+sum);
        System.out.println("La resta es :"+res);  
        System.out.println("La division es :"+div);  
        System.out.println("La multiplicacion es :"+mul);  
    }

}
