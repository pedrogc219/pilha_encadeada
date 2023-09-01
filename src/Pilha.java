public class Pilha {
    private Node topo;
    public Pilha() {
        topo = null;
    }

    public void inserir(int valor) {
        Node no = new Node();
        no.setInfo(valor);
        if (topo == null) {
            topo = no;
        } else {
            no.setProximo(topo);
            topo = no;
        }
    }

    public void remover() {
        Node anterior = null;
        Node deletado = null;

        if (topo == null) {
            System.out.println("Pilha esta vazia.");
        }
        else if (topo.getProximo() == null) {
            topo = null;
        } else {
            deletado = topo;
            topo = topo.getProximo();
            deletado = null;
        }
    }

    public void imprimir() {
        if (topo != null) {
            Node proximo = topo;
            while(true) {
                System.out.print(proximo.getInfo()+" ");
                proximo = proximo.getProximo();
                if (proximo == null) {
                    break;
                }
            }
        } else {
            System.out.println("Pilha esta vazia.");
        }
    }
}
