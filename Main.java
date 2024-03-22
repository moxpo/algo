import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {


        String inputFileName = args[0];

        FileReader reader = new FileReader(inputFileName);
        Scanner in = new Scanner(reader);
        String line = in.nextLine();
        Scanner lineScanner = new Scanner(line);
        int numVertices = lineScanner.nextInt();

        // insert code here to build the graph from the input file
        // create empty graph with correct number of vertices
        Graph graph = new Graph(numVertices);

        // then go through input line by line adding edges to the graph

        for (int i = 0; i <= numVertices - 1; i++) {
            String row = in.nextLine();
            String[] elements = row.trim().split(" ");
            for (int c = 0; c <= elements.length - 1; c++) {
                if (elements[c].equals("1")) {
                    graph.getVertex(i).addToAdjList(c);
                }
            }
        }


        reader.close();

        // conduct the breadth-first search
        graph.bfs();

        String outputFileName = args[1];
        FileWriter writer = new FileWriter(outputFileName);

        // insert code here to output the predecessor information
        BufferedWriter bw = new BufferedWriter(writer);
        for (int i = 0; i < graph.size(); i++) {
            int predecessor = graph.getVertex(i).getPredecessor();
            bw.write(predecessor + " ");
        }
        bw.newLine();

        bw.close();


        writer.close();
    }
    }
