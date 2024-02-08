import java.util.Scanner;

public class FamilyCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double total = 0.0;
        System.out.println("Favor, insira o valor da conta de luz:");
        total += scanner.nextDouble();
        System.out.println("Favor, insira o valor da conta de água:");
        total += scanner.nextDouble();
        System.out.println("Favor, insira o valor da conta de telefone:");
        total += scanner.nextDouble();
        System.out.println("Favor, insira o valor da conta filho:");
        total += scanner.nextDouble();
        System.out.println("Favor, insira o valor da conta cartão:");
        total += scanner.nextDouble();
        System.out.println("Favor, insira o valor dos gastos com supermercado:");
        total += scanner.nextDouble();

        System.out.println("O gasto total da família no mês atual foi R$ : " + total);
    }
}
