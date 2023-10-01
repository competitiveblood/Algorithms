public class Dijkstra {
    public static class Node implements Comparable<Node> {
        private int id;
        private int distance;

        public Node(int id, int distance) {
            this.id = id;
            this.distance = distance;
        }

        @Override
        public int compareTo(Node other) {
            return Integer.compare(this.distance, other.distance);
        }
    }

    public static int[] calculateShortestPathFromSource(Graph graph, Node source) {
        PriorityQueue<Node> queue = new PriorityQueue<>();
        int[] distances = new int[graph.getNumberOfNodes()];

        for (int i = 0; i < graph.getNumberOfNodes(); i++) {
            distances[i] = Integer.MAX_VALUE;
        }

        distances[source.id] = 0;
        queue.add(source);

        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();

            for (Edge edge : graph.getEdges(currentNode.id)) {
                Node neighborNode = graph.getNode(edge.getDestination());

                if (distances[neighborNode.id] == Integer.MAX_VALUE) {
                    int newDistance = currentNode.distance + edge.getWeight();

                    if (newDistance < distances[neighborNode.id]) {
                        distances[neighborNode.id] = newDistance;
                        queue.add(neighborNode);
                    }
                }
            }
        }



