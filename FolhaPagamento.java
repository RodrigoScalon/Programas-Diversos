import java.util.Scanner;

public class FolhaPagamento {

    public static void main(String[] args) {

        double vh, ht, SalarioBruto, SalarioLiquido, TotalDescontos, IR, INSS, FGTS;

        INSS = 10;
        FGTS = 11;
        IR = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Entre com o valor da hora: ");
        vh = input.nextDouble();
        System.out.println("Quantidade de horas trabalhadas: ");
        ht = input.nextDouble();

        SalarioBruto = vh * ht;

        if (SalarioBruto <= 900) {
            IR = 0;
        } else if (SalarioBruto <= 1500) {
            IR = SalarioBruto / 100 * 5;

        } else if (SalarioBruto <= 2500) {
            IR = SalarioBruto / 100 * 10;
        } else if (SalarioBruto > 2500) {
            IR = SalarioBruto / 100 * 20;
        }

        TotalDescontos = INSS + IR + 100;
        INSS= SalarioBruto * 10/100;
        FGTS = SalarioBruto * 11 / 100;
        SalarioLiquido = SalarioBruto - TotalDescontos;

        System.out.println();

        System.out.printf("Salário Bruto: %.2f%n ", +SalarioBruto);
        System.out.println("-IR (5%): " +IR);
        System.out.println("-INSS: " +INSS);
        System.out.printf("TotalDescontos: %.2f%n ", +TotalDescontos);
        System.out.println("Valor FGTS (11%):" +FGTS);
        System.out.printf("Salário Liquido: %.2f%n ", +SalarioLiquido);

        input.close();

    }
}