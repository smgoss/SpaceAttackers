import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Invader here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Invader extends Players
{
    private int shootCounter = 0;
    private int shootWait = 30;
    private boolean nextMove = true;
    /**
     * Act - do whatever the Invader wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        this.shoot();
        shootCounter++;
        checkNextMove();
        move();
    }  
    public void checkNextMove(){
        if(this.isAtEdge()){
            nextMove = !nextMove;
        } else {
            // Do nothing
        }
    }
    public void move(){
        if(nextMove == true){
            moveRight();
        }else if(nextMove == false){
            moveLeft();
        }
        
    }
    public void shoot (){
        InvaderMissile I1 = new InvaderMissile();
        World myWorld = this.getWorld();
        int currentX = this.getX();
        int currentY = this.getY();
        if(shootCounter >= shootWait){
            shootWait = Greenfoot.getRandomNumber(100);
            shootCounter = 0;
            super.shoot(I1, myWorld, currentX, currentY);
        }
    }
}
