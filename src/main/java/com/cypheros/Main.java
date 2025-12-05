package com.cypheros;
import java.util.Scanner;
import com.cypheros.model.Tarefa;

/**@author Caua0
 */

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== CRIACAO DE TAREFA ===");

        System.out.print("ID da Tarefa: ");
        int id = sc.nextInt();

        System.out.print("ID do Projeto (fk): ");
        int fkProjeto = sc.nextInt();
        sc.nextLine();

        System.out.print("Nome da Tarefa: ");
        String nome = sc.nextLine();

        System.out.print("Data Limite (DD-MM-AAAA): ");
        String dataLimite = sc.nextLine();

        System.out.print("Status: ");
        String status = sc.nextLine();

        System.out.print("Complexidade (Facil, mediana e Dificil: ");
        String complexidade = sc.nextLine();

        System.out.print("Tempo Estimado (minutos): ");
        int tempoEstimado = sc.nextInt();

        System.out.print("Tempo Real Gasto (ou -1 se não tiver): ");
        int tempoRealInput = sc.nextInt();
        Integer tempoReal = tempoRealInput == -1 ? null : tempoRealInput;

        Tarefa tarefa = new Tarefa(
                id,
                fkProjeto,
                nome,
                dataLimite,
                status,
                complexidade,
                tempoEstimado,
                tempoReal
        );

        System.out.println("\n=== TAREFA CRIADA ===");
        System.out.println(tarefa);

        sc.close();
    }
}
