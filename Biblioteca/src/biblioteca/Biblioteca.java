/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;




/**
 *
 * @author otogu
 */
public class Biblioteca {

    List<libro> libros = new ArrayList(); 
            
        
    public static void main(String[] args) {
        
        
        //se crea objeto aciva para poder envocar los metodos de la clase Main
        Biblioteca activa = new Biblioteca();
        activa.libros = new ArrayList();
        activa.menu();
        
         
        
    }
    public void menu(){
        /* Metodo creado para presentar el menu principal haciendo
        llamado a los diferentes metodos de la classe Main.
        Si el menu se deja en el main los objetos se borrarian al aceder a este.
        */ 
        int op = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione su Opción:" 
                                                                +"\n1. Crear libro."
                                                                +"\n2. Consultar libro."
                                                                +"\n3. Editar libro."
                                                                +"\n4. Eliminar libro"        
                                                                +"\n5. Los mas leidos"  
                                                                +"\n6. Salir","Bienvenidos Menú Principal",JOptionPane.INFORMATION_MESSAGE));
        
        switch (op){
            case 1:
                creacionDeLibros();//metodo para crear un nuevo libro 
            break;  
            case 2:
            mostrarLibros();//creado para añadir libros
            break;
            case 3:
            modificarLibros();//creado para consultar los libros
            break;
            case 4:
                eliminarLibro();//creado para la eliminacion de libros
            break;
            /*case 5;
            losMasLeidos();//creado para consultar los libros mas populares
            break;*/
            case 6:
                JOptionPane.showMessageDialog(null,"Adios","Salida",JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);//Finalizacion del programa
            break;
            default://si el usuario ingresa un número diferente a las opciones lo regresa al menu
                JOptionPane.showMessageDialog(null,"Debe digitar una de las opciones validas","Error!!",JOptionPane.ERROR_MESSAGE);
                menu();
            break;
        }
        
        
    }
    public void creacionDeLibros(){
        List<libro> listaLibros;
        listaLibros = new ArrayList<>();
        String Titulo,Autor;
        int libroeliminar;
        int CantidadDePaginas,Calificacion;
        Titulo = JOptionPane.showInputDialog(null,"¿Cual es titulo del libro?","titulo del libro",JOptionPane.INFORMATION_MESSAGE);
        Autor = JOptionPane.showInputDialog(null,"¿Quien es el autor del libro?","Nombre del autor",JOptionPane.INFORMATION_MESSAGE);
        CantidadDePaginas = Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad de paginas","Numero de paginas",JOptionPane.INFORMATION_MESSAGE));
        do{
        Calificacion = Integer.parseInt(JOptionPane.showInputDialog(null,"Califique del 0 al 10 el libro","Calificacion del libro",JOptionPane.INFORMATION_MESSAGE));
        if (Calificacion<0 || Calificacion>10)
            {
                JOptionPane.showMessageDialog(null, "Esta no es la calificación correcta","Error",JOptionPane.ERROR_MESSAGE ); 
            
            }
        }while(Calificacion<0 || Calificacion>10);
        
        
        libro Libro = new libro(Titulo, Autor, CantidadDePaginas, Calificacion);
        libros.add(Libro);//crear elemento 
        menu();//regresa al menu
        
    }
    
    public void mostrarLibros(){
     for (int i = 0; i < libros.size(); i++) {
            
            JOptionPane.showMessageDialog(null,"Libro Numero:" + (i+1)
            +"\nAutor: "+ libros.get(i).getAutor()
            +"\nTitulo:"+ libros.get(i).getTitulo()
            +"\ncantidad de paginas :"+ libros.get(i).getCantidadDePaginas()
            +"\nCalificacion: "+ libros.get(i).getCalificacion());
     } 
     menu();
    
}   
    public void modificarLibros(){
        int numeroLibro = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el nuemro del libro: ","Cambio de libro",JOptionPane.INFORMATION_MESSAGE));
        int conf = JOptionPane.showConfirmDialog(null,"Desea cambiar la informacion del libro numero:  " +libros.get(numeroLibro-1)+"llamado con el titulo de "+libros.get(numeroLibro-1).getTitulo());
        if (conf == 0){
        String Titulo = JOptionPane.showInputDialog(null,"Ingrese nuevo titulo",JOptionPane.INFORMATION_MESSAGE);
        libros.get(numeroLibro-1).setTitulo(Titulo);//Lamado al setter setColde la clase Auto la cual permite modificar el color
        String Autor = JOptionPane.showInputDialog(null,"Ingrese nuevo autor",JOptionPane.INFORMATION_MESSAGE);
        libros.get(numeroLibro-1).setAutor(Autor);//Lamado al setter setColde la clase Auto la cual permite modificar el color
        int Paginas = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese numero de paginas",JOptionPane.INFORMATION_MESSAGE));
        libros.get(numeroLibro-1).setPaginas(Paginas);//Lamado al setter setColde la clase Auto la cual permite modificar el color
        int Calificacion = Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese la nueva calificacion",JOptionPane.INFORMATION_MESSAGE));
        do{
            Calificacion = Integer.parseInt(JOptionPane.showInputDialog(null,"Califique del 0 al 10 el libro","Calificacion del libro",JOptionPane.INFORMATION_MESSAGE));
        if (Calificacion<0 || Calificacion>10)
            {
                JOptionPane.showMessageDialog(null, "Esta no es la calificación correcta","Error",JOptionPane.ERROR_MESSAGE ); 
            
            }
        }while(Calificacion<0 || Calificacion>10);
        libros.get(numeroLibro-1).setCalificacion(Calificacion);//Lamado al setter setColde la clase Auto la cual permite modificar el color

        JOptionPane.showMessageDialog(null,"Cambio realizado con exito","Confirma cambio",JOptionPane.INFORMATION_MESSAGE);    
        }
        menu();
    }
    public void eliminarLibro(){
        int eliminarLibro=Integer.parseInt(JOptionPane.showInputDialog(null,"¿Que libro desea eliminar","Eliminar libro",JOptionPane.INFORMATION_MESSAGE) );
        if (eliminarLibro!=0 && eliminarLibro<=libros.size())
        {
            JOptionPane.showMessageDialog(null,"Se elimina el libro "+eliminarLibro,"Eliminado",JOptionPane.INFORMATION_MESSAGE);
            eliminarLibro -=1;
            libros.remove(eliminarLibro);
        }else
        {
            JOptionPane.showMessageDialog(null,"No se elimina el libro "+eliminarLibro,"Canselado",JOptionPane.CANCEL_OPTION);
        
        }
        menu();
        
    
}
}
