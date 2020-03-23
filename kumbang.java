
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kumbang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kumbang extends Actor
{
    int speed = 5;
    int bounds = 35;
    /**
     * Act - do whatever the kumbang wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(speed);
        if (getX() > getWorld().getWidth()-bounds||
            getX() < bounds || getY() < bounds ||
            getY() > getWorld().getHeight()-bounds)
        {
            move(-2 * speed);
            turn(-90);
        }
    }    
}
