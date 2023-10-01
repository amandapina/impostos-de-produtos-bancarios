public class Conta {

    double saldo;

    public Conta(double saldo)
    {
        this.saldo = saldo;
    }

    void sacar(double valor)
    {
        if(valor<=saldo)
        {
            saldo = saldo-valor;
        }
        else
        {
            System.out.println("saldo insuficiente");
        }
    }

    void depositar(double valor)
    {
        saldo = saldo + valor;
    }

    double obterSaldo()
    {
        return saldo;
    }

}
