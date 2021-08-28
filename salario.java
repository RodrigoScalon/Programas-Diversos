import java.util.Scanner; 
public class salario
 {

    public static void main (String[] args) 
    {

        Scanner texto = new Scanner (System.in);
        
        //nfuncionario, ht, valorh, salario 

        int nfuncionario, ht;
        double salario, valorh;

        System.out.println ("Digite o numero: ");
        nfuncionario=texto.nextInt();
        System.out.println("Digite as h trabalhadas");
        ht=texto.nextInt();
        System.out.println("Digite o valor da hora" );
        valorh=texto.nextDouble();

        salario = ht*valorh; 


        System.out.println ("NUMBER = " +nfuncionario);
        System.out.printf("SALARY = $ %.2f%n", +salario);
            


        texto.close();


    


    }
    


    


    }
    