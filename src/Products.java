import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Products {
    private int qtdPurchased = 0;
    private ArrayList<Bill> bills = new ArrayList<>();
    private Scanner getInput = new Scanner(System.in);
    private String[] products = {"banana","maça","manga","morango"};
    private double finalTax = 0;
    private double finalValue = 0;
    private double tax = 0.05;

    public void handleType(String Nprod){
        boolean in = Arrays.asList(products).contains(Nprod);
        if (in){
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
    private void handleAccount(String prod, int value){
        System.out.print("Qual a quantidade: \n");
        int units = getInput.nextInt();
        int buy = value * units;
        double taxes = buy * tax;
        double price = buy + taxes;
        Bill newBuy = new Bill(prod, buy, units, taxes, price);
        bills.add(newBuy);
        finalTax += taxes;
        finalValue += price;
        qtdPurchased += 1;
    }
    public double getFinalTax() {
        return finalTax;
    }
    public double getFinalValue() {
        return finalValue;
    }

    public int getQtdPurchased() {
        return qtdPurchased;
    }

    public String[] getProducts() {
        return products;
    }
}
