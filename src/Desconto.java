import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valor = scanner.nextDouble();
        if(valor >= 100.00) {
            double desconto = valor * 0.10;
            double valorComDesconto = valor - desconto;
            System.out.println("R$ " + valorComDesconto);
        } else {
            System.out.println("R$ " + valor);
        }
    }
}
