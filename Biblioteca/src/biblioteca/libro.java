
package biblioteca;



public class libro {

    String titulo, autor;
    int cantidadDePaginas,calificacion;

    libro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getCantidadDePaginas() {
        return cantidadDePaginas;
    }

    public int getCalificacion() {
        return calificacion;
    }
    
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setPaginas(int paginas){
        this.cantidadDePaginas = paginas;
    }
    public void setCalificacion (int calificacion){
        this.calificacion = calificacion;
    }
    
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
