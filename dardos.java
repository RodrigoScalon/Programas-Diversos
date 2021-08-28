import java.util.Scanner; 
public class dardos {

    public static void main (String[] args) 
    {

        Scanner Scan = new Scanner (System.in);

        double x,y,z;

        System.out.println("Entre com o primeiro arremesso: ");
        x=Scan.nextDouble();
        System.out.println("Entre com o segundo arremesso: ");
        y=Scan.nextDouble();
        System.out.println("Entre com o terceiro arremesso: ");
        z=Scan.nextDouble();

        if (x>y && x>z)  {
            System.out.println("Maior arremesso: "  +x);
        }
        else if (y>x && y>z) {
            System.out.println("Maior arremesso: " +y);
        
        }
        else if (z>x && z>y) {
            System.out.println("Maior arremesso: " +z);

        }


            Scan.close();


    }

}

