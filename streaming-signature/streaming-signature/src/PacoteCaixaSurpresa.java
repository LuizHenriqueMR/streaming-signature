public class PacoteCaixaSurpresa extends PacoteDecorator {

    public PacoteCaixaSurpresa(Assinatura assinatura) {
        super(assinatura, "CaixaSurpresa");
    }

    @Override
    public String getDescricao() {
        return assinatura.getDescricao()
                + " + Caixa surpresa temática";
    }

    @Override
    public double getPreco() {
        return assinatura.getPreco() + 29.99;
    }
}
