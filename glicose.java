import java.util.Scanner; 
public class glicose {

    public static void main (String[] args) 
    {

        Scanner Scan = new Scanner (System.in);

        double x,y;
        
        System.out.println("Digite o número: ");
        x=Scan.nextDouble();
        y=140;

        if (x<=100) 
        System.out.println("Classificação: Normal");
        if (x>100 && x<=y)
        System.out.println("Classificação: Elevado");
        if (x>y)
        System.out.println("Classificação: Diabetes");



        Scan.close();

        


    }

}
