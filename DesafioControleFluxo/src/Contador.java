import java.util.Scanner;

public class Contador {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro parâmetro:");
        int param1 = scan.nextInt();

        System.out.println("Informe o segundo parâmetro:");
        int param2 = scan.nextInt();
        
        try {
            Contar(param1,param2);

        } catch (ParametrosInvalidosException e) {
            System.out.println("Houve uma exceção ao executar a validacao");
        }
        
    }
    static void Contar(int parametro1, int parametro2) throws ParametrosInvalidosException 
    {
        if(parametro2<=parametro1){
            throw new ParametrosInvalidosException();
        } else {
            int diferenca  = parametro2-parametro1;
            for(int i = 1;i<=diferenca;i++){
                System.out.println("Imprimindo o número: "+i);
            }
        }           
    }
}
