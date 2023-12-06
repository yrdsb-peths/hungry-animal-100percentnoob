import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen
 * 
 * @author (Ryan Qiu) 
 * @version (12/5/2023)
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("The Elephant" , 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel,getWidth()/2, 200);
        prepare();
    }

    /**
     *
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }

    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,getWidth()/2,300);

        Label label = new Label("<-- and --> to move left and right", 40);
        addObject(label,287,245);
        label.setLocation(287,245);
        label.setLocation(376,247);
        label.setLocation(305,234);
        label.setLocation(305,234);
        label.setLocation(306,250);
        elephant.setLocation(290,100);
        Label label2 = new Label("Press space to start", 25);
        addObject(label2,291,330);
        label2.setLocation(319,284);
    }
}
