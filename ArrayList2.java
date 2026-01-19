import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList <String> names = new ArrayList<>();

        names.add("Sanji");
        names.add("Zoro");
        names.add("Luffy");

        System.out.println(names);
        System.out.print("Before clearing\n\n");
        names.clear();
        System.out.print("After clearing\n");
        System.out.println(names);
    }
}
