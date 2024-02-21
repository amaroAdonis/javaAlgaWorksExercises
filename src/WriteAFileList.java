import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class WriteAFileList {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> tarefas = new ArrayList<String>();

        for(int i = 0; i<10; i++) {
            System.out.println("tarefa " + (i + 1) + ": ");
            String tarefa = scanner.nextLine();

            tarefas.add(tarefa);
        }

        Path arquivo = Paths.get("D:/java/algaWorks/tests/docs/arquivo.txt");
        Files.write(arquivo, tarefas);

    }
}
