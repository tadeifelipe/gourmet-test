package app.view;

import app.model.NodeFood;

import javax.swing.*;

public class Message {
    private static JFrame frameGame;

    public void startMessage() {
        frameGame = new JFrame();
        JOptionPane.showMessageDialog(frameGame, "Pense em um prato que gosta");
    }

    public int question(NodeFood nodeFood) {
        return JOptionPane.showConfirmDialog(frameGame,
                "O prato que você pensou é " + nodeFood.getDescription() +"?",
                "Confirmar",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    }

    public void hitAgain() {
        JOptionPane.showMessageDialog(frameGame, "Acertei de novo!");
    }

    public String askWhichDish() {
        return JOptionPane.showInputDialog(frameGame,"Qual prato você pensou?");
    }

    public String askWhatItDo(String dish, NodeFood nodeFood) {
        return JOptionPane.showInputDialog(frameGame, String.format("%s é _____ mas %s não é",
                                                                dish, nodeFood.getDescription()));
    }

}
