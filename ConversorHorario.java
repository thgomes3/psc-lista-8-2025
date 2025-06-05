import java.util.Scanner;

public class ConversorHorario {

    public static void converterHorario(int hora24, int minuto, char[] amPm) {
        if (hora24 == 0) {
            amPm[0] = 'A';
            hora24 = 12;
        } else if (hora24 == 12) {
            amPm[0] = 'P';
        } else if (hora24 > 12) {
            hora24 -= 12;
            amPm[0] = 'P';
        } else {
            amPm[0] = 'A';
        }
    }

    public static void exibirHorario(int hora12, int minuto, char amPm) {
        String periodo = (amPm == 'A') ? "A.M." : "P.M.";
        System.out.printf("%d:%02d %s\n", hora12, minuto, periodo);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char repetir;

        do {
            System.out.print("Digite a hora no formato 24h (0-23): ");
            int hora24 = sc.nextInt();

            System.out.print("Digite os minutos (0-59): ");
            int minuto = sc.nextInt();

            char[] amPm = new char[1];
            int hora12 = hora24;

            converterHorario(hora12, minuto, amPm);

            if (hora24 == 0) {
                hora12 = 12;
            } else if (hora24 > 12) {
                hora12 = hora24 - 12;
            } else {
                hora12 = hora24;
            }

            exibirHorario(hora12, minuto, amPm[0]);

            System.out.print("Deseja converter outro horário? (S/N): ");
            repetir = sc.next().toUpperCase().charAt(0);

        } while (repetir == 'S');

        sc.close();
    }
}
