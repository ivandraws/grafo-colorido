import java.util.Objects;

public class Vertex {
    //  Label representará um nome qualquer do vértice. Color vai ser uma variável que vai definir a
    // cor de um vértice. Por motivos de simplificação, vamos limitar a 8 valores e escolher as cores
    // a serem utilizadas.
    String label;
    int color;

    Vertex(String label)
    {
        this.label = label;
        this.color = 0;
    }

    int getColor(){
        return color;
    }

    void setColor(int i) throws Exception {
        if (i < 0 || i > 7)
        {
            throw new Exception("Valor fora dos parâmetros estipulados!");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vertex vertex = (Vertex) o;
        return Objects.equals(label, vertex.label);
    }

}
