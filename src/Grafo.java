import java.util.ArrayList;
import java.util.Map;

// TODO: Aplicar a classe Vertex para dar nome e cor aos vértices. Revisar código para possíveis otimizações
public class Grafo {

    // Atributo que guarda os vértices e arestas

    private final int [] [] adjVertices;
    private final int V;
    private int E;

    private Map<Vertex, ArrayList<Vertex>> teste;

    // Construtor
    public Grafo(int v) {
        this.V = v;
        this.adjVertices = new int[V][V];
        initAdjVertex();
        this.E = 0;
    }

    // Inicializa a Matriz de Adjacência
    private void initAdjVertex(){
        for (int i = 0; i < getVertex(); i++)
        {
            for (int j = 0; j < getVertex(); j++)
            {
                adjVertices[i][j] = 0;
            }
        }
    }

    // Saber quantos vértices o grafo tem
    public int getVertex(){
        return V;
    }

    // Adiciona uma aresta. Grafo simples e não graduado. Pode ser modificado para permitir graduados
    public void addEdge(int v1, int v2)
    {
        if ((v1 < V && v2< V) && (v1 >= 0 && v2 >= 0))
        {
            adjVertices[v1][v2] = 1;
            adjVertices[v2][v1] = 1;
            E++;
        }
    }

    // Mostra a matriz de adjacência
    public void showMatrix(){
        for (int i = 0 ; i < V; i++)
        {
            for (int j = 0; j < V; j++)
            {
                IO.print(adjVertices[i][j] + " ");
            }
            IO.println();
        }

    }

}
