import java.util.Scanner;

public class gasolina {
    
// 1 alcool 2 gasolina 3 diesel 4 fim 


    public static void main(String[] args) {

            Scanner Scan = new Scanner (System.in);

    int alcool = 0;
    int gasolina = 0;   //variveis declaradas valendo '0'
    int diesel = 0;


        System.out.println("Para alcool 1, gasolina 2, diesel 3 e para encerrar o 4");
        System.out.println("Digite o código do produto: ");
        
        int tipo = Scan.nextInt();

            
            while (tipo !=4)  {

                if ( tipo == 1){
                    alcool = alcool +1; 
                }
                else if (tipo == 2) {
                    gasolina = gasolina + 1;
                }
                else if (tipo == 3) {
                    diesel = diesel + 1; 
                }

            tipo=Scan.nextInt(); // digitando o 4 correspondente a variavel "tipo" encerra o programa
            }                

            System.out.println("MUITO OBRIGADO");
            System.out.println("Alcool: " + alcool);
            System.out.println("Gasolina: " + gasolina);
            System.out.println("Diesel: " + diesel);


                Scan.close();
            }









    }
















