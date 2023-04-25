import java.util.Scanner;

public class Conta {
    public static void main (String[] args){
        int trava = 1;
        double valorMudanca = 0;
        Scanner leitura = new Scanner(System.in);
        double saldo = 2000;
        String nome = "Lucas Fernandes Joaquim";
        System.out.println(String.format("""
                --------------------------------------
                Nome: %s
                Saldo: %.2f
                --------------------------------------
                """,nome,saldo));

        while (trava == 1) {
            System.out.println("""
                    Qual operação voce deseja realizar: 
                    1 - Consultar Saldo
                    2 - Receber Valor
                    3 - Tranferir Valor
                    4 - Sair
                    """);
            int operacao = leitura.nextInt();
            switch (operacao) {
                case 1:
                    System.out.println("Seu saldo: " + saldo);
                    break;
                case 2:
                    System.out.println("Qual valor voce esta recebendo: ");
                    valorMudanca = leitura.nextDouble();
                    saldo += valorMudanca;
                    valorMudanca = 0;
                    System.out.println("Saldo atualizado: "+ saldo);
                    break;
                case 3:
                    System.out.println("Qual valor voce esta tranferindo: ");
                    valorMudanca = leitura.nextDouble();
                    if (valorMudanca > saldo) {
                        System.out.println("Saldo insuficiente");
                        break;
                    } else {
                        saldo -= valorMudanca;
                    }
                    valorMudanca = 0;
                    System.out.println("saldo atualizado: "+ saldo);
                    break;
                case 4:
                    System.out.println("Adeus, volte sempre");
                    trava = 0;
                    break;
                default:
                    System.out.println("Digite um numero valido");
                    break;
            }
        }
    }
}
