import java.util.Scanner;

public class senha {



    public static void main(String[] args) {
    Scanner Scan = new Scanner (System.in);
    
        int senha;

    
        System.out.println("Digite a senha:");
        senha = Scan.nextInt();

            while (senha != 2002){
            System.out.printf("Senha inválida! Digite-a novamente: ");
            senha = Scan.nextInt();
      
                        }
        System.out.println("Acesso permitido!");

        Scan.close();


    }
    
}
