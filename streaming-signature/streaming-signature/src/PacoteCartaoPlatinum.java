public class PacoteCartaoPlatinum extends PacoteDecorator {

    public PacoteCartaoPlatinum(Assinatura assinatura) {
        super(assinatura, "CartaoPlatinum");
    }

    @Override
    public String getDescricao() {
        return assinatura.getDescricao()
                + " + Cartão Platinum";
    }

    @Override
    public double getPreco() {
        return assinatura.getPreco() + 49.99;
    }
}
