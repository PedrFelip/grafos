public class Main {
    public static void main(String[] args) {
        Grafo grafo = new Grafo();
        grafo.adicionarAresta("A");
        grafo.adicionarAresta("B");
        grafo.adicionarAresta("C");
        grafo.conectarAresta("A", "B");
        grafo.conectarAresta("B", "C");
        grafo.mostrarGrafo();
    }
}