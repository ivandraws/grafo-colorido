
public class TestesGrafos {
    // Novo teste de código de grafos. Utiliza o TestesGrafos e Grafo
    public static void main() {
        Grafo teste = new Grafo(3);

        teste.addEdge(0, 1);
        teste.addEdge(0, 2);
        teste.addEdge(1, 0);
        teste.addEdge(1, 2);
        teste.addEdge(2, 0);
        teste.addEdge(2, 1);

        teste.showMatrix();
    }


}
