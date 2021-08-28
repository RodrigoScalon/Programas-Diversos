import java.util.Scanner;
public class Empresa
{

     

    public static void main (String [] args)

{
    String nome, idade, prof, rg, cpf, mail, estado, cidade, cep, filme;

    
    Scanner dados = new Scanner (System.in);

    System.out.println("BEM-VINDO(A) A EMPRESA FILMES FRAGA.LTDA **** OBRIGADO POR ACESSAR NOSSO SITE!");
    System.out.println("Somos uma empresa que fornece o maior acervo de séries e filmes do mundo!");
    System.out.println("Por favor, responda as perguntas abaixo para fazer o seu cadastro!");

    System.out.println("Digite o seu nome: ");
    nome = dados.nextLine();

    System.out.println("Digite sua idade: ");
    idade=dados.nextLine();

    System.out.println("Digite sua profissão: ");
    prof=dados.nextLine();

    System.out.println("Digite o seu RG: ");
    rg=dados.nextLine();

    System.out.println("Digite o seu CPF: ");
    cpf=dados.nextLine();

    System.out.println("Qual o seu e-mail? ");
    mail=dados.nextLine();

    System.out.println("Informe o seu estado de residência: ");
    estado=dados.nextLine();

    System.out.println("Digite sua cidade: ");
    cidade=dados.nextLine();

    System.out.println("Qual o seu CEP: ");
    cep=dados.nextLine();

    System.out.println("Qual o seu gênero de filme favorito? ");
    filme=dados.nextLine();


    System.out.println("CADASTRO REALIZADO COM SUCESSO!!");
    System.out.println("CONFIRA SEUS DADOS ABAIXO!");
    
    System.out.println("Seu nome é: " +nome);
    System.err.println("Sua idade é: " +idade);
    System.out.println("Sua profissão atual é: " +prof);
    System.out.println("Seu RG: " +rg);
    System.out.println("Seu CPF: " +cpf);
    System.out.println("Seu estado civil atual: " +mail);
    System.out.println("Você reside no: " +estado);
    System.out.println("Sua cidade é: " +cidade);
    System.out.println("O seu CEP: " +cep);
    System.out.println("Seu gênero preferido é: " +filme);

    System.out.println("*********************");
    System.out.println("Não esqueça!!! Você receberá no seu email: " +mail + " as novidades sobre o seu gênero de filmes favorito que é: " +filme);

    System.out.println("FILMES FRAGA.LTDA AGRADECE!");



dados.close();

}
}
