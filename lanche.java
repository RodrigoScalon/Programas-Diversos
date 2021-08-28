import java.util.Scanner;
public class lanche
{

        public static void main(String[] args) 
    { 
            Scanner Scan = new Scanner(System.in); 

            int cp,q;
            double total;
            total=0;
                
                System.out.println("Digite o código do pedido: ");
                cp=Scan.nextInt();
                System.out.println("Digite a quantidade: ");
                q=Scan.nextInt();
                

                switch (cp) {

                case 1: 
                total = 5.00 * q;
                break; 
                case 2: 
                total = 3.50 * q; 
                break; 
                case 3: 
                total = 4.80 * q; 
                break; 
                case 4: 
                total = 8.90 * q; 
                break; 
                case 5: 
                total = 7.32 * q; 
                break;

                }
                System.out.printf("Valor a pagar: %.2f", +total);

                Scan.close();


    }
}

