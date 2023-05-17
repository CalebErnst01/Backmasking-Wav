import java.util.EmptyStackException;

public class ArrayStack implements BKStack
{
    double[] Stack;
    int pointer;

    public ArrayStack() //default with initial size of 10
    {
        Stack = new double[10];
        pointer = 0;
    }

    public ArrayStack(int size) //manual initializer of custom size
    {
        Stack = new double[size];
        pointer = 0;
    }

    public void push(double insert)
    {
        if(pointer == Stack.length)
            resize();

        Stack[pointer] = insert;
        pointer++;
    }

    public void resize()
    {
        double[] middleMan = Stack.clone();
        Stack = new double[Stack.length *2]; //twice original size

        for(int i = 0; i < middleMan.length; i++)
            Stack[i] = middleMan[i];
    }

    public double pop()
    {
        if(!isEmpty())
        {
            pointer--;
            return Stack[pointer];
        }
        else
        {
            System.out.println("ERROR, poping empty ArrayStack"); //EmptyStackException; I realize I could use a Try/Catch, but I think the if's look better here.
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
}
