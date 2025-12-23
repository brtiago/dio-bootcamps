import java.util.Scanner;

public class Java13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] rota = scanner.nextLine().split("-");

        // TODO: Separe a string de entrada em recurso e ação usando o caractere '-'
        String recurso = rota[0].toLowerCase();
        String acao = rota[1].toLowerCase();

        // Dica: Verifique se o recurso está no plural, contém apenas letras minúsculas,
        // e se a ação é uma das permitidas: listar, criar, atualizar ou deletar.

        boolean isPlural = recurso.endsWith("s");
        boolean acaoPermitida = switch(acao) {
            case "listar", "criar", "atualizar", "deletar" -> true;
            default -> false;
        };

        if(isPlural && acaoPermitida) {
            System.out.println("valido");
        } else {
            System.out.println("invalido");
        }

        // Imprima "valido" se a rota seguir o padrão, ou "invalido" caso contrário.
        scanner.close();
    }
}