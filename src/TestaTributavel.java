
public class TestaTributavel {
    public static void main(String[] args) {

        ContaPoupanca p = new ContaPoupanca(800);
        ContaCorrente c = new ContaCorrente(100);
        SeguroDeVida s  = new SeguroDeVida();

        System.out.println("Saldo da poupança:" + p.obterSaldo());

        System.out.println("saldo da conta corrente:" + c.obterSaldo());
        System.out.println("tributos da conta corrente:" + c.calculaTributos());

        System.out.println("seguro de vida:" + s.calculaTributo());






    }
}