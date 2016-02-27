import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Players here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Players extends Actor
{
    // A counter to for waiting between reloading missiles
    private int reloadWait = 0;
    // The reload wait time.
    private int reloadWaitTime = 20;
    /**
     * Act - do whatever the Players wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

    }
    /**
     * move - moves the player in the world.
     */
    public void move(){
        if(this.getClass() == Defender.class) {
        
        } else if (this.getClass() == Invader.class) {
            
        }
    }
    
    /**
     * moveLeft - moves the current player left one space
     */
    public void moveLeft(){
        int currentX = this.getX();
        int currentY = this.getY();
        this.setLocation( (currentX - 1), currentY );
    }
    /**
     * moveLeft - moves the current player left i spaces
     */
    public void moveLeft(int i){
        int currentX = this.getX();
        int currentY = this.getY();
        this.setLocation( (currentX - i), currentY );
    }
    /**
     * moveRight - moves the current player right one space
     */
    public void moveRight(){
        int currentX = this.getX();
        int currentY = this.getY();
        this.setLocation( (currentX + 1), currentY );
    }
    /**
     * moveRight - moves the current player right i spaces
     */
    public void moveRight(int i){
        int currentX = this.getX();
        int currentY = this.getY();
        this.setLocation( (currentX + i), currentY );
    }
    /**
     * hit - a player that gets hit
     */
    public void hit(java.lang.Object missile ){
        if (missile.getClass() == Missile.class) {
        
        } else {
            // Do nothing
        }
    }
    /**
     * shoot - file a missile from  the defender
     */
    public void shoot(Missile M1, World W1){
        // Check to see if we are ready to shoot.
        if( reloadWait >= reloadWaitTime){
            int currentX = this.getX();
            W1.addObject(M1, currentX, 300);
            reloadWait = 0;
        }
    }
    public void incrementWaitCounter(){
        reloadWait++;
    }
    /**
     * setReloadWaitTime - sets the delay time between missiles can be fired.
     */
    public void setReloadWaitTime(int newTime){
        reloadWaitTime = newTime;
    }
    
}
