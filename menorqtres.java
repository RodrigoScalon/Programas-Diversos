import java.util.Scanner; 
public class menorqtres {

    public static void main (String[] args) 
    {

        Scanner Scan = new Scanner (System.in);

        int a,b,c; 

        System.out.println("Digite o valor 1: ");
        a=Scan.nextInt();
        System.out.println("Digite o valor 2: ");
        b=Scan.nextInt();
        System.out.println("Digite o valor 3: ");
        c= Scan.nextInt();


            if (a<b  && a<c) {

                System.out.println("O menor é: ");
                System.out.println(a);
            
            } else if  (b<a && b<c) { 
                System.out.println("O menor é: ");
                System.out.println(b);
                 } 
                 else if (c<a && c<b) {
                     System.out.println("O menor é: ");
                    System.out.println(c);
                 } 
                else if (a==b && c==a) {
                 System.out.println("O menor é: ");
                 System.out.println(a);
                } 


        Scan.close();



    }
}
