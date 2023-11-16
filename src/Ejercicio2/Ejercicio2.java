package Ejercicio2;

import java.util.List;
import java.util.stream.Collectors;


public class Ejercicio2 {
   public static String concatenarPalabrasMasLargas(List<String> listaStrings, int n) {
       return listaStrings.stream()
               .filter(s -> s.length()>n) //Filtra las palabras que tienen mas de n caracteres
               .collect(Collectors.joining(", ")); //Une las palabras filtradas separadas por coma y espacio
   
   }
   
   //Implementacion
   public static void main(String[] args){
       List<String> palabras = List.of("Hola","mundo","en","Java","es","muy","divertido");
       int longitudMinima = 3;
       String resultado = concatenarPalabrasMasLargas(palabras, longitudMinima);
       System.out.println(resultado); //Imprime las palabras de mas de 3 caracteres de longitud
   
   }
   
}
