import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
        Boy boy1 = new Boy();
        addObject(boy1, 100, getHeight()-100);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        kumbang kumbang = new kumbang();
        addObject(kumbang,54,348);
        kumbang.setLocation(46,361);
        kupu kupu = new kupu();
        addObject(kupu,46,41);
        kupu.turn(90);
    }
}
