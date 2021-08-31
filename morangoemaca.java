import java.util.Scanner;

public class morangoemaca {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

            System.out.println("Entre com a quantidade (kg) de morango: ");
            double qntMorango = input.nextDouble();

            System.out.println("Entre com a quantidade (kg) de maça: ");
            double qntMaca = input.nextDouble();

            double precoKgMorango = 0;

            if(qntMorango <= 5) {
                precoKgMorango = 2.5;
            } else {
                precoKgMorango = 2.2;
            }

            double precoKgMaca = 0; 

            if(qntMaca <= 5) {
                precoKgMaca = 1.8;
            } else {
                precoKgMaca = 1.5;
            }

            double precoTotalMorango = qntMorango * precoKgMorango; 
            double precoTotalMaca = qntMaca * precoKgMorango; 

            double precoTotalParcial = precoTotalMaca + precoTotalMorango; 
            double precoTotal = 0;

            
            if ((qntMorango + qntMaca > 8 ) || (precoTotalParcial > 25)) {
                precoTotal = precoTotalParcial - ((precoTotalParcial /100) * 10); 
            }

            System.out.printf ("O preço total a pagar: %.2f%n ", +precoTotal);



        input.close();

        
    }
}

