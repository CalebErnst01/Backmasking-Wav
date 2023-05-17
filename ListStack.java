import java.util.EmptyStackException;

public class ListStack implements BKStack
{
    ListStackNode root;

    public ListStack()
    {
        root = new ListStackNode(-1, null); //dummy values for a end-of-line node
    }

    public void push(double input)
    {
        ListStackNode prev = root;
        root = new ListStackNode(input, prev);
    }

    public double pop()
    {
        if(root.next != null)
        {
            double returner = root.data;
            root = root.next;
            return returner;
        }
        else
        {
            System.err.println("EmptyStackException");
            return -1;
        }
    }

    public double peek()
    {
        if(!isEmpty())
            return root.data;
        else
            return -1;
    }

    public boolean isEmpty()
    {
        if(root.next == null)
            return true;
        else
            return false;
    }
}
