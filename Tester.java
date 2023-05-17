import java.util.List;

public class Tester 
{
    public static void main(String[] args)
    {
        //System.out.println("It Works!");

        /*ArrayStack S = new ArrayStack();
        S.push(1.2);
        S.push(2.5);
        //System.out.println(S.pop() + " " + S.peek());
        S.push(3.14);
        System.out.println(S.pop() + " " + S.pop() + " " + S.pop());
        */

        ListStack S = new ListStack();
        S.push(1.2);
        S.push(2.5);
        System.out.println(S.peek());
        S.push(3.14);
        System.out.println(S.pop() + " " + S.pop() + " " + S.pop());
    }    
}
