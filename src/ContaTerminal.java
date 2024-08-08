import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO: Conhecer e importar a classe Scanner

        //Exibir as mensagens para o nosso usuário

        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem conta criada

        int numero;
        String agencia;
        String nomeCliente;
        double saldo = 237.48;

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite o número da agência: ");
        numero = sc.nextInt();
        System.out.println("Por favor, digite o número da conta corrente: ");
        agencia = sc.next();
        System.out.println("Por favor, digite seu nome: ");
        nomeCliente = sc.next();
        System.out.println("-----------------------------");
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + ", já está disponível para saque");

    }
}