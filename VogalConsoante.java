import java.util.Scanner;

public class VogalConsoante {


public static void main(String[] args) {
    

    Scanner input = new Scanner(System.in);

    System.out.println("Digite uma letra: ");
    String letra = input.next();

    if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || 
    letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u") ) {

        System.out.println("VOGAL");
    }
    else {
        System.out.println("CONSOANTE");

    }
    
input.close();

}
}