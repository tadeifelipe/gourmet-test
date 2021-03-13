package app.controller;

import app.model.NodeFood;
import app.view.Message;

public class GameController {
    private NodeFood root;
    private Message message;

    public GameController() {
        message = new Message();
        createInitialNodes();
    }

    public void createInitialNodes() {
        root = new NodeFood("Massa");
        root.setNodeLeft(new NodeFood("Lasanha"));
        root.setNodeRight(new NodeFood("Bolo de Chocolate"));
    }

    public void start() {
        message.startMessage();
        int answer = 1;
        do {
            answer = message.question(root);
            if (answer == 0)
                questionFood(root.getNodeLeft());
            else if (answer == 1)
                questionFood(root.getNodeRight());

            message.startMessage();
        } while (answer != -1);
    }

    private void questionFood(NodeFood nodeFood) {
        int answer = message.question(nodeFood);

        if (answer == 0) {
            if (nodeFood.getNodeLeft() == null)
                message.hitAgain();
            else
                questionFood(nodeFood.getNodeLeft());
        } else {
            if (nodeFood.getNodeRight() == null )
                createNode(nodeFood);
            else
                questionFood(nodeFood.getNodeRight());
        }
    }

    public void createNode(NodeFood nodeFood) {
        String dish = message.askWhichDish();
        String whatDo = message.askWhatItDo(dish, nodeFood);

        nodeFood.setNodeRight(new NodeFood(nodeFood.getDescription()));
        nodeFood.setNodeLeft(new NodeFood(dish));
        nodeFood.setDescription(whatDo);
    }

    public NodeFood getRoot() {
        return root;
    }
}
