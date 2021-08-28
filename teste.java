import java.util.Scanner;
public class teste {


    public static void main(String[] args) 
    {
        Scanner Scan = new Scanner (System.in);

        double a,r;

        System.out.println("Entre como o valor do circulo:" );
        r=Scan.nextDouble();

        a=Math.PI * (Math.pow(r, 2));

        System.out.printf("area = %.3f", +a);

Scan.close();






    }


}