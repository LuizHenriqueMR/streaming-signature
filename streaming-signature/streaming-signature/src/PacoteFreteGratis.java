public class PacoteFreteGratis extends PacoteDecorator {

    public PacoteFreteGratis(Assinatura assinatura) {
        super(assinatura, "FreteGratis");
    }

    @Override
    public String getDescricao() {
        return assinatura.getDescricao()
                + " + Frete grátis em produtos";
    }

    @Override
    public double getPreco() {
        return assinatura.getPreco() + 9.99;
    }
}
