import java.util.Scanner; 
    
public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int entrada;
        int mesada = 50;
        int saida;
        
        
        System.out.println("Insira a quantidade de meses: ");
        entrada = leitor.nextInt();//Pega a quantidade de meses
        
        saida = mesada * entrada; //Multiplica a mesada pela quantidade de meses
        System.out.println("Voce juntou a mesada por " + entrada + " meses: ");
        System.out.println("Sua mesada é de " + mesada + " reais. ");
        System.out.println("Voce tera " + saida + " reais");
        
      leitor.close();
        
    }
}


///Versão mais simples  do código para passar no desafio DIO
//import java.util.Scanner; 
    
//public class App {
//    public static void main(String[] args) {
//        Scanner leitor = new Scanner(System.in);
//        int entrada;
//        int mesada = 50;
//        int saida;
//        
//        
//        System.out.println("Insira a quantidade de meses: ");
//        entrada = leitor.nextInt();//Pega a quantidade de meses
//        
//        saida = mesada * entrada; //Multiplica a mesada pela quantidade de meses
//        System.out.println("Voce tera " + saida + " reais");
//        
//      leitor.close();
//        
//    }
//}
