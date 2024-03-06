import java.util.Arrays;
import java.util.Random;

public class JoinBinaryMutation {
    public static void main(String[] args) {
        int sizeVetor = 5;
        int numeroDeIteracoes = 10; // Defina o número de iterações desejadas

        Random aleatorio = new Random();
        int vetor[] = new int[sizeVetor];

        for (int i = 0; i < vetor.length; i++) {
            int n1 = aleatorio.nextInt(100);
            vetor[i] = n1;
        }

        int[] vetorAnterior = Arrays.copyOf(vetor, sizeVetor);

        for (int iteracao = 0; iteracao < numeroDeIteracoes; iteracao++) {
            System.out.printf("\nPopulação %d:", iteracao + 1);

            System.out.printf("\nVetor:");
            imprimiVetor(vetorAnterior);

            //System.out.printf("\nVetor Fitness: ");
            //int[] resultados = calculoFitness(vetorAnterior);

            System.out.printf("\nVetor binario:");
            String[] vetorBinary = vetorBinary(vetorAnterior);
            System.out.printf("\n");

            String[] vetorNewBinary = new String[sizeVetor];
            System.out.print("Vetor de binarios com mutação e mesclagem: ");
            for (int i = 0; i < vetorBinary.length; i++) {
                int splitLine = aleatorio.nextInt(8);
                int indice1 = aleatorio.nextInt(vetorBinary.length);
                int indice2 = aleatorio.nextInt(vetorBinary.length);
                String valor1 = vetorBinary[indice1];
                String valor2 = vetorBinary[indice2];

                String leftPart = valor1.substring(0, splitLine);
                String rightPart = valor2.substring(splitLine);
                String combineResultLines = leftPart + rightPart; //filho

                int mutationProbability = aleatorio.nextInt(5);
                int indiceParaAlterar = aleatorio.nextInt(7);
                char novoValor;
                char valorAtual = combineResultLines.charAt(indiceParaAlterar);
                if (mutationProbability >= 4) {
                    novoValor = (valorAtual == '0') ? '1' : '0';
                    String resultadoComAlteracao = combineResultLines.substring(0, indiceParaAlterar) + novoValor + combineResultLines.substring(indiceParaAlterar + 1);
                    System.out.printf("[" + i + "]" + "[M]" + resultadoComAlteracao + " ");
                } else {
                    System.out.printf("[" + i + "]" + "[C]" + combineResultLines + " ");
                }
                vetorNewBinary[i] = combineResultLines;
            }
            System.out.print("\nNova população:");
            vetor = vetorBinaryToDec(vetorNewBinary);
            vetorAnterior = Arrays.copyOf(vetor, sizeVetor); // Atualiza o vetorAnterior para a próxima iteração


        }
    }
    public static void imprimiVetor(int[] imprimiVetor) {
        for (int i = 0; i < imprimiVetor.length; i++) {
            System.out.print(" [" + i + "]" + imprimiVetor[i]);
        }
    }
    public static void imprimirVetorString (String [] vetor){
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(" [" + i + "]" + vetor[i]);
        }
    }
    public static int[] calculoFitness(int[] fitness) {
        int[] resultados = new int[fitness.length];
        for (int i = 0; i < fitness.length; i++) {
            resultados[i] = (int) (421 - Math.sqrt(fitness[i]) * Math.sin(fitness[i]) + 1);
        }
        imprimiVetor(resultados);
        return resultados;
    }
    public static String[] vetorBinary(int[] vetor) {
        String[] binario = new String[vetor.length];
        for (int i = 0; i < vetor.length; i++) {
            String binary = Integer.toBinaryString(vetor[i]);
            while (binary.length() < 8) {
                binary = "0" + binary;
            }
            binario[i] = binary;
            System.out.printf(" [" + i + "]" + binary);
        }
        return binario;
    }
    public static int [] vetorBinaryToDec (String [] vetor){
        int vetorBinarytoDec[] = new int [vetor.length];
        for (int i = 0; i < vetor.length; i++) {
            vetorBinarytoDec[i] = Integer.parseInt(vetor[i], 2);
        }
        imprimiVetor(vetorBinarytoDec);
        return vetorBinarytoDec;
    }
}
