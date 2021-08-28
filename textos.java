import java.util.Scanner;
public class textos
{

public static void main(String[] args) 

{
// chamar o Scanner e colocar o atalho
    Scanner Scan = new Scanner (System.in);

    // declara as variáveis do tipo (int, String, Char,  double, etc..)

    String s1, s2, s3;

    // pedir para o usuário digitar ou apenas lançar 

    s1 = Scan.nextLine();
    s2 = Scan.nextLine();
    s3 = Scan.nextLine();

    System.out.println("Digite os dados: ");
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);

    // MACETE IMPORTANTE!!! CUIDADO AO MUDAR DE INT. PARA NEXTLINE. 
    // PARA CONSUMIR A QUEBRA DE LINHA PENDENTE, UTILIZAR UM NEXTLINE ANTES, POR EX: 
    // Scan.nextLine();

    


    
    Scan.close();
    

    



}        

}







