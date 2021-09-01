package praintegradoradois.exercicioum;

public class Banco extends AssertTransaction {


    public boolean deposito(String cliente) {
        if (cliente.equals("executivo")) {
            return transactionOk();
        } else {
            return transactionNoOk();
        }
    }

    public boolean transferencia(String cliente) {
        if (cliente.equals("executivo")) {
            return transactionOk();
        } else {
            return transactionNoOk();
        }
    }

    public boolean retirada(String cliente) {
        if (cliente.equals("basico") || cliente.equals("coletores")) {
            return transactionOk();
        } else {
            return transactionNoOk();
        }
    }

    public boolean consultaSaldo(String cliente) {
        if (cliente.equals("basico") || cliente.equals("coletores")) {
            return transactionOk();
        } else {
            return transactionNoOk();
        }
    }

    public boolean pagamentoDeServicos(String cliente) {
        if (cliente.equals("basico")) {
            return transactionOk();
        } else {
            return transactionNoOk();
        }
    }
}
