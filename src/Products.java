import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Products {
    public int qtdPurchased = 0;
    private ArrayList<Bill> bills = new ArrayList<>();
    private Scanner getInput = new Scanner(System.in);
    String[] prods = {"banana","maça","manga","morango"};
    double finalTax = 0;
    double finalValue = 0;
    private double taxes = 0.05;

    public void handleType(String Nprod){
        boolean encontrado = Arrays.asList(prods).contains(Nprod);
        if (encontrado){
            int value = switch (Nprod) {
                case "banana" -> 3;
                case "maça" -> 4;
                case "manga" -> 2;
                case "morango" -> 5;
                default -> 0;
            };
            if(value != 0)
                handleAccount(Nprod, value);
        }else {
            System.out.println("Não selecionou nenhuma das opções disponíveis");
        }
    }

    public void handleAccount(String prod, int value){
        System.out.print("Qual a quantidade: \n");
        int units = getInput.nextInt();
        int buy = value * units;
        double tax = buy * taxes;
        double price = buy + tax;
        Bill newBuy = new Bill(prod, buy, units, tax, price);
        bills.add(newBuy); // Adicionando a instância de Bill ao ArrayList
        finalTax += tax;
        finalValue += price;
        qtdPurchased = qtdPurchased + 1;
    }

}
