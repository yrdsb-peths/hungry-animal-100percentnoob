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
    GreenfootSound elephantSound = new GreenfootSound("elephantcub.mp3");
    GreenfootImage[] idleRight = new GreenfootImage[8];
    GreenfootImage[] idleLeft = new GreenfootImage[8];
    String facing = "right";
    SimpleTimer animationTimer = new SimpleTimer();
    public Elephant ()
    {
        for(int i = 0; i< idleRight.length; i++)
        {
            idleRight[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
            idleRight[i].scale(75,75);
        }
        for(int i = 0; i< idleLeft.length; i++)
        {
            idleLeft[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
            idleLeft[i].mirrorHorizontally();
            idleLeft[i].scale(75,75);
        }
        animationTimer.mark();
        setImage(idleRight[0]);
    }
   
    int imageIndex = 0;
    public void animateElephant()
    {
        if(animationTimer.millisElapsed() <100)
        {
            return;
        }
        animationTimer.mark();
        if(facing.equals("right"))
        {
            setImage(idleRight[imageIndex]);
            imageIndex = (imageIndex + 1) % idleRight.length;
        }
        else 
        {
             setImage(idleLeft[imageIndex]);
             imageIndex = (imageIndex + 1) % idleLeft.length;
        }
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-4); 
            facing = "left";
        }
        else if (Greenfoot.isKeyDown("right"))
        {
            move(4);
            facing = "right";
        }  
        eat();
        animateElephant();
        eatfat();
    }
    public void eat()
    {
        if(isTouching(Human.class))
        {
            removeTouching(Human.class);
            MyWorld world = (MyWorld) getWorld();
            world.createHuman();
            world.increaseScore();
            elephantSound.play();
        }
       
    }
     public void eatfat()
    {
        if(isTouching(FatHuman.class))
        {
            removeTouching(FatHuman.class);
            MyWorld world = (MyWorld) getWorld();
            world.createHuman();
            world.increaseScore5();
            elephantSound.play();
        }
    }
}
