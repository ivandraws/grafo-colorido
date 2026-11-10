import java.util.Scanner;

public class Gerador {
    // Teste antigo de replicação do código em C
    public static void init(int size, int [][] arr)
    {
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                arr[i][j] = 0;
            }
        }
    }

    static void show(int size, int[][]arr)
    {
        for (int i[]: arr)
        {
            for (int j: i)
            {
                IO.print(j + " ");
            }
            IO.println();
        }
    }
    static void main() {
        int size;
        IO.println("Gerador de Grafos");

        Scanner scanner = new Scanner(System.in);

        IO.print("Digite o tamanho da matriz: ");
        size = scanner.nextInt();

        IO.println("Tamanho " + size + " X " + size);

        int[][] matrix;
        matrix = new int[size][size];

        init(size, matrix);

        show(size, matrix);
    }
}
