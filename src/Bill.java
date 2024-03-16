import java.util.ArrayList;

public class Bill {
    private static ArrayList<Bill> bills = new ArrayList<>();
    private String product;
    private double value;
    private int qtd;
    private double tax;
    private double finalValue;

    public Bill(String product, double value, int qtd, double tax, double finalValue) {
        this.product = product;
        this.value = value;
        this.qtd = qtd;
        this.tax = tax;
        this.finalValue = finalValue;
        bills.add(this);
    }

    public static String getAllBills() {
        StringBuilder result = new StringBuilder();
        for (Bill bill : bills) {
            result.append("=======================================================\n")
                    .append("Produto: ").append(bill.product).append("\n")
                    .append("Valor sem imposto: ").append(bill.value).append("\n")
                    .append("Quantidade do produto: ").append(bill.qtd).append("\n")
                    .append("Valor do imposto: ").append(bill.tax).append("\n")
                    .append("Valor final: ").append(bill.finalValue).append("\n")
                    .append("=======================================================\n");
        }
        return result.toString();
    }

}
