import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public int score =0;
    Label scoreLabel;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1 , false);
        Elephant elephant = new Elephant();
        addObject(elephant , 300 , 300);
        
        Label scoreLabel = new Label(0,80);
        addObject(scoreLabel, 50, 50 );
        createHuman();
        
        
    }
    public  void gameOver(){
        Label gameOverLable = new Label ("GameOver" , 100);
        addObject(gameOverLable,300,200);
    }
    public void increaseScore(){
        score++;
        scoreLabel.setValue(score);
    }
    public void createHuman()
    {
        Human human = new Human();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(human, x, y);
    }
}
