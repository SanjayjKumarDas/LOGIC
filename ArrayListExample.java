package ArrayList;
import java.util.ArrayList;
import java.util.Iterator;
class ArrayListExample
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arr=new ArrayList<>();

        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(60);
        arr.add(70);
        arr.add(80);
        arr.add(90);
        arr.add(100);

        System.out.println("Here Ten Number Will Be Add to ArrayList \n");

        for (int num : arr)
        {

            System.out.println(num);
        }

        System.out.println(" Iterator Example...\n");

        Iterator<Integer> itr = arr.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }
}
