import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boy extends Actor
{
    /**
     * Act - do whatever the Boy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        kontrolBoy();
    }    
    
    public void kontrolBoy()
    {
        int x = getX();
        int y = getY();
        if (Greenfoot.isKeyDown("left"))
        {
            x = x-5;
        }
        if (Greenfoot.isKeyDown("right"))
        {
            x = x+5;
        }
        if (Greenfoot.isKeyDown("up"))
        {
            y = y-5;
        }
        if (Greenfoot.isKeyDown("down"))
        {
            y = y+5;
        }
        setLocation(x, y);
    }
}
