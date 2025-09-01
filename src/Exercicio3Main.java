import java.util.ArrayList;
import java.util.List;

public class Exercicio3Main {
    public static void main(String[] args) {
        List<Conta> contas = new ArrayList<>();

        ContaCorrente cc = new ContaCorrente();
        cc.setNumero("12345-6");
        cc.setTitular("João Silva");
        cc.setSaldo(1000.00);
        cc.setAgencia("0001");
        cc.setLimiteChequeEspecial(500.00);
        cc.depositar(200.00);
        cc.sacar(100.00);
        contas.add(cc);

        ContaPoupanca cp = new ContaPoupanca();
        cp.setNumero("78901-2");
        cp.setTitular("Maria Souza");
        cp.setSaldo(2000.00);
        cp.setAgencia("0001");
        cp.setAniversarioConta(15);
        cp.depositar(500.00);
        contas.add(cp);

        ContaSalario cs = new ContaSalario();
        cs.setNumero("34567-8");
        cs.setTitular("Pedro Santos");
        cs.setSaldo(1500.00);
        cs.setAgencia("0002");
        cs.setEmpresaConveniada("Empresa X");
        cs.sacar(500.00);
        cs.sacar(1200.00); // Tentativa de saque acima do limite
        contas.add(cs);

        System.out.println("\n*** Exercício 3: Sistema de Contas Bancárias ***");
        for (Conta c : contas) {
            System.out.println("Conta: " + c.getNumero() +
                               ", Titular: " + c.getTitular() +
                               ", Saldo Final: R$ " + String.format("%.2f", c.calcularSaldoFinal()));
        }
    }
}

