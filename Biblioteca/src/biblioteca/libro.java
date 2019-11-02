
package biblioteca;



public class libro {
    String titulo, autor;
    int cantidadDePaginas,calificacion;
    
    
    //método constructor
    
    public libro(String tituloDelLibro, String autorDelLibro, int cantidadDEPaginasDElLibro, int calificacionDelLibro){
        titulo=tituloDelLibro;
        autor=autorDelLibro ;
        cantidadDePaginas=cantidadDEPaginasDElLibro;
        calificacion= calificacionDelLibro;
    }
    
    public void mostrar(){
        System.out.println("Titulo del libro: "+ titulo);
        System.out.println("Autor del libro: "+ autor);
        System.out.println("Cantidad de paginas del libro: "+ cantidadDePaginas);
        System.out.println("Calificacion del libro: "+ calificacion);
    }

}
