public class controleFluxo {
    
        public static void main(String[] args) throws Exception {
        
            int mes = 0;
            
            System.out.println("Digite o número do mês: ");
            mes = Integer.parseInt(System.console().readLine());
    
    
            if (mes == 1) {
                System.out.println("Janeiro");
            } else if (mes == 2) {
                System.out.println("Fevereiro");
            } else if (mes == 3) {
                System.out.println("Março");
            } else if (mes == 4) {
                System.out.println("Abril");
            } else if (mes == 5) {
                System.out.println("Maio");
            } else if (mes == 6) {
                System.out.println("Junho");
            } else if (mes == 7) {
                System.out.println("Julho");
            } else if (mes == 8) {
                System.out.println("Agosto");
            } else if (mes == 9) {
                System.out.println("Setembro");
            } else if (mes == 10) {
                System.out.println("Outubro");
            } else if (mes == 11) {
                System.out.println("Novembro");
            } else if (mes == 12) {
                System.out.println("Dezembro");
            } else {
                System.out.println("Mês inválido");
            }
    
            if (mes == 1 || mes == 6 || mes == 10) {
                System.out.println("Férias!!!");   
            }
    
        
        String dia = "Domingo" ;
        System.out.println("Digite o nome da semana: ");
        dia = System.console().readLine();
       
       
        switch (dia) {
            case "Domingo":
                System.out.println("1\n");

                break;
           
            case "Segunda":
                System.out.println("2\n");
                break;
            
            case "Terça":
                System.out.println("3\n");

                break;
            case "Quarta":
                System.out.println("4\n");

                break;
            case "Quinta":
                System.out.println("5\n");

                break;
            case "Sexta":
                System.out.println("6\n");

                break;
            case "Sábado":
                System.out.println("7\n");

                break;
        
            default:
                System.out.println("Número Inválido!! Escreva os números de 1 a 7\n");
                break;
        }
    }
}
