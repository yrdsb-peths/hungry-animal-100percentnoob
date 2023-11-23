import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Elephant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elephant extends Actor
{
    /**
     * Act - do whatever the Elephant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-1); 
        }
        else if (Greenfoot.isKeyDown("right"))
        {
            move(1);
        }  
        removeTouching(Human.class);
    }
    
    public void eat()
    {
        if(isTouching(Human.class))
        {
            removeTouching(Human.class);
            MyWorld world = (MyWorld) getWorld();
            world.createHuman();
            world.increaseScore();
        }
       
    }
}
