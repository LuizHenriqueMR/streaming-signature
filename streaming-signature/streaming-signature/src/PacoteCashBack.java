public class PacoteCashBack extends PacoteDecorator {

    public PacoteCashBack(Assinatura assinatura) {
        super(assinatura, "CashBack");
    }

    @Override
    public String getDescricao() {
        return assinatura.getDescricao()
                + " + Compras com Cash Back";
    }

    @Override
    public double getPreco() {
        return assinatura.getPreco() + 19.99;
    }
}
