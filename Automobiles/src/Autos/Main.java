
package Autos;
//Librerias necesarias
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Main {
    /*en clase se desarrollaron arreglos unidimensionales estaticos
    Para el buen desarrollo del ejercico se crearan arreglos multidimensionales dinámicos
    creación de arreglo dinámico.
    En objeto autos colocamos el tipo de variable que queremos almacenar en la lista. 
    se lograr que el objeto que usamos como argumento sea otra lista indicando la clase del objeto.
    List: lista del instanciamiento 
    autos: objetos
    ArrayList: Permite arreglo dinámico
    */ 
    List<Auto> autos = new ArrayList();
    
    public static void main(String[] args) {
        //se crea objeto aciva para poder envocar los metodos de la clase Main
        Main activa = new Main();
        activa.autos = new ArrayList();
        activa.menu();     
    }
    
    public void menu(){
        /* Método creado solo para presentar el menú principal haciendo llamado
        a los diferentes métodos de la classe Main.
        Si el menu se deja en el main los objetos se borrarian al aceder a este.
        */
        int op = Integer.parseInt(JOptionPane.showInputDialog(null,"Seleccione su Opción:"
                                                                +"\n1. Ingresar coche."
                                                                +"\n2. Consultar Coches."
                                                                +"\n3. Modificar Color Coche."
                                                                +"\n4. Salir.","Bienbenidos Menú Principal",JOptionPane.INFORMATION_MESSAGE));
        switch(op){
            case 1:
                objcoche();//envoca metodo para crear un nuevo objeto
            break;
            case 2:
                objconsulta();//consulta todos los objetos
            break;
            case 3:
                modificar();//Modificar color de objeto
            break;
            case 4:
                JOptionPane.showMessageDialog(null,"Adios","Salida",JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);//Instrucciones que finalizan el sript
            break;
            default://si el usuario ingresa un número diferente a las opciones lo regresa al menu
                JOptionPane.showMessageDialog(null,"Debe digitar una de las opciones validas","Error!!",JOptionPane.ERROR_MESSAGE);
                menu();
            break;
        }
    }
    //Metodo crear objetos
    public void objcoche(){  
                String matri = JOptionPane.showInputDialog(null,"Ingrese Matricula: ","Ingreso Matricula",JOptionPane.INFORMATION_MESSAGE);
                String color = JOptionPane.showInputDialog(null,"Ingrese Color: ","Ingreso Color",JOptionPane.INFORMATION_MESSAGE);
                String mca = JOptionPane.showInputDialog(null,"Ingrese Marca: ","Ingreso Marca",JOptionPane.INFORMATION_MESSAGE);
                int mod = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese Modelo: ","Ingreso Modelo ",JOptionPane.INFORMATION_MESSAGE));
                int cba = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese Caballos de Fuerza: ","Ingreso Caballos de Fuerza ",JOptionPane.INFORMATION_MESSAGE));
                int pts = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese # Puertas: ","Ingreso # Puertas ",JOptionPane.INFORMATION_MESSAGE));
                Auto auto = new Auto(color, mca, mod, cba, pts,matri);//llamado al constructor
                autos.add(auto);//crea elemento del array
                menu();//regresa al menu
              
    }
    
    public void objconsulta(){
        /*Para realizar las operaciones comunes tales como ingresar, eliminar, buscar, modificar datos
        en un ArrayList encontraremos algunos métodos útiles para tal objetivo:
        add(X) -> Añade un valor u objeto al final del ArrayList.
        size() -> Retorna el tamaño del ArrayList.
        contains(X) -> Retorna true si existe el elemento X en el ArrayList.
        set(i, X) -> Modifica el elemento que esta en la posición i, por el nuevo elemento X.
        remove(X) -> Elimina el elemento X o en su defecto el elemento en la posición X.
        get(i) -> Obtiene el elemento en la posición i del Array List.
        */
        JOptionPane.showMessageDialog(null,"el sistema tiene ingresados "+autos.size()+" Coches"
                    + "\nLos cuales se muestran a continuación.","# Coches",JOptionPane.INFORMATION_MESSAGE);
        for(int i=0;i<autos.size();i++){//bulce para recorrer los objetos creados
            JOptionPane.showMessageDialog(null,"Caracteristicas Coche # "+(i+1)+"..."
                    +"\nPlaca: "+autos.get(i).getMat()
                    +"\nColor: "+autos.get(i).getCol()
                    +"\nMarca: "+autos.get(i).getMc()
                    +"\nModelo: "+autos.get(i).getMd()
                    +"\n# de caballos: "+autos.get(i).getCb()
                    +"\n# de Puertas: "+autos.get(i).getPt()
                    ,"Auto #"+(i+1),JOptionPane.INFORMATION_MESSAGE);
        }
        menu();
    }
    public void modificar(){
        int cons = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el nuemro del auto al cual le dese cambiar el color: ","Cambio color",JOptionPane.INFORMATION_MESSAGE));
        int conf = JOptionPane.showConfirmDialog(null,"Desea cambiale el color al choche de matricula"+autos.get(cons-1).getMat()+"\nActualmente tiene color "+autos.get(cons-1).getCol());
        if (conf == 0){
        String col = JOptionPane.showInputDialog(null,"Ingrese nuevo Color",JOptionPane.INFORMATION_MESSAGE);
        autos.get(cons-1).setCol(col);//Lamado al setter setColde la clase Auto la cual permite modificar el color
        JOptionPane.showMessageDialog(null,"Cambio realizado con exito","Confirma cambio",JOptionPane.INFORMATION_MESSAGE);    
        }
        menu();
    }
}
