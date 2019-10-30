import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        float base;
        float altura;
        float hipotenusa;
        
        System.out.println("cateto horizontal: ");
        base = entrada.nextFloat();
        System.out.println("cateto vertical: ");
        altura = entrada.nextFloat();
        
        hipotenusa = (base * base + altura * altura);
        
        System.out.println("la hipotenusa del triangulo es:"+" "+hipotenusa);
        System.out.println("cateto horizontal: ");
        base = entrada.nextFloat();
        System.out.println("cateto vertical: ");
        altura = entrada.nextFloat();
        
        hipotenusa = (base * base + altura * altura);
        
        System.out.println("la hipotenusa del triangulo es:"+" "+hipotenusa);
        System.out.println("cateto horizontal: ");
        base = entrada.nextFloat();
        System.out.println("cateto vertical: ");
        altura = entrada.nextFloat();
        
        hipotenusa = (base * base + altura * altura);
        
        System.out.println("la hipotenusa del triangulo es:"+" "+hipotenusa);
    }
    
}
