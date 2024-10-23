package AlgoritmosBasicos;

import AlgoritmosBasicos.Clases.Algoritmos;

public class Aplicacion {
    public static void main(String[] args) {
        System.out.println("es Par? ");
        System.out.println("2 es par? " + Algoritmos.esPart(2));
        System.out.println("7 es par? " + Algoritmos.esPart(7));
        System.out.println("--------");

        System.out.println("es Primo? ");
        System.out.println("5 es primo? " + Algoritmos.esPrimo(5)); 
        System.out.println("10 es primo? " + Algoritmos.esPrimo(10)); 
        System.out.println("--------");

        System.out.println("Pruebas de Reversa:");
        System.out.println("Reversa de 'Hola'es: " + Algoritmos.stringEnReversa("Hola")); 
        System.out.println("--------");

        System.out.println("Pruebas de Palindromo:");
        System.out.println("es 'radar' un palíndromo? " + Algoritmos.esPalindromo("radar")); 
        System.out.println("es 'hola' un palíndromo? " + Algoritmos.esPalindromo("hola")); 
        System.out.println("--------");

        System.out.println("Prueba de Secuencia:");
        Algoritmos.secuenciaFizzBuzz(15); 
        System.out.println("--------");
    }
}
