import java.util.Scanner;

public class MaleouFemale{


    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);

        System.out.println("Digite o sexo: (m/f)");
    char response = input.next().charAt(0);

    if(response == 'm') {

        System.out.println("Sexo é Masculino! ");
           }
    else {
        System.out.println("Sexo feminino!");
    }




input.close();


    }



}