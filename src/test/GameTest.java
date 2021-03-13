package test;

import app.controller.GameController;
import org.junit.Assert;
import org.junit.Test;

public class GameTest {
    GameController gameController = new GameController();

    @Test
    public void test1(){
        Assert.assertEquals(gameController.getRoot().getDescription(),"Massa");
        Assert.assertEquals(gameController.getRoot().getNodeLeft().getDescription(),"Lasanha");
        Assert.assertEquals(gameController.getRoot().getNodeRight().getDescription(),"Bolo de Chocolate");
    }
}
