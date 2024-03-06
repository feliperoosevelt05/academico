import java.util.Random;

public class Etapa1 {
    public static void main(String[] args) {
        // Defina o número binário original
        String numeroBinario = "10101100";
        System.out.println(numeroBinario);

        // Especifique o índice da posição que deseja alterar (começando em 0)
        int indice = 2; // Isso corresponde ao terceiro dígito (0-based index)

        // Verifique o valor atual na posição desejada
        char valorAtual = numeroBinario.charAt(indice);

        // Especifique o novo valor com base na verificação
        char novoValor = (valorAtual == '0') ? '1' : '0';

        // Construa o novo número binário com a alteração
        String novoNumeroBinario = numeroBinario.substring(0, indice) + novoValor + numeroBinario.substring(indice + 1);

        // Imprima o novo número binário
        System.out.println(novoNumeroBinario);
    }
}
