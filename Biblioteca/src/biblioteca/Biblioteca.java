/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.Scanner;



/**
 *
 * @author otogu
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String Titulo,Autor;
        int Cantidad,Calificacion;
        System.out.println("¿Cual es titulo del libro?");
        Titulo = scan.nextLine();
        System.out.println("¿Quien es autor del libro?");
        Autor = scan.nextLine();
        System.out.println("¿Cuantas  paginas son del libro?");
        Cantidad= Integer.parseInt(scan.nextLine());
        System.out.println("Califique del 1 al 10 el libro");
        Calificacion= Integer.parseInt(scan.nextLine());
        libro Libros = new libro(Titulo, Autor, Cantidad, Calificacion);
        Libros.mostrar();
    }
    
}
