
package ejercicio_3;
//Jhosep TS
//3. Se tiene la siguiente información de n personas: dni, apellidos, nombres, 
//sexo, edad y peso. Esta información se tiene que registrar en un ArrayList, 
//buscar una persona dado el dni, eliminar una persona, ordenar por apellidos 
//y mostrar todas las personas. Crear un programa que permita hacer un menú 
//para realizar lo que se pide.
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class ProyectoListaPersonas {
    private ArrayList<Persona> listaPersonas;
    public static void main(String[] args) {
 int opcion;
 ProyectoListaPersonas proyectoPersonas = new ProyectoListaPersonas();
 proyectoPersonas.listaPersonas = new ArrayList();
 Scanner entrada = new Scanner(System.in);
 do{
 System.out.println("\nLISTA DE PERSONAS:");
 System.out.println("[1] Registrar persona");
 System.out.println("[2] Buscar persona por DNI");
 System.out.println("[3] Eliminar persona");
 System.out.println("[4] Ordenar por apellidos");
 System.out.println("[5] Mostrar persona");
 System.out.println("[6] Salir\n");
 System.out.print("Ingrese opción (1-6): ");
 opcion = entrada.nextInt();
 switch(opcion){
 case 1: proyectoPersonas.registrarPersona();
 break;
 case 2: proyectoPersonas.buscarPersona();
 break;
 case 3: proyectoPersonas.eliminarPersona();
 break;
 case 4: proyectoPersonas.ordenarPorApellido();
 break;
 case 5: proyectoPersonas.mostrarPersonas();
 break;
 }
 }while(opcion != 6);
 }
 public void registrarPersona(){
 String dni,apellidos,nombres,sexo;
 int edad;
 double peso;
 Scanner entrada = new Scanner(System.in);
 System.out.print("DNI: ");
 dni = entrada.next();
 System.out.print("Apellidos: ");
 apellidos = entrada.next();
 System.out.print("Nombres: ");
 nombres = entrada.next();
 System.out.print("Sexo: ");
 sexo = entrada.next();
 System.out.print("Edad: ");
 edad = entrada.nextInt();
 System.out.print("Peso: ");
 peso = entrada.nextDouble();
 Persona persona = new Persona(dni, apellidos, nombres, sexo, edad, peso);
 listaPersonas.add(persona);
 }
 public void buscarPersona(){
 String dni;
 int indice;
 Scanner entrada = new Scanner(System.in);
 System.out.print("Ingrese DNI a buscar: ");
 dni = entrada.next();
 Persona persona = new Persona(dni);
 indice = listaPersonas.indexOf(persona);
 if (indice != -1){
 persona = listaPersonas.get(indice);
 System.out.println(persona);
 }
 else
 System.out.println("La persona no se encuentra");
 }
 public void eliminarPersona(){
 String dni;
 int indice;
 Scanner entrada = new Scanner(System.in);
 System.out.print("Ingrese DNI para eliminar: ");
 dni = entrada.next();
 Persona persona = new Persona(dni);
 indice = listaPersonas.indexOf(persona);
 if(indice != -1){
 persona = listaPersonas.remove(indice);
 System.out.println("Persona eliminada: " + persona);
 }
 else
 System.out.println("La persona no se encuentra");
 }
 public void mostrarPersonas(){
 if(listaPersonas.size() > 0)
 for(Persona persona : listaPersonas)
 System.out.println(persona);
 else
 System.out.println("No existen personas registradas");
 }
 public void ordenarPorApellido(){
 Collections.sort(listaPersonas, (Persona persona1, Persona persona2)
 -> persona1.getApellidos().compareTo(persona2.getApellidos()));
 mostrarPersonas();        
    }
}
