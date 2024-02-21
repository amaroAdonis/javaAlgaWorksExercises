import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadingAFileList {
    public static void main(String[] args) throws IOException {
        Path arquivo = Paths.get("D:/java/algaWorks/tests/docs/arquivo.txt");

        List<String> tarefas = Files.readAllLines(arquivo);

        for(int i = 0; i < tarefas.size(); i++) {
            String tarefa = tarefas.get(i);
            System.out.println("Tarefa " + (i + 1) + ": " + tarefa);
        }
    }
}
