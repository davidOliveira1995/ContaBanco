import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, optionMenu;
        String agencia, nomeCliente;
        double saldo = 0;

        System.out.println("*** Seja bem vindo ao Banco Dio virtual ! ***");
        System.out.println("Aguarde...");
        System.out.println();

        System.out.println("*** Menu ***");
        System.out.println("1. Criar conta");
        System.out.println("2. Sair");

        System.out.println("Digite a opção: ");
        optionMenu = sc.nextInt();


        if (optionMenu == 1) {
            System.out.println("Você escolheu opção 1. Criar Conta");
            sc.nextLine();

            System.out.println("Digite seu nome completo:");
            nomeCliente = sc.nextLine();

            System.out.println("Digite o número da conta: ");
            numero = sc.nextInt();

            System.out.println("Digite a agência:");
            agencia = sc.next();

            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                    + agencia + ", conta " + numero + " saldo atualizado: R$ " + saldo + " disponível para saque.");

            while (optionMenu != 5){
                System.out.println();
                System.out.println("**************************************************");
                System.out.println("         Banco Digital Eletrônico        ");
                System.out.println("**************************************************");
                System.out.println();
                System.out.println("Aguarde...");
                System.out.println();
                System.out.println("Escolha uma das opções.");
                System.out.println("1. Informações da conta.");
                System.out.println("2. Saldo Atualizado.");
                System.out.println("3. Depositar.");
                System.out.println("4. Saque.");
                System.out.println("5. Sair.");

                int optionBankDigital = sc.nextInt();


                switch (optionBankDigital) {
                    case 1:
                        System.out.println("Você escolheu a opção 1: Informações da conta.");
                        System.out.println();
                        System.out.println("Nome do titular: " + nomeCliente);
                        System.out.println("Conta: " + numero);
                        System.out.println("Agencia: " + agencia);
                        break;
                    case 2:
                        System.out.println("Você escolher a opção 2: Saldo atualizado.");
                        System.out.println();
                        System.out.println("Saldo atual: R$ " + saldo);
                        break;
                    case 3:
                        System.out.println("Você escolher a opção 3: Depositar.");
                        System.out.println();
                        System.out.println("Digite o valor do depósito");
                        double deposito = sc.nextDouble();
                        saldo += deposito;
                        break;
                    case 4:
                        System.out.println("Você escolheu a opção 5: Saque.");
                        System.out.println();
                        System.out.println("Digite o valor do saque: ");
                        double saque = sc.nextDouble();
                        saldo -= saque;
                        break;
                    case 5:
                        System.out.println("Obrigado! Volte sempre.");
                        optionMenu = 5;
                        break;
                    default:
                        System.out.println("Opção Inválida.");
                        break;

                }
            }

        } else if (optionMenu == 2) {
            System.out.println("Obrigado! Volte sempre.");
            sc.close();
        }

    }
}
