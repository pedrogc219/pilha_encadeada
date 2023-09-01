import java.util.Scanner;

// Pedro Gonçalves Classen

public class PilhaEncadeada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pilha pilha = new Pilha();
        int acao;
        int valor;

        while(true) {
            System.out.println("\n1 - Inserir");
            System.out.println("2 - Remover");
            System.out.println("0 - Imprimir");

            acao = scanner.nextInt();

            switch (acao) {
                case 1:
                    System.out.print("Valor: ");
                    valor = scanner.nextInt();
                    pilha.inserir(valor);
                    break;

                case 2:
                    pilha.remover();
                    break;

                case 0:
                    pilha.imprimir();
                    break;

                default:
                    System.out.println("Operacao invalida.");
            }
        }
    }
}