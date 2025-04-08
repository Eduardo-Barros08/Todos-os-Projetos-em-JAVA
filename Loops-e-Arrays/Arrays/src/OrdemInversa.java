//public class OrdemInversa {
//    public static void main(String[] args) throws Exception {
     
//    int[] vetor = {1, 2, 3, 4, 5, 6};

//    System.out.print("Vetor: ");
//    int count = 0;
//    while (count < (vetor.length)) {
//        System.out.print(vetor[count] + " ");
//        count++;
//    }

//    System.out.print("/nVetor: ");
//    for(int i = (vetor.length - 1); i >= 0; i--){
//        System.out.print(vetor[count] + " ");
//    }
//
//    }
//}

/// NOTE: O código acima está comentado e não será executado.
/// Abaixo está a versão MELHORADA do código:

import java.util.Scanner;

public class OrdemInversa {
    public static void main(String[] args) throws Exception {
         
    int[] vetor = new int[6];
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Digite 6 números inteiros: \n");

    for(int i = 0; i < vetor.length; i++){
        System.out.print("Número " + (i + 1) + ": ");
        vetor[i] = scan.nextInt();   //Lê número e atribui ao vetor na posição i; 
    } 
    scan.close();// Fecha o scanner para evitar vazamento de recursos


    System.out.print("\nVetor: ");
    int count = 0;
    while (count < (vetor.length)) {
        System.out.print(vetor[count] + " ");
        count++;
        }
    
    System.out.print("\nVetor: ");
      for(int i = (vetor.length - 1); i >= 0; i--){
        System.out.print(vetor[i] + " ");
        }
    }
}