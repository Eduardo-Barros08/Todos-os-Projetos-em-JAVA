//Código para passar no desafio DIO
import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int paginasLidas = 3;
        int saida;
        

        int paginas = leitor.nextInt();
        saida = paginas / paginasLidas; //Multiplica a quantidade de páginas lidas pela quantidade de páginas
        
        System.out.println(saida + " dias.");

        leitor.close();
    }
    
}

//Código bem feito, mas que funciona para passar no desafio DIO

//import java.util.Scanner;

//public class Leitura {
//    public static void main(String[] args) {
//        Scanner leitor = new Scanner(System.in);
//        int paginasLidas = 3;
//        int saida;
//        
//
//        System.out.println("Insira o número de páginas");
//        int paginas = leitor.nextInt();
//        saida = paginasLidas / paginas; //Multiplica a quantidade de páginas lidas pela quantidade de páginas
//        
//        System.out.println("Voce lerá " + saida + " em " + paginas + "dias.");
//
//        leitor.close();
//    }
//    
//}