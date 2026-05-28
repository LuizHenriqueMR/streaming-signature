public class Main {

    public static void main(String[] args) {

        try {

            PacoteDecorator.limparPacotes();

            Assinatura assinatura = new AssinaturaBase();

            assinatura = new PacoteMultiplosDispositivos(assinatura);
            assinatura = new PacoteFreteGratis(assinatura);
            assinatura = new PacoteCashBack(assinatura);

            System.out.println("===== ASSINATURA FINAL =====");
            System.out.println();
            System.out.println("Descrição:");
            System.out.println(assinatura.getDescricao());
            System.out.println();
            System.out.printf("Valor Total: R$ %.2f%n", assinatura.getPreco());

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
