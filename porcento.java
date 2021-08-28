import java.util.Scanner;
public class porcento
{

        public static void main(String[] args) 
    { 
            Scanner input = new Scanner(System.in); 

                double salario, novoSalario, aumento,p; 

                System.out.println("Digite o seu salário: ");
                salario=input.nextDouble();
                
                if (salario<1000.00) {

                    p=salario/100*20;
                    novoSalario = salario  + p; 
                    aumento = novoSalario - salario;                
                

                System.out.printf ("O novo salário é R$: %.2f %n", +novoSalario);
                System.out.printf ("Aumento de R$: %.2f %n", +aumento);
                System.out.println("O percentual é de 20%");
                }

                else if (salario>100.00 && salario< 3000.00)  {
 
                    p=salario/100*15;
                    novoSalario = salario  + p; 
                    aumento = novoSalario - salario; 

                System.out.printf ("O novo salário é R$: %.2f %n", +novoSalario);
                System.out.printf ("Aumento de R$: %.2f %n", +aumento);
                System.out.println("O percentual é de 15%");

                }

                else if (salario> 3000.00 && salario<= 8000.00) {

                    p=salario/100*10;
                    novoSalario = salario  + p; 
                    aumento = novoSalario - salario; 

                System.out.printf ("O novo salário é R$: %.2f %n", +novoSalario);
                System.out.printf ("Aumento de R$: %.2f %n", +aumento);
                System.out.println("O percentual é de 10%");
                }

                else if (salario> 8000.00) {

                    
                    p=salario/100*5;
                    novoSalario = salario  + p; 
                    aumento = novoSalario - salario; 

                System.out.printf ("O novo salário é R$: %.2f %n", +novoSalario);
                System.out.printf ("Aumento de R$: %.2f %n", +aumento);
                System.out.println("O percentual é de 5%");


                }



        input.close();


    }
}