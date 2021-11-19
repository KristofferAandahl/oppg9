public class Edge {
    private Node from;
    private Node to;
    private long time;
    private long dist;

    public Edge(Node from, Node to, long time, long dist) {
        this.from = from;
        this.to = to;
        this.time = time;
        this.dist = dist;
    }

    public Node getFrom() {
        return from;
    }

    public Node getTo() {
        return to;
    }

    public long getTime() {
        return time;
    }

    public long getDist() {
        return dist;
    }
}
