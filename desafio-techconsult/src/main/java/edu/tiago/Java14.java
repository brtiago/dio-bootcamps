import java.util.Scanner;

public class Java14 {
    // Converte CamelCase para o padrão RESTful exigido
    public static String padronizarRota(String endpointCamelCase) {
        StringBuilder rota = new StringBuilder("/api/v1/");

        for (int i = 0; i < endpointCamelCase.length(); i++) {
            char c = endpointCamelCase.charAt(i);

            if (Character.isUpperCase(c) && i > 0) {
                rota.append('-').append(Character.toLowerCase(c));
            } else {
                rota.append(Character.toLowerCase(c));
            }
        }

        return rota.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String endpoint = scanner.nextLine();
        System.out.println(padronizarRota(endpoint));
        scanner.close();
    }

}