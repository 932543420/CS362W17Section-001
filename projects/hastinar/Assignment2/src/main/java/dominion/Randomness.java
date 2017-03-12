package dominion;

import java.util.List;
import java.util.Random;


public final class Randomness
{

    private Randomness()
    {
        //no instances
    }
    public static final long SEED = 0;


     //The random number used any testtime a random choice is made.
    /////////////////////////////////////////////////////////////////
    public static Random random = new Random();

    /////////////////////////////////////////////////////////////////
    public static void reset(long newSeed)
    {
        random = new Random(newSeed);
    }

    /////////////////////////////////////////////////////////////////
    public static int totalCallsToRandom = 0;


     //Uniformly random int from [0, i)
    /////////////////////////////////////////////////////////////////
    public static int nextRandomInt(int i)
    {
        totalCallsToRandom++;
        return random.nextInt(i);
    }


    /////////////////////////////////////////////////////////////////
    public static <T> T randomMember(List<T> list)
    {
        if (list == null || list.isEmpty())
        {
            throw new IllegalArgumentException("Expected non-empty list");
        }
        return list.get(nextRandomInt(list.size()));
    }





    /////////////////////////////////////////////////////////////////
    public  static void main(String args[])
    {
        int[] anArray = {
                100, 200, 300,
                400, 500, 600,
                700, 800, 900, 1000};

		Randomness.reset(27545);

        for(int i=0; i<10; i++)
        {
            System.out.println("Value=: "+ Randomness.nextRandomInt(1000));
        }
        System.exit(0);
    }





}
