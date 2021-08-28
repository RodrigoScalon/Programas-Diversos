import java.util.Scanner;
public class terreno {


    public static void main(String[] args) 
    {
    
        Scanner Scan = new Scanner (System.in);

            double L,C,X,T,M; 

            System.out.println("Digite a largura: ");
            L = Scan.nextDouble();
            System.out.println("Digite o cumprimento: ");
            C =Scan.nextDouble();

            X = L*C;

            System.out.println("Qual o valor do metro quadrado?" );
            M = Scan.nextDouble();

            T = M*X;

            System.out.println("Area do terreno = " +X);
            System.out.println("Preço do terreno =" +T );

            Scan.close();
            














    }
    
}

