import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SendingAEmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> tarefas = new ArrayList<String>();

        for(int i = 0; i<10; i++) {
            System.out.println("tarefa " + (i + 1) + ": ");
            String tarefa = scanner.nextLine();

            tarefas.add(tarefa);
        }


    }
}
