import java.util.Scanner;

public class equals{

    public static void main(String[] args) {
        

        Scanner input = new Scanner (System.in);


        System.out.println("Entre com a letra F ou M: ");
        String a = input.next();

        if (a.equalsIgnoreCase("F")){

            System.out.println("Feminino.");
        } 
        else if (a.equalsIgnoreCase("M")) {

            System.out.println("Masculino.");
        } 
        else {
            System.out.println("Inválido.");
        }







        input.close();




    }





}