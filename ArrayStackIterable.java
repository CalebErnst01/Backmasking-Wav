import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Iterator;


public class ArrayStackIterable implements Iterable<Double>
{
    Double[] Stack;
    int pointer;

    public ArrayStackIterable() //default with initial size of 10
    {
        Stack = new Double[10];
        pointer = 0;
    }

    public void push(double insert)
    {
        if(pointer == Stack.length)
            resize();

        Stack[pointer] = (Double)(insert);
        pointer++;
    }

    public void resize()
    {
        Double[] middleMan = Stack.clone();
        Stack = new Double[Stack.length *2]; //twice original size

        for(int i = 0; i < middleMan.length; i++)
            Stack[i] = middleMan[i];
    }

    public double pop()
    {
        Iterator I = iterator();

        if(!I.hasNext())
        {
            pointer--;
            return (double)(Stack[pointer]);
        }
        else
        {
            System.out.println("ERROR, poping empty ArrayStack"); //EmptyStackException; i realise i could use a try/catch here, but i think this makes more sense.
            System.exit(1);
            return -1;
        }
    }

    public double peek()
    {
        return Stack[pointer -1];
    }

    public boolean isEmpty()
    {
        if(pointer > 0)
            return false;
        else
            return true;
    }

    @Override
    public Iterator<Double> iterator()
    {
        Iterator<Double> I = Arrays.stream(Stack).iterator();
        return I;
    }
}
