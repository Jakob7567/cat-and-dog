
/**
 * Make cat
 *
 * @author Jakob L.
 * @version 16/03/21
 */
public class Dog
{
    //fields
    private String name;
    private int hp;
    
    /**
     * Constructor for cat object
     */
    public Dog(String nm)
    {
        // initialize the instance variables
        name = nm;
        hp = 150;
    }
    
    public void woof()
    {
        System.out.println("woof");
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
    
    public int bite()
    {
        int MIN = 1, MAX = 10;
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
