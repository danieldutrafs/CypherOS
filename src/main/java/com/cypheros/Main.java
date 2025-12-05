import com.cypheros.model.Agenda;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("== AGENDA ==");

        System.out.print("Nome do compromisso: ");
        String nomeCompromisso = sc.nextLine();

        System.out.print("ID do compromisso: ");
        int idCompromisso = sc.nextInt();
        sc.nextLine();

        System.out.print("Descrição do compromisso: ");
        String descricaoCompromisso = sc.nextLine();

        System.out.print("Data do compromisso (DD-MM-AAAA): ");
        LocalDate dataInicio = LocalDate.parse(sc.nextLine(), formatoData);

        System.out.print("Hora do compromisso (HH:MM): ");
        LocalTime horaInicio = LocalTime.parse(sc.nextLine(), formatoHora);

        System.out.print("Data de término (DD-MM-AAAA): ");
        LocalDate dataFim = LocalDate.parse(sc.nextLine(), formatoData);

        System.out.print("Hora de término (HH:MM): ");
        LocalTime horaFim = LocalTime.parse(sc.nextLine(), formatoHora);

        Agenda agenda = new Agenda(
                nomeCompromisso,
                idCompromisso,
                descricaoCompromisso,
                dataInicio,
                horaInicio,
                dataFim,
                horaFim
        );

        System.out.println("\n=== COMPROMISSO CRIADO ===");
        System.out.println(agenda);

        sc.close();
    }
}
