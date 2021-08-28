import java.util.Scanner; 
public class merceria {

    public static void main (String[] args) 
    {

        Scanner Scan = new Scanner (System.in);

        double p, recebido, troco, falta; 
        int q; 

        System.out.println("Digite o valor do produto: ");
        p=Scan.nextDouble();
        System.out.println("Digite a quantidade: ");
        q=Scan.nextInt();
        System.out.println("Valor recebido: ");
        recebido=Scan.nextDouble();


        
        if (recebido >= (p*q))  {
            troco=recebido - (p*q);

            System.out.printf("O seu troco é: %.2f ", +troco);
        }
          else {

            falta = p*q - recebido; 
            System.out.printf("Dinheiro insuficiente, falta: %.2f ", +falta);
          }


        Scan.close();
        









    }
}

