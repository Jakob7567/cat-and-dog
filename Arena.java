
/**
 * Where the cats and dogs fight to the death
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Arena
{
    private final int MAXDOGS = 3, MAXCATS = 3;
    
    // Making an array of dogs and cats holding objects
    private Dog[] dogs = new Dog[MAXDOGS];
    private Cat[] cats = new Cat[MAXCATS];
    
    public void fillKennel()
    {
        for (int idx = 0; idx < dogs.length; idx ++)
        {
            dogs[idx] = new Dog("Dog" + Integer.toString(idx + 1));
            cats[idx] = new Cat("Cat" + Integer.toString(idx + 1));
            
            // make the dogs and cats bark and meow
            System.out.println(dogs[idx].getName() + " goes");
            dogs[idx].woof();
        }
    }
    
    public void dogAttack(Dog dog, Cat cat)
    {
        if (dog.isAlive() == false)
        {
           System.out.println(dog.getName() + " bites " + cat.getName());
           cat.hit(dog.bite()); 
        }
        
        
        // check if its still alive
        if (cat.isAlive() == false)
        {
            System.out.println(cat.getName() + " is dead.");
        }
    }
    
    public void catAttack(Dog dog, Cat cat)
    {
        if (cat.isAlive() == false)
        {
            System.out.println(cat.getName() + " claws " + dog.getName());
            dog.hit(cat.claw());
        }
        
        
        // check if its still alive
        if (dog.isAlive() == false)
        {
            System.out.println(dog.getName() + " is dead.");
        }
    }
    
    public void fight()
    { 
        this.dogAttack(dogs[0], cats[0]);
        this.dogAttack(dogs[0], cats[0]);
        
        this.catAttack(dogs[0], cats[0]);
        this.catAttack(dogs[0], cats[0]);
    }
}
