import java.util.Scanner;
public class notas

{

    public static void main(String[] args) 
    {
        Scanner Scan = new Scanner (System.in);

        double n1,n2,nf;

        System.out.println("Digite a primeira nota: ");
        n1=Scan.nextDouble();
        System.out.println("Digite a segunda nota: ");
        n2=Scan.nextDouble();

        nf=n1+n2; 

        if (nf < 60.0)
        {
            System.out.println("REPROVADO");
            System.out.printf("nota final: %.2f =", +nf);


            }
            
            else {
            System.out.printf("APROVADO! NOTA FINAL: %.2f!", +nf);

            }
        
            Scan.close();

        }
        

    }


        

    
