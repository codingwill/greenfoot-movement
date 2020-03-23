import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kupu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kupu extends Actor
{
    int vTurn = 1;
    int vMove = 1;
    int speed = 5;
    int bounds = 35;
    /**
     * Act - do whatever the kumbang wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(speed);
        if (getX() > getWorld().getWidth()-bounds) vMove = -1;
        else if (getX() < bounds) vMove = 1;
        if (getY() < bounds || getY() > getWorld().getHeight()-bounds)
        {
            
            if (getY() < bounds) vTurn = -1;
            else vTurn = 1;
            move(-2 * speed);
            turn(vTurn * vMove * -90);
            move(5 * speed);
            turn(vTurn * vMove * -90);
        }
        
    }    
}
