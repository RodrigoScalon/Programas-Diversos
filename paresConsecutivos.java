import java.util.Scanner;
public class paresConsecutivos     //ESTE PROGRAMA LE A SOMA DOS 5 PARES CONSECUTIVOS 
{

        public static void main(String[] args) 
    { 
            Scanner input = new Scanner(System.in);

            int x, soma;


            System.out.println("Digite um número inteiro: "); // se for impar incrementa +1
            x=input.nextInt();


                while (x!=0) {

                if (x%2!=0) { // se o x for impar "resto da divisão não for zero"

                    x=x+1;
                    
                    soma=(5*x)+20; // soma=x+2+x+4+x+6+x+8; 

            System.out.println("Soma é igual:" +soma);

            System.out.println("Digite um número inteiro: ");
            x=input.nextInt();

                }
                else if (x%2==0) { // se o x for par "o resto da divisão for zero"
                    
                    x=x+1;
                    
                    soma=(4*x)+20; // soma=x+2+x+4+x+6+x+8; 

            System.out.println("Soma é igual:" +soma);

            System.out.println("Digite um número inteiro: ");
            x=input.nextInt();

                }

            }

            input.close();

    }
}
