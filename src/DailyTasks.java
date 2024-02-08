import java.util.Scanner;

public class DailyTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Favor, cadastre suas 5 principais tarefas");
        System.out.print("Primeira Tarefa: ");
        String primeiraTarefa = scanner.next();
        System.out.print("Segunda Tarefa: ");
        String segundaTarefa = scanner.next();
        System.out.print("Terceira Tarefa: ");
        String terceiraTarefa = scanner.next();
        System.out.print("Quarta Tarefa: ");
        String quartaTarefa = scanner.next();
        System.out.print("Quinta Tarefa: ");
        String quintaTarefa = scanner.next();

        String[] tarefas = new String[5];
        tarefas[0] = primeiraTarefa;
        tarefas[1] = segundaTarefa;
        tarefas[2] = terceiraTarefa;
        tarefas[3] = quartaTarefa;
        tarefas[4] = quintaTarefa;

        System.out.println("Suas principais tarefas são: ");

        for(int i=0; i<tarefas.length; i++){
            System.out.println((i+1) + " - " + tarefas[i]);
        }
    }
}
