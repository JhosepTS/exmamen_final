
package ejercicio_4;
//Jhosep TS
import java.util.ArrayList;
public class ListaCantantes {
//Declaramos e inicializamos el arraylist
    private ArrayList <Cantante> cantantes = new ArrayList();
    //Método constructor vacío
    public void ListaCantantes() {
    }
    //Método para añadir nombre de cantantes   
    public void anadirCantante(String nombre) {
        cantantes.add(new Cantante(nombre));
    }
    //Método para devolver el listado de cantantes formateado
    public ArrayList<Cantante> obtenerListadoFormateado() {
        for (int i = 0; i<  cantantes.size(); i++) {
            System.out.println("Cantante: " + cantantes.get(i).getNombre());
        }
        return cantantes;
    }
    //Método para devolver el listado sin formatear
    public ArrayList<Cantante> listadoCantantes () {
        for (int i = 0;i<cantantes.size(); i++) {
            System.out.println(cantantes.get(i).getNombre());        
        }
        return cantantes;       
    }    
}
