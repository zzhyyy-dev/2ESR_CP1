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
        String prod = Nprod;
        boolean encontrado = Arrays.asList(prods).contains(Nprod);
        if (encontrado){
            int value;
            switch (Nprod){
                case "banana":
                    value = 3;
                    break;
                case "maça":
                    value = 4;
                    break;
                case "manga":
                    value = 2;
                    break;
                case "morango":
                    value = 5;
                    break;
                default:
                    value = 0;
            }
            if(value != 0)
                handleAccount(prod, value);
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

    // Método para exibir todas as instâncias
    public String getAllBills() {
        StringBuilder result = new StringBuilder();
        for (Bill bill : bills) {
            result.append("=======================================================\n")
                    .append("Produto: ").append(bill.getProduto()).append("\n")
                    .append("Quantidade do produto: ").append(bill.getQtd()).append("\n")
                    .append("Valor sem imposto: ").append(bill.getValor()).append("\n")
                    .append("Valor do imposto: ").append(bill.getImposto()).append("\n")
                    .append("Valor final: ").append(bill.getValorFinal()).append("\n")
                    .append("=======================================================\n");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Products products = new Products();
        // Exemplo de uso
        products.handleType("banana");
        products.handleType("maça");
        products.handleType("manga");

        // Exibindo todas as instâncias
        System.out.println(products.getAllBills());
    }
}
