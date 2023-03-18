import java.util.Scanner;

public class Cliente {
    private String nome;
    private String cpf;
    private int idade;
    private String telefone;

    public void CadastrarCliente(String nome, String cpf, int idade, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.telefone = telefone;
    }

    public void MostrarDadosCliente() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade);
        System.out.println("Telefone: " + telefone);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente cliente = new Cliente();

        System.out.println("Digite o nome do cliente: ");
        String nome = sc.nextLine();

        System.out.println("Digite o CPF do cliente: ");
        String cpf = sc.nextLine();

        System.out.println("Digite a idade do cliente: ");
        int idade = sc.nextInt();
        sc.nextLine(); // Consumir a quebra de linha após a leitura do inteiro

        System.out.println("Digite o telefone do cliente: ");
        String telefone = sc.nextLine();

        cliente.CadastrarCliente(nome, cpf, idade, telefone);
        cliente.MostrarDadosCliente();
    }
}