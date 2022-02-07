import java.util.ArrayList;
public class Runner
{
    public static void main(String[] args)
    {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(5);
        integers.add(24);
        System.out.println(integers);

        Integer num1 = new Integer(5);
        Integer num2 = 10;
        int num3 = 15;

        ArrayList<Integer> numList = new ArrayList<Integer>();

        numList.add(num1);
        numList.add(num2);
        numList.add(num3);

        int sum = num1 + num2 + num3;

        numList.add(sum);
        System.out.println(numList);

        ArrayList<String> letters = new ArrayList<String>();

        letters.add("A");
        letters.add("B");
        letters.add("C");
        System.out.println(letters);
        System.out.println(letters.size());
        letters.add(0, "D");
        System.out.println(letters);
        System.out.println(letters.size());
        letters.add(3, "E");
        System.out.println(letters);
        System.out.println(letters.size());
        letters.add(1, "F");
        letters.add(1, "G");
        letters.add(1, "H");
        System.out.println(letters);
        System.out.println(letters.size());
        System.out.println("-------------");
        letters.remove(2);
        System.out.println(letters);
        System.out.println(letters.size());
        letters.remove(3);
        System.out.println(letters);
        System.out.println(letters.size());
        letters.remove(0);
        letters.remove(1);
        System.out.println(letters);
        System.out.println(letters.size());
        System.out.println("-------------");

    }

}
