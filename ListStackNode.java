public class ListStackNode 
{
    double data;
    ListStackNode next;

    public ListStackNode(double input, ListStackNode prev) 
    {
        this.data = input;
        this.next = prev;
    }
}
