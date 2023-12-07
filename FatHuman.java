import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FatHuman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FatHuman extends Actor
{
    /**
     * Act - do whatever the FatHuman wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int x = getX();
        int y = getY() + 3;
        setLocation (x,y);
        
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.removeObject(this);
        }
    }
}
