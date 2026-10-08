import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SorteadorOnline {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Será a impressão de informações no console.
        Random random = new Random();

        int opcao;

            do {
                System.out.println("===========================");
                System.out.println("     Sorteador Online");
                System.out.println("===========================");
                System.out.println("  1 - Sortear um NÚMERO");
                System.out.println("  2 - Sortear um VÁRIOS NÚMEROS");
                System.out.println("  3 - Sortear um NOMES");
                System.out.println("  4 - Sortear um MOEDA");
                System.out.println("  5 - Sair do Programa!");
                System.out.println();

                System.out.print("Escolha uma das opções acima: ");
                opcao = scanner.nextInt();

                switch (opcao) {

                    case 1:
                        System.out.println();
                        System.out.println("Você escolher a opção SORTEAR UM NÚMERO");
                        System.out.println();

                        System.out.print("Digite um número mínimo: ");
                        int numeroMinimo = scanner.nextInt();

                        System.out.print("Digite um número máximo: ");
                        int numeroMaximo = scanner.nextInt();

                        if (numeroMaximo < numeroMinimo) {
                            System.out.println("Erro! O número máximo não pode ser menor que o número mínimo!");

                        } else {
                            int numeroSorteio = random.nextInt(numeroMaximo - numeroMinimo + 1) + numeroMinimo;

                            System.out.println("O número sorteado foi: " + numeroSorteio);

                        }

                        break;

                    case 2:
                        System.out.println();
                        System.out.println("Você escolher a opção SORTEAR VÁRIOS NÚMEROS");
                        System.out.println();

                        System.out.print("Digite o número mínimo: ");
                        int minimoVarios = scanner.nextInt();

                        System.out.print("Digite o número Máximo: ");
                        int maximoVarios = scanner.nextInt();

                        System.out.print("Digite quantos números deseja sortear: ");
                        int quantidade = scanner.nextInt();

                        if (maximoVarios < minimoVarios) {
                            System.out.println();
                            System.out.println("Erro! O número máximo não pode ser menor que o número mínimo!");

                        } else if (quantidade <= 0) {
                            System.out.println();
                            System.out.println("Erro! A Quantidade deve ser maior que zero");

                        } else {
                            for (int i = 1; i <= quantidade; i++) {
                                int numero = random.nextInt(maximoVarios - minimoVarios + 1) + minimoVarios;
                                System.out.println("Número " + i + " Sorteado: " + numero);
                            }

                        }
                        break;

                    case 3:

                        System.out.println();
                        System.out.println("Você escolher a opção SORTEAR NOMES");
                        System.out.println();

                        System.out.print("Digite a quantidade de participantes: ");
                        int quantidadeParticipantes = scanner.nextInt();
                        scanner.nextLine();

                        ArrayList<String> participantes = new ArrayList<>();

                        for (int i = 1; i <= quantidadeParticipantes; i++) {
                            System.out.print("Digite o nome do participante " + i + ": ");
                            System.out.println();

                            String nome = scanner.nextLine();
                            participantes.add(nome);

                            System.out.println();

                        }

                        int indiceSorteado =
                                random.nextInt(participantes.size());

                        String vencedor =
                                participantes.get(indiceSorteado);

                        System.out.println();
                        System.out.println("=============================");
                        System.out.println("        RESULTADO");
                        System.out.println("=============================");
                        System.out.println("Vencedor: " + vencedor);

                        break;


                    case 4:
                        System.out.println();
                        System.out.println("Você escolher a opção SORTEAR MOEDA");
                        System.out.println();

                        int moeda = random.nextInt(2);

                        if (moeda == 0) {

                            System.out.println();
                            System.out.println("Resultado CARA");
                        } else {

                            System.out.println();
                            System.out.println("Resultado CAROA");
                        }
                        break;

                    case 5:
                        System.out.println();
                        System.out.println("Encerrando o servidor Online...");
                        System.out.println();

                        break;


                }

            } while (opcao != 5);
        scanner.close();

        System.out.println("Programa finalizado com sucesso!");

    }
}
