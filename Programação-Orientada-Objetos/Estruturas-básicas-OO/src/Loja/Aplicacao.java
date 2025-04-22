package Loja;

public class Aplicacao {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        
        Funcionario gerente = new Gerente();
        Funcionario faxineiro = new Faxineiro();
        Funcionario vendedor = new Vendedor();

        //Gerente gerente_ = new Funcionario();
        Vendedor vendedor_ = (Vendedor) new Funcionario();

    }
    
}
