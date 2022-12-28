
package ejercicio_4;
//4. Crear una aplicación para devolver un listado de nombre de cantantes. 
//Se creará una clase para el cantante y otra para guardar en un ArrayList 
//los cantantes con las propiedades de la primera clase. En el método main, 
//se introducirán los cantantes y recuperará el listado de los cantantes.
//Jhosep TS
import ejercicio_4.ListaCantantes;
public class main {
    public static void main(String[] args) {
//Creamos el arraylist para guardar cantantes
        ListaCantantes cantantes = new ListaCantantes();      
        //Añadimos los cantantes usando el método creado en ListaCantante
        cantantes.anadirCantante("Freddie Mercury");
        cantantes.anadirCantante("Zaz");
        cantantes.anadirCantante("Stromae");
        cantantes.anadirCantante("Noa");
        cantantes.anadirCantante("Enrique Bunbury");
        cantantes.anadirCantante("Edith Piaf");
        cantantes.anadirCantante("Otis Redding");
        cantantes.anadirCantante("Antonio Machín");     
        //Devolvemos el listado usando los métodos.
        cantantes.listadoCantantes();    
        cantantes.obtenerListadoFormateado();       
    }
}
