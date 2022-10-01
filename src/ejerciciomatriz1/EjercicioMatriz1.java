/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//MATRIZ DE 10X1O INGRESADO POR TECLADO SUME LA DIAGONAL PRIMARIA Y SECUNDARIA
package ejerciciomatriz1;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class EjercicioMatriz1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declaramos las variables
        int [][] matriz = new int[3][3];//Matriz
        int DiagonalPrincipal = 0;
        int DiagonalSecundaria = 0;
        for(int i=0;i <matriz.length;i++){
            for(int j=0; j<matriz.length;j++){
                System.out.println("Ingrese el valor de la posicion : ["+i+"]["+j+"] = ");
                matriz[i][j] = sc.nextInt();
                if(i == j){
                    DiagonalPrincipal = matriz[i][j];
                }      
                if(i+j == (matriz.length - 1)){
                    DiagonalSecundaria = matriz[i][j];
                }
                                             }
                                         }  
        //Imprimir la matriz
        for(int i=0; i < matriz.length;i++){
            System.out.println(Arrays.toString(matriz[i]));
                                           } 
        System.out.println("La suma de la diagonal primaria es : "+DiagonalPrincipal);
        System.out.println("La suma de la diagonal secundaria es : "+DiagonalSecundaria);
    }
}
