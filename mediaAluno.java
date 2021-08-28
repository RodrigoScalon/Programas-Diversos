import java.util.Scanner;
public class mediaAluno
{

        public static void main(String[] args) 
    { 
            Scanner input = new Scanner(System.in);

            double m, n1, n2; 

            System.out.println("Digite a primeira nota do aluno: ");
            n1=input.nextDouble();
            

                while (n1<0 || n1 >10) {

                System.out.println("Valor inválido! Insira novamente: ");
                n1=input.nextDouble();
                    }
                    
            System.out.println("Digite a segunda nota do aluno: ");
            n2=input.nextDouble();
                    
        
                while (n2<0 || n2 >10) {
        
                System.out.println("Valor inválido! Insira novamente: ");
                n2=input.nextDouble();
                            }
        
                m=(n1+n2)/2; 
                System.out.printf ("MEDIA: %.2f", +m);


            input.close();

    }


}


