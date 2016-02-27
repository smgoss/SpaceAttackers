import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Defender here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Defender extends Players
{
    
    public Defender(){
        this.setRotation(-90);
    }
    // A string for comparing against left
    private String left = "left";
    // A string for comparing against right
    private String right = "right";
    // A string for compairing against space
    private String space = "space";
    // A string for compairing against up
    private String up = "up";
    /**
     * Act - do whatever the Defender wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        keyHandler();
        super.incrementWaitCounter();
        
    }
    /**
     * keyHandler - handles the key input for a defender
     */
    public void keyHandler(){
        /**
         * move the defender left or right
         */
        if (Greenfoot.isKeyDown(left) ) {
            this.moveLeft();
        } else if (Greenfoot.isKeyDown(right) ){
            this.moveRight();
        }
        /**
         * shoot the missile
         */
        if ( (Greenfoot.isKeyDown(space)) || (Greenfoot.isKeyDown(up)) ){
            this.shoot();
        } 
    }
    public void shoot(){
        Missile M1 = new Missile();
        World myWorld = this.getWorld();
        super.shoot(M1, myWorld);
    }
    
    public void getHit(){
    
    }
}
