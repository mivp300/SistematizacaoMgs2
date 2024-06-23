import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Classe principal para o sistema da MGS
public class SistemaMGS {
    private static List<Funcionario> funcionarios = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar novo funcionário");
            System.out.println("2 - Consultar funcionário por nome");
            System.out.println("3 - Listar todos os funcionários");
            System.out.println("4 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    cadastrarFuncionario();
                    break;
                case 2:
                    consultarFuncionario();
                    break;
                case 3:
                    listarFuncionarios();
                    break;
                case 4:
                    continuar = false;
                    System.out.println("Encerrando o sistema.");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }
        }

        scanner.close();
    }

    // Método para cadastrar um novo funcionário
    private static void cadastrarFuncionario() {
        System.out.println("Digite o nome do funcionário:");
        String nome = scanner.nextLine();

        System.out.println("Digite o telefone do funcionário:");
        String telefone = scanner.nextLine();

        System.out.println("Digite o email do funcionário:");
        String email = scanner.nextLine();

        System.out.println("Digite as alergias do funcionário:");
        String alergias = scanner.nextLine();

        System.out.println("Digite os problemas médicos do funcionário:");
        String problemasMedicos = scanner.nextLine();

        Funcionario novoFuncionario = new Funcionario(nome, telefone, email, alergias, problemasMedicos);
        funcionarios.add(novoFuncionario);

        System.out.println("Funcionário cadastrado com sucesso.");
    }

    // Método para consultar um funcionário pelo nome
    private static void consultarFuncionario() {
        System.out.println("Digite o nome do funcionário que deseja consultar:");
        String nomeConsulta = scanner.nextLine();

        boolean encontrado = false;

        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getNome().equalsIgnoreCase(nomeConsulta)) {
                System.out.println("Nome: " + funcionario.getNome());
                System.out.println("Telefone: " + funcionario.getTelefone());
                System.out.println("Email: " + funcionario.getEmail());
                System.out.println("Alergias: " + funcionario.getAlergias());
                System.out.println("Problemas Médicos: " + funcionario.getProblemasMedicos());
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Funcionário não encontrado.");
        }
    }

    // Método para listar todos os funcionários cadastrados
    private static void listarFuncionarios() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
        } else {
            System.out.println("Lista de funcionários:");
            for (Funcionario funcionario : funcionarios) {
                System.out.println("Nome: " + funcionario.getNome());
                System.out.println("Telefone: " + funcionario.getTelefone());
                System.out.println("Email: " + funcionario.getEmail());
                System.out.println("Alergias: " + funcionario.getAlergias());
                System.out.println("Problemas Médicos: " + funcionario.getProblemasMedicos());
                System.out.println("-----------------------------");
            }
        }
    }
}
