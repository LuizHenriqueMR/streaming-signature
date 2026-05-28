import java.util.HashSet;
import java.util.Set;

public abstract class PacoteDecorator implements Assinatura {

    protected Assinatura assinatura;

    private static Set<String> pacotesAdicionados = new HashSet<>();

    public PacoteDecorator(Assinatura assinatura, String nomePacote) {

        if (pacotesAdicionados.contains(nomePacote)) {
            throw new IllegalArgumentException(
                    "O pacote '" + nomePacote + "' já foi adicionado."
            );
        }

        pacotesAdicionados.add(nomePacote);
        this.assinatura = assinatura;
    }

    public static void limparPacotes() {
        pacotesAdicionados.clear();
    }
}
