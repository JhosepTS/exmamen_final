
package ejercicio_2;
//Jhosep TS
//2. Crear un programa que permita ingresar los nombres y las notas de n 
//alumnos y reportar la lista en orden alfabético y en orden de mérito.
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class ProyectoListaAlumnos {
 private ArrayList<Alumno> listaAlumnos;
    public static void main(String[] args) {
 ProyectoListaAlumnos proyectoAlumnos = new ProyectoListaAlumnos();
        proyectoAlumnos.ingresarDatos();
        proyectoAlumnos.ordenarPorNombre();
        proyectoAlumnos.ordenarPorNota();
    }
    public void ingresarDatos() {
        String nombre, respuesta;
        double nota;
        Scanner entrada = new Scanner(System.in);
        listaAlumnos = new ArrayList();
        int i = 0;
        do {
            System.out.println("\nAlumno " + ++i);
            System.out.print("Nombre: ");
            nombre = entrada.nextLine();
            System.out.print("Nota: ");
            nota = Double.parseDouble(entrada.nextLine());
            Alumno alumno = new Alumno(nombre, nota);
            listaAlumnos.add(alumno);
            System.out.print("Desea ingresar nuevo alumno (S/N): ");
            respuesta = entrada.nextLine();
        } while (respuesta.equals("S"));
    }
    public void imprimirDatos() {
        for (int i = 0; i < listaAlumnos.size(); i++) {
            System.out.println(listaAlumnos.get(i).getNombre() + ", "
                    + listaAlumnos.get(i).getNota());
        }
    }
    private void ordenarPorNombre() {
        System.out.println("\nDatos en orden alfabético:");
        Collections.sort(listaAlumnos, (Alumno alumno1, Alumno alumno2)
                -> alumno1.getNombre().compareTo(alumno2.getNombre()));
        imprimirDatos();
    }
    private void ordenarPorNota() {
        System.out.println("\nDatos en orden de mérito:");
        Collections.sort(listaAlumnos, (Alumno alumno1, Alumno alumno2)
                -> new Double(alumno2.getNota()).compareTo(alumno1.getNota()));
        imprimirDatos();       
    }    
}
