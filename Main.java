import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		String inputFileName = "/home/crow/Desktop/algo/input.txt";

//		Command line input TO BE UNCOMMENTED
//		String inputFileName = args[0];

		FileReader reader = new FileReader(inputFileName);
		Scanner in = new Scanner(reader);
		String line = in.nextLine();
        	Scanner lineScanner = new Scanner(line);
		int numVertices = lineScanner.nextInt();
		
        // insert code here to build the graph from the input file
        // create empty graph with correct number of vertices
		Graph graph = new Graph(numVertices);


        // then go through input line by line adding edges to the graph

		for (int i = 0; i <= numVertices - 1; i++){
			String row = in.nextLine();
			String[] elements = row.trim().split(" ");
			System.out.println(Arrays.toString(elements));
			for (int c = 0; c <= elements.length - 1; c ++){
				System.out.println(c + "  " + elements[c]);

			}

			// git test









		}










        
		reader.close();

		// conduct the breadth-first search
		String outputFileName = "/home/crow/Desktop/algo/output.txt";

//		Command line output TO BE UNCOMMENTED
//		String outputFileName = args[1];
		FileWriter writer = new FileWriter(outputFileName);
		
		// insert code here to output the predecessor information

		writer.close();

	}

}
