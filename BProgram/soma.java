
// import do pacote java.util para ler a entrada do usuario
import java.util.Scanner;

//classe soma
public class soma {
    // método main é criado ou seja o principal
    public static void main(String[] args) {
        // instância da classe Scanner criada para ler a entrada do usuário
        Scanner scanner = null;
        try {
            // objeto Scanner é criado e utilizado para ler os números digitados pelo
            // usuário
            scanner = new Scanner(System.in);

            System.out.print("Digite o primeiro número: ");
            // armazena o valor digitado na variável numero1
            int numero1 = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            int numero2 = scanner.nextInt();
            // A soma dos dois números é calculada e armazenada na variável soma
            int soma = numero1 + numero2;
            // exibe a soma dos dois números na tela
            System.out.println("A soma dos dois números é: " + soma);
        } finally {
            // o método close() do objeto é chamado para fechá-lo
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}