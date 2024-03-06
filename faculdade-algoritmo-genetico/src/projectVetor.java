import java.util.Random;
import java.util.Scanner;

public class projectVetor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int menu;
        do {
            exibirMenu();

            menu = sc.nextInt();

            switch (menu) {
                case 1: // primeira quest�o
                    System.out.println("-------bublleSort-------");

                    int maior;
                    int aux;
                    int cont1 = 1;
                    int comparacao = 0;
                    int trocas = 0;


                    System.out.print("Qual o Tamanho do Vetor: ");

                    int numero = sc.nextInt();
                    int vet1[] = new int[numero];
                    exibirMenuVetor();


                    int opcao = sc.nextInt();
                    if (opcao == 1) {
                        for (int i = 0; i < vet1.length; i++) {
                            Random aleatorio = new Random();
                            int n1 = aleatorio.nextInt(100);
                            vet1[i] = n1;
                        }
                    } else if (opcao == 2) {
                        for (int i = 0; i < vet1.length; i++) {
                            Scanner st = new Scanner(System.in);
                            System.out.println("-------------------------------------------------");
                            System.out.print("Digite o " + cont1 + "º Número: ");
                            int num = st.nextInt();
                            cont1++;
                            vet1[i] = num;

                        }
                    } else {
                        System.out.println("Execute novamente e digite um valor valido (1 ou 2)");
                        System.exit(0);
                    }
                    System.out.print("Seu vetor --> ");
                    imprimir(vet1);
                    for (int i = 0; i < vet1.length; i++) {
                        maior = i;
                        for (int j = 0; j < vet1.length; j++) {
                            if (vet1[j] > vet1[maior]) {
                                aux = vet1[j];
                                vet1[j] = vet1[maior];
                                vet1[maior] = aux;
                            }
                        }
                    }

                    for (int i = 0; i < vet1.length; i++) {
                        int maior1 = i;
                        for (int k = 0; k < vet1.length - 1; k++) {
                            comparacao = comparacao + 1;
                            if (vet1[k] > vet1[maior1]) {

                                trocas = trocas + 1;
                                int aux1 = vet1[k];
                                vet1[k] = vet1[maior1];
                                vet1[maior1] = aux1;
                            }
                        }
                    }
                    System.out.println("\nVETOR ORDENADO:");
                    imprimir(vet1);
                    System.out.println("");
                    System.out.println("COMPARAÇÕES: " + comparacao);
                    System.out.println("TROCAS: " + trocas);

                    break;

                case 2: // segunda quest�o
                    System.out.println("-------SELECTION SORT-------");
                    int menor;
                    int aux2;
                    int comparacao2 = 0;
                    int trocas2 = 0;

                    int cont2 = 1;

                    System.out.print("Qual o Tamanho do Vetor: ");
                    int numero2 = sc.nextInt();
                    int vet2[] = new int[numero2];
                    exibirMenuVetor();

                    int opcao2 = sc.nextInt();
                    if (opcao2 == 1) {
                        for (int i = 0; i < vet2.length; i++) {
                            Random aleatorio = new Random();
                            int n1 = aleatorio.nextInt(100);
                            vet2[i] = n1;
                        }
                    } else if (opcao2 == 2) {
                        for (int i = 0; i < vet2.length; i++) {
                            Scanner st = new Scanner(System.in);
                            System.out.println("-------------------------------------------------");
                            System.out.print("Digite o " + cont2 + "º Número: ");
                            int num = st.nextInt();
                            cont2++;
                            vet2[i] = num;
                        }
                    } else {
                        System.out.println("Execute novamente e digite um valor valido (1 ou 2)");
                        System.exit(0);
                    }

                    imprimir(vet2);
                    for (int i = 0; i < vet2.length; i++) {
                        menor = i;
                        for (int j = (i + 1); j < vet2.length; j++) {
                            if (vet2[j] < vet2[menor]) {
                                menor = j;

                            }
                        }
                        aux2 = vet2[i];
                        vet2[i] = vet2[menor];
                        vet2[menor] = aux2;
                    }

                    for (int i = 0; i < vet2.length; i++) {
                        int maior1 = i;
                        for (int k = 0; k < vet2.length - 1; k++) {
                            comparacao2 = comparacao2 + 1;
                            if (vet2[k] > vet2[maior1]) {

                                trocas = trocas2 + 1;
                                int aux1 = vet2[k];
                                vet2[k] = vet2[maior1];
                                vet2[maior1] = aux1;
                            }
                        }
                    }
                    System.out.println("\nVETOR ORDENADO:");
                    imprimir(vet2);
                    System.out.println("");
                    System.out.println("COMPARAÇÕES: " + comparacao2);
                    System.out.println("TROCAS: " + trocas2);

                    break;

                case 3:
                    System.out.println("-------INSERTION SORT-------");

                    int comparacao3 = 0;
                    int trocas3 = 0;
                    int cont3 = 1;

                    System.out.print("Qual o Tamanho do Vetor: ");
                    int numero3 = sc.nextInt();
                    int vet3[] = new int[numero3];
                    exibirMenuVetor();

                    int opcao3 = sc.nextInt();
                    if (opcao3 == 1) {
                        for (int i = 0; i < vet3.length; i++) {
                            Random aleatorio = new Random();
                            int n1 = aleatorio.nextInt(100);
                            vet3[i] = n1;
                        }
                    } else if (opcao3 == 2) {
                        for (int i = 0; i < vet3.length; i++) {
                            Scanner st = new Scanner(System.in);
                            System.out.println("-------------------------------------------------");
                            System.out.print("Digite o " + cont3 + "º Número: ");
                            int num = st.nextInt();
                            cont3++;
                            vet3[i] = num;

                        }
                    } else {
                        System.out.println("Execute novamente e digite um valor valido (1 ou 2)");
                        System.exit(0);
                    }

                    for (int i = 1; i < vet3.length; i++) {

                        int j = i;

                        while (j > 0 && vet3[j] < vet3[j - 1]) {
                            int aux3 = vet3[j];
                            vet3[j] = vet3[j - 1];
                            vet3[j - 1] = aux3;
                            j = 1;
                        }
                    }
                    for (int i = 0; i < vet3.length; i++) {
                        int maior1 = i;
                        for (int k = 0; k < vet3.length - 1; k++) {
                            comparacao3 = comparacao3 + 1;
                            if (vet3[k] > vet3[maior1]) {

                                trocas3 = trocas3 + 1;
                                int aux1 = vet3[k];
                                vet3[k] = vet3[maior1];
                                vet3[maior1] = aux1;
                            }
                        }
                    }
                    System.out.println("\nVETOR ORDENADO:");
                    imprimir(vet3);
                    System.out.println("");
                    System.out.println("COMPARAÇÕES: " + comparacao3);
                    System.out.println("TROCAS: " + trocas3);
                    break;

            }

        } while (menu != 7);

    }

    public static void imprimir(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(" " + vetor[i]);
        }
    }

    static void exibirMenu() {

        System.out.println("\n\n         MENU DE QUESTÕES     ");
        System.out.println(" |  ------ 1 BUBBLE SORT-------        |");
        System.out.println(" |  ------ 2 SELECTION SORT------      |");
        System.out.println(" |  ------ 3 INSERTION SORT------      |");
        System.out.println(" ESCOLHA UMA QUESTÃO ");
    }

    static void exibirMenuVetor() {
        System.out.println(" Deseja definir tamanho e valores manual ou aleatorio ? ");
        System.out.println(" 1 - ALEATORIO ");
        System.out.println(" 2 - MANUAL ");
        System.out.print(" --> ");
    }
}

