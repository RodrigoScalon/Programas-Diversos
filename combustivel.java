import java.util.Scanner;
public class combustivel
{

        public static void main(String[] args) 
    { 
            Scanner Scan = new Scanner(System.in);

                int qn; 
                String cp;
                double total; 
                
                total=0;
            
                System.out.println("Digite o código do pedido (A - alcool) (G - gasolina): ");
                cp = Scan.nextLine();

                System.out.println("Digite quantos litros: ");
                qn = Scan.nextInt();

                switch (cp.charAt(0))  {

                    case 'G': 
                    total = 1.90 * qn;
                    break; 
                    case 'A': 
                    total = 2.50 * qn; 
                    break;
                }


                
                System.out.printf("Valor a pagar: %.2f%n ", +total);
                
    Scan.close();

}
}






