/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//MATRIZ DE 10X1O INGRESADO POR TECLADO QUE SUME TODAS LA COLUMNAS IMPARES DE LA MATRIZ
package ejerciciomatriz1;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjercicioMatriz5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 2;
        int [][] matriz = new int[t][t];
        int [] sumF = new int [t];
        for(int i=0;i <matriz.length;i++){
        for(int j=0; j<matriz.length;j++){
            System.out.println("Ingrese el valor de la posicion : ["+i+"]["+j+"] = ");
            matriz[i][j] = sc.nextInt();
            //matriz[i][j] = sc.nextInt();
            if(j % 2 == 1){
             sumF[j] += matriz[i][j];
                          }
                                         }
                                         } 
        for(int i=0; i < matriz.length;i++){
            System.out.println(Arrays.toString(matriz[i]));
        } 
        for(int i=0; i < sumF.length;i++){
            if(i % 2 == 1){
                System.out.println("La suma de todas las columnas impares es : "+sumF[i]);
            }
        }
    }
}
