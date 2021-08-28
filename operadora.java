import java.util.Scanner; 
public class operadora {

    public static void main (String[] args) 
    {

        Scanner Scan = new Scanner (System.in);

        int m,pb,pe,t,vpb;

        pb=100;
        vpb=50;

        System.out.println ("Entre com os minutos: ");
        m=Scan.nextInt();

        if (m <= 100) {
            System.out.println("Valor total de R$ 50,00");
        }
            else if (m>100) {
                pe=(m-pb)*2; 
                t=vpb+pe;    

                System.out.printf("O valor total é R$: " +t);
            }


        Scan.close();

 
 
    }
}