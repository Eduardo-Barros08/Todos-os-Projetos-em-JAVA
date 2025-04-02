public class logicaCondicional {
    public static void main(String[] args) throws Exception {
        int i1 = 5;
        int i2 = 10;

        float f1 = (float) 4.5;
        float f2 = (float) 7.5;

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;
        
        System.out.println("b1 && b2 " + (b1 && b2));
        System.out.println("b1 && b3 " + (b1 && b3));
        System.out.println("b2 || b3 " + (b2 || b3));
        System.out.println("b2 || b4 " + (b2 || b4));
        System.out.println("b1 ^ b3 " + (b1 ^ b3));
        System.out.println("b4 ^ b1 " + (b4 ^ b1));
        System.out.println("!b1 , !b2 " + (!b1) + " " + (!b2));
        System.out.println("(i1 > i2) || (f2 < f1) " + ((i1 > i2) || (f2 < f1)));
        System.out.println("((i1 + i2) < (f2 - f1) && true " + (((i1 + i2) < (f2 - f1) && true)));

        double salarioMensal = 1830.0;
        double mediaSalario = 10000.0;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        System.out.println("salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes");

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        boolean recebeAuxilio = salarioBaixo && muitosDependentes;
        
        System.out.println("Recebe auxílio? " + recebeAuxilio);


    }
}
