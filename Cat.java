
/**
 * Make cat
 *
 * @author Jakob L.
 * @version 16/03/21
 */
public class Cat
{
    //fields
    private String name;
    private int hp;
    
    /**
     * Constructor for cat object
     */
    public Cat(String nm)
    {
        // initialize the instance variables
        name = nm;
        hp = 100;
    }
    
    public void meow()
    {
        System.out.println("meow");
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getHealth()
    {
        return hp;
    }
    
    public void hit(int amt)
    {
        this.hp -= amt;
    }
    
    public int claw()
    {
        int MIN = 5, MAX = 20;
        return (int) (MIN + Math.random() * MAX);
    }
    
    public boolean isAlive()
    {
        if (this.hp <= 0)
        {
            return false;
        }
        return true;
    }
}
