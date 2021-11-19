import java.util.ArrayList;

public class Node {
    private int id;
    private long lon;
    private long lat;
    private ArrayList<Edge> edges;
    private long time;

    public Node(int id, long lon, long lat) {
        this.id = id;
        this.lon = lon;
        this.lat = lat;
        edges = new ArrayList<Edge>();
        time = -1;
    }

    public int getId() {
        return id;
    }

    public long getLon() {
        return lon;
    }

    public long getLat() {
        return lat;
    }

    public ArrayList<Edge> getEdges() {
        return edges;
    }

    public long getTime() {
        return time;
    }

    public void addEdge(Edge e) {
        edges.add(e);
    }

    public void setTime(long time) {
        this.time = time;
    }

    public void newTime(Edge e) {
        long t = e.getFrom().getTime();
        t += e.getTime();
        time = t;
    }
}
