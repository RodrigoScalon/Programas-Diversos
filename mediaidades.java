import java.util.Scanner;
public class mediaidades
{

        public static void main(String[] args) 
    { 
            Scanner input = new Scanner(System.in); 

            int x, soma, cont; // ler numero indeterminado de idades
            double m; // ler a media das idades digitadas 

            soma=0;
            cont=0;

            System.out.println("Digite a idade: "); // não esquecer de ler novamente a idade
            x=input.nextInt(); // se não ler novamente a idade vai entrar em loop infinito

                while (x>=0) {

                    soma=soma+x; 
                    cont=cont+1; 

                    x=input.nextInt();
                }

                if (cont<=0) {

                    System.out.println("IMPOSSIVEL CALCULAR!");
                }
                else { 
                m=soma/cont;
                    System.out.printf ("MEDIA = %.2f ", +m);
                }


        input.close();

    }
}