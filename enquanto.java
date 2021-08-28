import java.util.Scanner;
public class enquanto 

{
    
    public static void main(String[] args) 
    {
    Scanner Scan = new Scanner (System.in);
    
        int x = Scan.nextInt();

            // while usado quando se sabe a quantidade de repetições a ser efetuada
        // enquanto o x for diferente de 0 vai ficar pedindo pro usuário digitar o numero 
        int soma =0;

        while (x != 0) {
            // esse programa vai somar todos os valores digitados até que o 0 seja digitado
            soma = soma+x;
            x = Scan.nextInt();
        } 

            System.out.println("O valor soma = " +soma);

    Scan.close();



    }
}
