public class AcessoPrincipal {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.setNumeroConta(1901);
        conta.setTitular("Gabriella Maria de Oliveira");
        conta.setSaldo(600);

        System.out.println("Saldo atual: "+conta.getSaldo());

        conta.depositaValor(500);
        System.out.println("Saldo atual: "+conta.getSaldo());

        conta.sacaValor(700);
        System.out.println("Saldo atual: "+conta.getSaldo());
    }
}
