import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        LinkedList <String> list = new LinkedList();
        list.add("Harsh");
        list.add("Om");
        list.add("Bro");

        Iterator<String> iterate = list.iterator();
        while(iterate.hasNext())
        {
            System.out.printf(iterate.next()+" \n");
        }
    }
}
