/*Kargapolov Igor 01.04.2022*/
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which task you want to start: \n" +
                "1 - Numbers and greetings.\n" +
                "2 - Vyacheslav guessing.\n" +
                "3 - Array elements, multiple of 3");
        int taskNumber = sc.nextInt();
        switch (taskNumber) {
            case (1):
                System.out.println("Enter the number: ");
                if (sc.nextInt() == 7) System.out.println("Hello!");;
                break;
            case (2):
                System.out.println("Enter the name, choose wisely, or Vyacheslav: ");
                String name = sc.next();
                System.out.println("Vyacheslav".equals(name) ? "Hello Vyacheslav!" : "Wrong name!");
                break;
            case (3):
                System.out.println("Array elements, multiple of 3 is: ");
                System.out.println(searchingForThree());
                break;
            default:
                System.out.println("Wrong choice!");
        }
    }

    public static String searchingForThree () {
        Random rnd = new Random();
        int[] intArray = new int[15];
        ArrayList<Integer> result = new ArrayList();
        for(int i = 0; i < intArray.length; i++) {
            intArray[i] = rnd.nextInt(30);
        }
        for (int j : intArray) if (j % 3 == 0) result.add(j);
        return result.toString();
    }

}
