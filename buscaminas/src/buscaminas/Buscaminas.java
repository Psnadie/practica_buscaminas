package buscaminas;
import java.util.Scanner;
public class Buscaminas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean juego = false;
        int dif = 0;
        int filas = 0;
        int columnas = 0;
        int bombas = 0;
        do{
            System.out.println("bienvenido a el buscaminas de Nicolas Lopez 1DAPLIWEB");
            System.out.println("por favor ingrese la dificultad del juego: [1 facil][2 dificil][3 experto][4 personalizada]");
            dif = sc.nextInt();
            switch(dif){
                case 1 -> {
                    System.out.println("hola");
                    filas = 8;
                    columnas = 8;
                    bombas = 10;
                }
                case 2 -> {
                    System.out.println("hola 2");
                    filas = 16;
                    columnas = 16;
                    bombas = 40;
                }
                case 3 -> {
                    filas = 16;
                    columnas = 30;
                    bombas = 99;
                }
                case 4 -> {
                    System.out.println("ingrese el numero de filas que desea");
                    filas = sc.nextInt();
                    System.out.println("ingrese el numero de columnas que desea");
                    columnas = sc.nextInt();
                    System.out.println("ingrese el numero de bombas que desea");
                    bombas = sc.nextInt();
                }
            }
            int[][] matriz = new int[filas][columnas];
            for(int i = 0; i <filas ; i++){
                for(int j = 0; j <columnas ; j++){
                    matriz[i][j] = 0;
                }
            }
            for(int i = 0; i <filas ; i++){
                for(int j = 0; j <columnas ; j++){
                    System.out.println(matriz[i][j]);
                }
            }
        }while(!juego);
    }
    
}
