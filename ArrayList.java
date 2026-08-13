import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListExample {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
     ArrayList<Integer> list = new ArrayList<>();  

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        System.out.println("You entered:");
        for (int num : list) {
            System.out.println(num);
        }

        in.close();
    }
    
}
//list.add(10);
// list.add(20);
// list.add(30);
// list.get(0); // returns 10
// list.contains(20); // returns true
// list.set(0,100); // sets the first element to 100
