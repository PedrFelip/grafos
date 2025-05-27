import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Grafo {
    Map<String, List<String>> conexoes = new HashMap<>();

    public void adicionarAresta(String nome) {
        conexoes.putIfAbsent(nome, new ArrayList<>());
    }

    public void conectarAresta(String origem, String destino) {
        conexoes.putIfAbsent(origem, new ArrayList<>());
        conexoes.putIfAbsent(destino, new ArrayList<>());
        conexoes.get(origem).add(destino);
        conexoes.get(destino).add(origem);
    }

    public void mostrarGrafo() {
        for (String nome : conexoes.keySet()) {
            System.out.println(nome + " -> " + conexoes.get(nome));
        }
    }
}