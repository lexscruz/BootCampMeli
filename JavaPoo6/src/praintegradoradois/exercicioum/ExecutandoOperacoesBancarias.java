package praintegradoradois.exercicioum;

import java.util.Scanner;

public class ExecutandoOperacoesBancarias {

    public static void main(String[] args) {
        Banco banco = new Banco();
        String cliente;
        int transacao;
        String sair = "n";
        do{
            boolean retorno = false;
            Scanner clienteEntrada  = new Scanner(System.in);
            System.out.println("Escolha uma das opções de cliente: executivo | basico | coletores");
            cliente = clienteEntrada.next();

            Scanner transacaoEntrada  = new Scanner(System.in);
            System.out.println("Escolha uma das opções de transação: 1-Depósito | 2-Transferência | 3- Retirada de Dinheiro | 4 - Consulta de Saldo | 5- Pagamento de Serviços");
            transacao = transacaoEntrada.nextInt();

            switch (transacao){
                case 1: retorno = banco.deposito(cliente);
                    break;
                case 2: retorno = banco.transferencia(cliente);
                    break;
                case 3: retorno = banco.retirada(cliente);
                    break;
                case 4: retorno = banco.consultaSaldo(cliente);
                    break;
                case 5: retorno = banco.pagamentoDeServicos(cliente);
                    break;
            }

            if (!retorno) {
                System.out.println("Você não pode fazer essa transação!");
            } else {
                System.out.println("Transação realizada com sucesso!");
            }

            Scanner saidaEntrada = new Scanner(System.in);
            System.out.println("Você deseja sair? Digite (s) para sair");
            sair = saidaEntrada.next();

        } while (sair.equals("n"));

    }
}
