import java.util.ArrayList;

public class Bill {
    private static ArrayList<Bill> bills = new ArrayList<>();
    private String produto;
    private double valor;
    private int qtd;
    private double imposto;
    private double valorFinal;

    public Bill(String produto, double valor, int qtd, double imposto, double valorFinal) {
        this.produto = produto;
        this.valor = valor;
        this.qtd = qtd;
        this.imposto = imposto;
        this.valorFinal = valorFinal;
        // Adicionando esta instância ao array
        bills.add(this);
    }

    // Método para exibir todas as instâncias
    public static String getAllBills() {
        StringBuilder result = new StringBuilder();
        for (Bill bill : bills) {
            result.append("=======================================================\n")
                    .append("Produto: ").append(bill.produto).append("\n")
                    .append("Valor sem imposto: ").append(bill.valor).append("\n")
                    .append("Quantidade do produto: ").append(bill.qtd).append("\n")
                    .append("Valor do imposto: ").append(bill.imposto).append("\n")
                    .append("Valor final: ").append(bill.valorFinal).append("\n")
                    .append("=======================================================\n");
        }
        return result.toString();
    }

}
