package Ejercicio1;

import java.util.List;
import java.util.stream.Collectors;


public class Ejercicio1 {

    public static List<String> convertirAMayusculas(List<String> listaStrings){
        return listaStrings.stream()
                .map(String::toUpperCase) //Convierte cada string a mayuscula
                .collect(Collectors.toList()); //Recolecta los resultados en una nueva lista
    }
    
    //Implementacion
    public static void main(String[] args){
        List<String> palabras = List.of("hola","mundo","en","java");
        List<String> palabrasMayusculas = convertirAMayusculas(palabras);
        System.out.println(palabrasMayusculas); //imprime palabras en mayusculas
    }  
}
