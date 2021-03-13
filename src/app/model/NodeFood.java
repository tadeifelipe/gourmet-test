package app.model;

public class NodeFood {
    private String description;
    private NodeFood nodeFoodLeft;
    private NodeFood nodeFoodRight;

    public NodeFood(String description) {
        this.description = description;
        this.nodeFoodLeft = null;
        this.nodeFoodRight = null;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public NodeFood getNodeLeft() {
        return nodeFoodLeft;
    }

    public void setNodeLeft(NodeFood nodeFoodLeft) {
        this.nodeFoodLeft = nodeFoodLeft;
    }

    public NodeFood getNodeRight() {
        return nodeFoodRight;
    }

    public void setNodeRight(NodeFood nodeFoodRight) {
        this.nodeFoodRight = nodeFoodRight;
    }
}
