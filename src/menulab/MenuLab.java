/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menulab;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class MenuLab {

    static void PalabrasAlrevez (){
        //Diccionario de Variables
        Scanner entradaDatos = new Scanner(System.in);
        String palabra, palabraInvertida;
        int Repetir = 1;

        while (Repetir == 1){
            //Entrada - Se ingresa la palbra
            System.out.print("Ingrese una palabra y le daremos vuelta!! \n");
            palabra = entradaDatos.next();

            //Proceso - String builder reversa la palabra
            palabraInvertida = new StringBuilder(palabra).reverse().toString();

            //Salida
            System.out.println("La palabra " + palabra + " en reversa es: " + palabraInvertida);
        
            //Repetir o cerrar ciclo
            System.out.println("Desea seguir? si(1) no(0): ");
            Repetir = entradaDatos.nextInt();
        }
        
    }
    
    static void NumerosPerfectos (){
        //Diccionario de Variables
        Scanner entradaDatos = new Scanner(System.in);
        int Num, Repetir = 1, Divisores = 0;
        boolean EsPerfecto = true;
        
        //Ciclo
        while (Repetir == 1){
            System.out.print("Ingrese un numero y veremos si es perfecto: ");
            Num = entradaDatos.nextInt();
            
            //Validador - Valida si es primo o no
            for (int i = 1; i < Num; i++){ 
                if (Num % i == 0){
                    Divisores += i;
                    System.out.print(i);
                }             
            }
            if (Divisores == Num){
                EsPerfecto = true;
            } else {EsPerfecto = false;}
            
            //Salida
            String Respuesta = (EsPerfecto? " es perfecto " : " no es perfecto ");
            System.out.print("El numero " + Num + Respuesta);
            Divisores = 0;
            
            //Seguir ciclo
            System.out.println("Desea Seguir? si(1) no(0): ");
            Repetir = entradaDatos.nextInt(); //Termina o sigue el ciclo            
            
            
        }
        
    }
    
    static void NumerosPrimos (){
        //Diccionario de Variables
        Random Random = new Random();
        int Num, Repetir = 1; 
        boolean EsPrimo = true;
        Scanner entradaDatos = new Scanner(System.in);
        
        //Ciclo - Aqui la maquina escoge un numero aleatorio y se valida si es primo o no
        while (Repetir == 1){
            Num = Random.nextInt(100);   
            String Divisores = "\nLos divisores de " + Num + " son: ";
            
            //Validador - Valida si es primo o no
            for (int i = 2; i < Num; i++){ 
                if (Num % i == 0){
                    EsPrimo = false;
                    Divisores += i + ", ";
                }             
            }
            
            //Salida
            String Respuesta = (EsPrimo? " es primo" : " no es primo");
            
            System.out.println(Num + Respuesta + Divisores);
            System.out.println("Desea Seguir? si(1) no(0): ");
            Repetir = entradaDatos.nextInt(); //Termina o sigue el ciclo
        }
    }
    
    
    static void Votaciones (){
        //Diccionario de Variables
        Scanner entradaDatos = new Scanner(System.in);
        int vAzules = 0, vNegros = 0, vRojo = 0, vAmarrillo = 0, votosValidos, cantVotos, porcentaje, Ganadora, Repetir = 1;
        
        while (Repetir == 1){
            //Entrada
            System.out.print("Ingrese cuantos votos se ingresaran: ");
            cantVotos = entradaDatos.nextInt();

            //Ciclo - Se ingresa cada voto individual segun la cantidad de votos
            for (int i = 0; i < cantVotos; i++){
                System.out.print("Ingrese su voto en mayuscula (AZUL, ROJO, NEGRO, AMARILLO): ");
                String votos = entradaDatos.next();
                
                switch (votos){
                    case "AZUL":
                        vAzules++;
                        break;

                    case "ROJO":
                        vRojo++;
                        break;

                    case "NEGRO":
                        vNegros++;
                        break;

                    case "AMARILLO":
                        vAmarrillo++;
                        break;
                    default: System.out.println("voto nulo");
                    }
            }
            //Proceso - Suma los votos validos totales y calculo de votos validos
            votosValidos = vAzules + vRojo + vNegros + vAmarrillo;
            porcentaje = (votosValidos / cantVotos) * 100;
            Ganadora = Math.max(vAzules, Math.max(vRojo, Math.max(vNegros, vAmarrillo)));

            if (porcentaje < 60){
                    System.out.println("Votacion invalida!!!");
                    break;
                }

            //Salida - Valida el voto mayor valido
            if (Ganadora == vAzules){
                System.out.println("La plantilla ganadora es Azul con: " + vAzules);
            }
            else if(Ganadora == vRojo){
                System.out.println("La plantilla ganadora es Rojo con: " + vRojo);
            }
            else if(Ganadora == vNegros){
                System.out.println("La plantilla ganadora es Negros con: " + vNegros);
            } else if(Ganadora == vAmarrillo){
                System.out.println("La plantilla ganadora es Amarills con: " + vAmarrillo);
            }

            //Repeir o terminar ciclo
            System.out.println("Desea seguir? si(1) no(0): ");
            Repetir = entradaDatos.nextInt();
        
        }
    }
    
    public static void main(String[] args) {
        //Diccionario de Variables
        Scanner entradaDatos = new Scanner(System.in);
        int MenuMain, n1 = 0, n2 = 0, n3 = 0, n4 = 0;
        
        //Menu Principal
        while (1 == 1){
            System.out.print("*** Bienvenido a Estructura *** \nOpciones. \n1.- Palabras Alrevez \n2.- Numero Perfecto \n3.- Primos \n4.- Votaciones \n5.- Salir \nSeleccione una opcion: ");
            MenuMain = entradaDatos.nextInt();
            switch (MenuMain){
                case 1 -> {
                    PalabrasAlrevez();
                    n1++;
                }
                case 2 -> {
                    NumerosPerfectos();
                    n2++;
                }
                case 3 -> {
                    NumerosPrimos();
                    n3++;
                }
                case 4 -> {
                    Votaciones();
                    n4++;
                }
                case 5 -> {
                    System.out.println("Se abrio: \nPalabras alrevez: " + n1 + "\nNumero Perfectos: " + n2 + "\nNumeros Primos: " + n3 + "\nVotaciones: " + n4);
                    System.out.println("\nCerrando programa... \n");
                    System.exit(0);
                }
            }
        }
        
        
        
        
    }   


}
