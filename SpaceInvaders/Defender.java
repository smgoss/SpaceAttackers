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
    private int shootCounter = 0;
    private int shootWait = 30;
    /**
     * Act - do whatever the Defender wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        keyHandler();
        shootCounter ++;
        
        
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
        DefenderMissile D1 = new DefenderMissile();
        World myWorld = this.getWorld();
        int currentX = this.getX();
        if(shootCounter >= shootWait){
            super.shoot(D1, myWorld, currentX, 280);
            shootCounter =0;
        }
    }
    public void getHit(){
    
    }
}
