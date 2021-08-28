import java.util.Scanner;
public class para 

{

// estrutura FOR
// inicio ; condição ; incremento 
// quando ja se sabe a quantidade de repetições

/*  FOR 
 parte 1; parte 2; parte 3. 
 parte 1 = declaramos uma variavel 
 parte 2 = colocamos uma condição para o looping continue sendo executado
 parte 3 = aonde nós incrementamos ou decrementamos a nossa variavel
*/


    public static void main(String[] args) {
       
        Scanner Scan = new Scanner (System.in);

        int x = Scan.nextInt();
		
		for (int i=1; i<=x; i++) {  // inteiro i recebe 1. i menor igual a x; i recebe i; 
			if (i % 2 != 0) {  // se o resto da divisão for 0 é par. imprime os ímpares
				System.out.println(i);
			}
		}
        Scan.close();

          }
        
    }





