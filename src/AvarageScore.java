import java.util.Scanner;

public class AvarageScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Favor, insira a pontuação da matéria de português");
        Integer portuques = scanner.nextInt();
        System.out.println("Favor, insira a pontuação da matéria de matemática");
        Integer matematica = scanner.nextInt();
        Integer somaMedias = portuques + matematica;

        if((matematica >= 60 && portuques >= 60) && (somaMedias >= 150)) {
            System.out.println("Parabéns, você consegui a vaga!");
        } else {
            System.out.println("Você é burro!");
        }
    }
}
