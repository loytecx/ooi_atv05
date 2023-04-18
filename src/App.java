import java.util.Scanner;

public class App {

    static Scanner teclado = new Scanner(System.in);
    static ContaBancaria conta;
    
    static String imprimirMenu(){
        String str="";
        str += "================================\n";
        str += "1 - Cadastrar conta\n";
        str += "2 - Sacar\n";
        str += "3 - Depositar\n";
        str += "4 - Ver dados\n";
        str += "0 - Sair\n";
        str += "Digite uma opcao:";

        return str;
    }

    static void criarConta(String agencia, String numero, String nomeCliente, double saldo){
               
        System.out.println("Digite o nome do cliente:");
        nomeCliente = teclado.nextLine();
        System.out.println("Digite o nÃºmero da conta:");
        numero = teclado.nextLine();
        System.out.println("Digite a agÃªncia da conta:");
        agencia = teclado.nextLine();
        System.out.println("Digite o saldo inicial R$:");
        saldo = teclado.nextDouble();

        conta.setNomeCliente(nomeCliente);
        conta.setNumero(numero);
        conta.setAgencia(agencia);
        conta.setSaldo(saldo);
        System.out.println("************");
    }

    static void sacar(){
        double valor;

        System.out.println("Digite um valor:");
        valor = teclado.nextDouble();
        String retorno = conta.sacar(valor);
        System.out.println(retorno);
        System.out.println("************");
    }

    static void depositar(){
        double valor;
        System.out.println("Digite um valor:");
        valor = teclado.nextDouble();
        String retorno = conta.depositar(valor);
        System.out.println(retorno);
        System.out.println("************");
    }

    static void mostrarDados(){
        System.out.println("Dados da conta");
        System.out.println(conta.mostrarSaldo());
        System.out.println("************");
    }

    public static void main(String[] args) {
                
        int opcao;
              
        do{
            System.out.println(imprimirMenu());
            opcao = teclado.nextInt();

            switch(opcao){
                case 1:
                    criarConta();
                break;
                case 2:
                    sacar();
                break;
                case 3:
                    depositar();
                break;
                case 4:
                    mostrarDados();
                break;
                default:
                    if(opcao != 0){
                        System.out.println("OpÃ§Ã£o invÃ¡lida!!");
                    }
            }
        }while(opcao != 0);
    }
}
