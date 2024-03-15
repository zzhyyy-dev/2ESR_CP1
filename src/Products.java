import java.lang.reflect.Array;
import java.util.Scanner;

public class Products {
    int index = 0;
    String products = "";
    String qtd = "";
    Scanner getInput = new Scanner(System.in);
    double finalValue = 0;
    String prod;
    private double taxes = 0.05;
    public void HandleType(String Nprod){
        prod = Nprod;
        switch (Nprod){
            case "banana":
                HandleAccount(5);
                break;
            case "maça":
                HandleAccount(10);
                break;
            default:
                System.out.println("nao selecionou nenhuma das opções disponíveis");
        }
    }
    public void HandleAccount(int value){
        System.out.print("Qual a quantidade: \n");
        int units = getInput.nextInt();
        int buy = value * units;
        double tax = buy * taxes;
        double price = buy + tax;
        finalValue = finalValue + price;
        Bill newBuy = new Bill(prod,buy,units,tax,price);
        products = products + "," +prod;
        qtd = qtd + "," + units;
    }
}
