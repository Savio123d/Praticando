import java.util.Scanner;

public class Main {
    private static Usuario[] usuarios = new Usuario[10]; // Vetor para armazenar 10 usuários
    private static int totalUsuarios = 0; // Índice para acompanhar quantos usuários foram cadastrados
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        short or;

        do {
            System.out.println("1- Login");
            System.out.println("2- Cadastro");
            System.out.println("3- Mostrar dados");
            System.out.println("4- Excluir");
            System.out.println("0- Sair");
            System.out.print("Escolha uma opção: ");
            or = scanner.nextShort();
            scanner.nextLine(); // Consumir quebra de linha

            switch (or) {
                case 1:
                    login();
                    break;
                case 2:
                    cadastrar();
                    break;
                case 3:
                    mostrarUsuarios();
                    break;
                case 4:
                    excluirUsuario();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (or != 0);
    }

    private static void login() {
        System.out.print("Informe seu Usuário: ");
        String nome = scanner.nextLine();
        System.out.print("Informe sua senha: ");
        String senha = scanner.nextLine();

        for (int i = 0; i < totalUsuarios; i++) {
            if (usuarios[i].nome.equals(nome) && usuarios[i].verificarSenha(senha)) {
                System.out.println("Login bem-sucedido! Bem-vindo, " + nome);
                return;
            }
        }
        System.out.println("Usuário ou senha incorretos!");
    }

    private static void cadastrar() {
        if (totalUsuarios >= usuarios.length) {
            System.out.println("Cadastro cheio! Não é possível adicionar mais usuários.");
            return;
        }

        Usuario usuario = new Usuario();
        System.out.print("Informe seu nome: ");
        usuario.nome = scanner.nextLine();
        System.out.print("Informe sua senha: ");
        usuario.setSenha(scanner.nextLine());

        usuarios[totalUsuarios] = usuario;
        totalUsuarios++;

        System.out.println("Usuário cadastrado com sucesso!");
    }

    private static void mostrarUsuarios() {
        if (totalUsuarios == 0) {
            System.out.println("Nenhum usuário cadastrado.");
            return;
        }

        System.out.println("Lista de Usuários:");
        for (int i = 0; i < totalUsuarios; i++) {
            System.out.println((i + 1) + " - " + usuarios[i]);
        }
    }

    private static void excluirUsuario() {
        System.out.print("Digite o nome do usuário a ser excluído: ");
        String nome = scanner.nextLine();

        for (int i = 0; i < totalUsuarios; i++) {
            if (usuarios[i].nome.equals(nome)) {
                // Move os usuários para preencher o espaço
                for (int j = i; j < totalUsuarios - 1; j++) {
                    usuarios[j] = usuarios[j + 1];
                }
                usuarios[totalUsuarios - 1] = null; // Remove a referência do último
                totalUsuarios--;

                System.out.println("Usuário removido com sucesso!");
                return;
            }
        }
        System.out.println("Usuário não encontrado.");
    }
}
