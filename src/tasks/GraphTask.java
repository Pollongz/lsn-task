package tasks;

import java.util.*;

public class GraphTask {

    static Map<Integer, List<Integer>> graph = new HashMap<>();

    public static void run() {
        System.out.println("Pass number of connections, confirm and then add pairs of vertices(confirm after every pair):");
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        try {
            n = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input.");
        }

        for (int i = 0; i < n; i++) {
            try {
                Scanner scanner1 = new Scanner(System.in);
                String input = scanner1.nextLine();
                String[] numberStrings = input.split("\\s+");

                for (int j = 0; j < numberStrings.length; j++) {
                    int num1 = Integer.parseInt(numberStrings[0]);
                    int num2 = Integer.parseInt(numberStrings[1]);

                    if (num1 > 0 && num2 > 0) {
                        addEdge(num1, num2);
                    }
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input.");
            }
        }

        System.out.println("\nAmount of separated graphs: ");
        System.out.println(countSeparatedGraphs());
    }

    static void addEdge(int u, int v) {
        graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
        graph.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
    }

    static void depthFirstSearch(int vertex, Set<Integer> visited) {
        visited.add(vertex);
        graph.getOrDefault(vertex, Collections.emptyList()).stream()
                .filter(neighbor -> !visited.contains(neighbor))
                .forEach(neighbor -> depthFirstSearch(neighbor, visited));
    }

    static int countSeparatedGraphs() {
        Set<Integer> visited = new HashSet<>();
        int separatedGraphs = 0;

        for (int vertex : graph.keySet())
            if (!visited.contains(vertex)) {
                depthFirstSearch(vertex, visited);
                separatedGraphs++;
            }

        return separatedGraphs;
    }
}
