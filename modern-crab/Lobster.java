// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Lobster extends Actor
{

    /**
     * To be able to act the methods
     */
    public void act()
    {
        MoveAndTurn();
        eatCrab();
        transIntoLobster();
    }

    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void MoveAndTurn()
    {
        move(4);
        if (Greenfoot.getRandomNumber(10) == 1) {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if (isAtEdge()) {
            turn(180);
        }
    }

    /**
     * Act - do whatever the Worn wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void eatCrab()
    {
        Actor crab = getOneIntersectingObject(Crab.class);
        if (crab != null) {
            World world = getWorld();
            world.removeObject(crab);
            Greenfoot.playSound("eating.wav");
            Greenfoot.playSound("fail.mp3");
        }
    }

    /**
     * 
     */
    public void transIntoLobster()
    {
        Actor worm = getOneIntersectingObject(Worm.class);
        if (worm != null) {
            World world = getWorld();
            int x = worm.getX();
            int y = worm.getY();
            world.removeObject(worm);
            Lobster lobster =  new  Lobster();
            world.addObject(lobster, x, y);
        }
    }
}
