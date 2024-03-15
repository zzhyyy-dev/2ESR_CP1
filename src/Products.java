import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Products {
    String products = "";
    int qtdPurchased = 0;
    Scanner getInput = new Scanner(System.in);
    double finalValue = 0;
    String prod;
    String[] prods = {"banana","maça","manga","morango"};
    double finalTax = 0;
    private double taxes = 0.05;
    public void handleType(String Nprod){
        prod = Nprod;
        boolean encontrado = Arrays.asList(prods).contains(Nprod);
        if (encontrado){
            switch (Nprod){
                case "banana":
                    handleAccount(3);
                    break;
                case "maça":
                    handleAccount(4);
                    break;
                case "manga":
                    handleAccount(2);
                    break;
                case "morango":
                    handleAccount(5);
                    break;
            }
        }else {
            System.out.println("nao selecionou nenhuma das opções disponíveis");
        }


    }
    public void handleAccount(int value){
        System.out.print("Qual a quantidade: \n");
        int units = getInput.nextInt();
        int buy = value * units;
        double tax = buy * taxes;
        double price = buy + tax;
        Bill newBuy = new Bill(prod,buy,units,tax,price);
        finalTax = finalTax + tax;
        finalValue = finalValue + price;
        products = products + prod + "," ;
        qtdPurchased = qtdPurchased + 1;
    }
}
