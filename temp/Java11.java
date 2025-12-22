import java.util.*;

abstract class Consultant {
    protected String name;
    protected String role;

    public Consultant(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String present() {
        return role + ": " + name;
    }
}

class Developer extends Consultant {
    public Developer(String name) { super(name, "Dev"); }
}

class Analyst extends Consultant {
    public Analyst(String name) { super(name, "Analyst"); }
}

class Manager extends Consultant {
    public Manager(String name) { super(name, "Manager"); }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine().trim();

        List<Consultant> consultantList = new ArrayList<>();

        // Cada consultor pode vir separado por ";"
        String[] entries = inputLine.split(";");

        for (String entry : entries) {
            entry = entry.trim();
            if (entry.isEmpty()) continue;

            String[] parts = entry.split(" ", 2);
            String jobTitle = parts[0];
            String personName = parts[1];

            if (jobTitle.equals("Analyst")) {
                consultantList.add(new Analyst(personName));
            } else if (jobTitle.equals("Developer")) {
                consultantList.add(new Developer(personName));
            } else if (jobTitle.equals("Manager")) {
                consultantList.add(new Manager(personName));
            }

            // TODO: Criar os if/else para instanciar Developer, Analyst ou Manager.

        }

        // Impressão final na ordem de entrada
        for (Consultant consultant : consultantList) {
            System.out.println(consultant.present());
        }
    }
}