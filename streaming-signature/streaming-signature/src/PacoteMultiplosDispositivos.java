public class PacoteMultiplosDispositivos extends PacoteDecorator {

    public PacoteMultiplosDispositivos(Assinatura assinatura) {
        super(assinatura, "MultiplosDispositivos");
    }

    @Override
    public String getDescricao() {
        return assinatura.getDescricao()
                + " + Assistir em vários dispositivos";
    }

    @Override
    public double getPreco() {
        return assinatura.getPreco() + 19.99;
    }
}
