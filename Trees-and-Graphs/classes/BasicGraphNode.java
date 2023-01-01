package classes;

public class BasicGraphNode {

    public char value;
    public BasicGraphNode[] adjacent;
    public boolean visited = false;

    public BasicGraphNode(char value) {
        this.value = value;
    }

}
