import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        // Primeiro deverá ser solicitado os dados do número da agência.
        System.out.println("Por favor, digite o número da Agência:");
        //Após ser solicitado o usuário deverá colocar o número da agência com a função abaixo.
        String agencia = terminal.nextLine();

        //Será solicitado então que o usuário insira o número da conta
        System.out.println("Por favor, digite o número da Conta:");
        //Com a função abaixo o usuário deverá inserir o número da conta.
        int numero = terminal.nextInt();
        terminal.nextLine(); // Limpar o buffer do teclado

        //Solicitamos então ao usuário colocar o nome dele.
        System.out.println("Por favor, digite o nome do Cliente:");
        //O usuário então insere o nome dele.
        String nomeCliente = terminal.nextLine();

        //Por fim, será solicitado ao usuário para inserir o saldo da conta.
        System.out.println("Por favor, digite o saldo:");
        //Com a função a baixo teremos o saldo da conta.
        double saldo = terminal.nextDouble();

        // Constrói a mensagem final
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";

        // Exibe a mensagem final
        System.out.println(mensagem);

        // Fecha o scanner
        terminal.close();
    }
}
