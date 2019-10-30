/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

/**
 *
 * @author APRENDIZ
 */
public class  figura {
    int base;
    int altura;
    int area;

    public figura (int base, int altura, int area){
        this.base = base;
        this.altura = altura;  
        this.area = area;

    }
    
    public void consulta() {
        System.out.println("la base de rectangulo es "+base);
        System.out.println("la altura del rectangulo es "+altura);
        if (altura == base){
            
            System.out.println("Eso es un cuadrado y su area es "+area);
        }else{
            
            System.out.println("la area del rectangulo es "+area);
        }
    }
    
  

}

