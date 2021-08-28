import java.util.Scanner;
public class crescente
{

        public static void main(String[] args) 
    { 
            Scanner input = new Scanner(System.in);
 
            int x,y; 
            
            System.out.println("Digite dois valores: ");
            x=input.nextInt();
            y=input.nextInt();

            while (x!=y) {

                if (x<y){
                System.out.println("CRESCENTE");
                } 
                else {
                System.out.println("DECRESCENTE");
                }

                System.out.println("Digite outros dois valores: ");
                x=input.nextInt();
                y=input.nextInt();
   
            }
            
        
            input.close();

            }

                }
                

 
        
